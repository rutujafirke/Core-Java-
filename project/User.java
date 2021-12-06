package study.project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		List<Person> person = new ArrayList<Person>();
		int choice = 0;
		while(choice !=3)
		{
			menu();
			System.out.println("What do you want?");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				Iterator<Person> iterator = person.iterator();
				while(iterator.hasNext())
				{
					System.out.println(" ");
					System.out.println(iterator.next());
				}
				break;
				
			case 2:
				Acceptmanager(person, sc);
				break;
				
			case 3:
				System.out.println("Program Terminated!!!");
				break;
			}
		}


	}

	

	private static void menu() {
		// TODO Auto-generated method stub
		System.out.println("Enter the details");
		System.out.println("Press 1.Show all Details Enter");
		System.out.println("Press 2.Accept User Information");
		System.out.println("Press 3.Exit");


	}
	
	private static void Acceptmanager(List<Person>person,Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Employee Name:");
		String name = sc.next();
		System.out.println("Enter Employee Id:");
		int id = sc.nextInt();
		System.out.println("Enter the Gender:");
		String gender =sc.next();
		System.out.println("Enter the age:");
		int age = sc.nextInt();
		System.out.println("Enter Accountnumber:");
		String acc=sc.next();
		System.out.println("Enter your role:");
		String role = sc.next().toLowerCase();
		if(role.equals("manager"))
		{
			System.out.println("Enter the Salary:");
			double sal = sc.nextDouble();
			System.out.println("Enter the size of team members");
			int team = sc.nextInt();
			Employee manager = new Manager(name,age,gender,id,acc,"Manager",sal,team);
			person.add(manager);
		}
		else if(role.equals("developer"))
		{
			System.out.println("Enter the Salary:");
			double sal = sc.nextDouble();
			System.out.println("Enter the Lines of Code:");
			int team = sc.nextInt();
			
			Employee developer = new Developer(name,age,gender,id,acc,role,sal,team);
			person.add(developer);
		}
		
		else if(role.equals("qa"))
		{
			System.out.println("Enter the Salary:");
			double sal = sc.nextDouble();
			System.out.println("Enter the testcase:");
			int team = sc.nextInt();
			
			Employee qa = new QA(name,age,gender,id,acc,role,sal,team);
			person.add(qa);
		}
		else
		{
			System.out.println("Enter role is invalis in our database!!!!!!!!!");
		}
		
		
	}


}
