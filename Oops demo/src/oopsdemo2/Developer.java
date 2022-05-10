package oopsdemo2;
//child class - Inheritance -is a relationship

public class Developer extends Employee {
	String technology;
	public Developer(int empId, String name,String tech) {
		super(empId, name);//Calls base class Employee Constructor
		this.technology=tech;
	}

	void display1()
    {
        System.out.println("Technology Used: "+technology);
    }
	public static void main(String[] args) {
		

	}

}
