package study.project;

public abstract class Person {
	
	public String name;
	public int age;
	public String gender;
	
	public Person() {
		super();
	}

	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Name=" + name + ",\nAge=" + age + ",\nGender=" + gender ;
	}
	
	

}
