import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentIOOperation {

	List<Student> studentlist = new ArrayList<Student>();
	
	public static void WriteToFile(List<Student> students)
	{
		try {
			
			OutputStream fin = new FileOutputStream("D:\\IET\\Files\\students.db");
			ObjectOutputStream oop = new ObjectOutputStream(fin);
			for (Iterator iterator = students.iterator(); iterator.hasNext();)
			{
				Student student2 = (Student) iterator.next();
				oop.writeObject(student2);
				
			}
			oop.flush();
			oop.close();
		}catch(IOException e)
		{
			System.out.println(e);
		}
	}
	
	public static List<Student> ReadfromFile() throws StudentDBFileNotFound
	{
		List<Student> students = new ArrayList<Student>();
		ObjectInputStream obj = null;
		try
		{
			FileInputStream fin = new FileInputStream("D:\\IET\\Files\\students.db");
			obj = new ObjectInputStream(fin);
			while(fin.available()>0)
			{
				Student student = (Student)obj.readObject();
				students.add(student);
			}
		}catch(FileNotFoundException fe)
		{
			throw new StudentDBFileNotFound();
		}
		catch(IOException | ClassNotFoundException e)
		{
			System.out.println(e);
		}
		finally {
			try
			{
				if(obj!=null)
					obj.close();
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
		return students;
	}
}
