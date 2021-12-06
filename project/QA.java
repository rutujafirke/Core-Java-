package study.project;

public class QA extends Employee{
	
	private int nooftestcase;

	public QA() {
		
	}


	public QA(String name, int age, String gender, int empid, String accountnumber, String role, double salary,int testcase) {
		super(name, age, gender, empid, accountnumber, role, salary);
		
		nooftestcase = testcase;
	}

	public int getNooftestcase() {
		return nooftestcase;
	}

	public void setNooftestcase(int nooftestcase) {
		this.nooftestcase = nooftestcase;
	}

	@Override
	public double cal_salary() {
		
		double basic_salary = getSalary()+0.2*getSalary();
		double fixamount = 8000;
		double result = basic_salary+fixamount+10*nooftestcase;
		return result;
		
	}

	public void dowork()
	{
		System.out.println("QA Work");
	}

	@Override
	public String toString() {
		return super.toString()+"\nNo of testcase=" + nooftestcase ;
	}
	
	
}
