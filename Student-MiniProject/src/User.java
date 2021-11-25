

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class User {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Student> students = null;
		try {
			students = StudentIOOperation.ReadfromFile();
		} catch (StudentDBFileNotFound e) {
			System.out.println("File not found");
			students = new ArrayList<Student>();
		}
		
		boolean flag=true;
		while(flag)
		{
			menu();
			System.out.println("What do you want?");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 0:
				Iterator<Student> iterator = students.iterator();
				while(iterator.hasNext())
				{
					System.out.println(iterator.next());
				}
				break;
				
			case 1:
				AddStudent(students,sc);
				break;

			case 2:
				AddStudentNameAge(students, sc);
				break;

			case 3:
				SearchStudentByName(students,sc);
				break;

			case 4:
				RemoveStudents(students,sc);
				break;
				
			case 5:
				students.removeAll(students);
				break;
				
			case 6:
				flag=false;
				break;
				
			case 7:
				StudentIOOperation. WriteToFile(students);
				
				System.out.println("Data added successfully");
				flag=false;
				break;
				
			}
		}
	}


	private static void menu() {
		// TODO Auto-generated method stub
		System.out.println("Press 0 Show Students");
		System.out.println("Press 1 Add Student");
		System.out.println("Press 2 Add Students without Marks");
		System.out.println("Press 3 Search Student");
		System.out.println("Press 4 Remove Student");
		System.out.println("Press 5 Remove All Students");
		System.out.println("Press 6 Exit Without Save");
		System.out.println("Press 7 Exit With Save");
		

	}

	private static void AddStudent(List<Student> students, Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Enter Student Name:");
		String name = sc.next();
		System.out.println("Enter Age:");
		int age = sc.nextInt();
		System.out.println("Enter how many subject marks");
		int n=sc.nextInt();
		int [] m = new int[n];
		for(int i=0;i<m.length;i++)
		{
			System.out.print("Enter marksfor subject "+(i+1));
			m[i] = sc.nextInt();
		}
		Student information = new Student(name, age,m);
		students.add(information);

	}

	private static void AddStudentNameAge(List<Student> students, Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Enter Student Name:");
		String name = sc.next();
		System.out.println("Enter Age:");
		int age = sc.nextInt();
		Student information = new Student(name, age);
		students.add(information);

	}

	private static void SearchStudentByName(List<Student> students,Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Enter student name to be searched:");
		String name = sc.next();
		for(Student details:students)
		{
			if(details.getName().contains(name))
			{
				System.out.println(details);
			}
		}


	}

	private static void RemoveStudents(List<Student> students, Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Enter name:");
		String name=sc.next();
		for(Student details:students)
		{
			if(details.getName().contains(name))
			{
				students.remove(details);
			}
		}
		
	}

}
