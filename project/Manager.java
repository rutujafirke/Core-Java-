package study.project;

//here final is used so that it is not derived further
//no class can be derived from manager 
public final class Manager extends Employee {

	private int maxteamsize;

	public Manager() {


	}

	public Manager(String name, int age, String gender, int empid, String accountnumber, String role, double salary,int team) {
		super(name, age, gender, empid, accountnumber, role, salary);
		maxteamsize = team;

	}

	public int getMaxteamsize() {
		return maxteamsize;
	}

	public void setMaxteamsize(int maxteamsize) {
		this.maxteamsize = maxteamsize;
	}

	@Override
	public double cal_salary() {
		//System.out.println("Manager salary");
		double basic_salary = getSalary()+0.5*getSalary();
		double fixamount = 10000;
		double result = basic_salary+fixamount;
		return result;
	}
	public void gretaer()
	{
		System.out.println("000");
	}

	@Override
	public String toString() {
		return super.toString()+"\nMaximum teamsize=" + maxteamsize ;
	}







}
