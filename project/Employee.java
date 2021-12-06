package study.project;

public abstract  class Employee extends Person{
	
	
	private  int empid;
	private String accountnumber;
	private String role;
	private double basicsalary;
	
	public Employee() {
		
	}
	
	public Employee(String name, int age, String gender,int empid, String accountnumber, String role, double salary) {
		super(name,age,gender);
		this.empid = empid;
		this.accountnumber = accountnumber;
		this.role = role;
		this.basicsalary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public double getSalary() {
		return basicsalary;
	}

	public void setSalary(double salary) {
		this.basicsalary = salary;
	}

	public final void pay_salary()
	{
		System.out.println(cal_salary());
	}
	
	public  abstract double cal_salary();
	
	@Override
	public String toString() {
		return super.toString()+"\nEmpid=" + empid + ",\nAccountnumber=" + accountnumber + ", Role=" + role + ", Basicsalary="
				+ basicsalary +"\nCalculated Salary="+cal_salary();
	}

	
	
	
	
	
}
