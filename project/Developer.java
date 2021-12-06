package study.project;

public class Developer  extends Employee{
	
	private int linesofcode;

	public Developer() {
		super();
		
	}

	
	public Developer(String name, int age, String gender, int empid, String accountnumber, String role, double salary,int loc) {
		super(name, age, gender, empid, accountnumber, role, salary);
		
		linesofcode =loc;
	}


	public int getLinesofcode() {
		return linesofcode;
	}


	public void setLinesofcode(int linesofcode) {
		this.linesofcode = linesofcode;
	}
	
	@Override
	public double cal_salary() {
		
		double basic_salary = getSalary()+0.25*getSalary();
		double fixamount = 8000;
		double result = basic_salary+fixamount+2*linesofcode;
		return result;
		
	}
	public void dowork()
	{
		System.out.println("Developer Work");
	}

	@Override
	public String toString() {
		return super.toString()+"\nLines of code=" + linesofcode ;
	}


	
	

}
