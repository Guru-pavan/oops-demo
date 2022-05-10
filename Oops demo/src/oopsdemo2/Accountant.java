package oopsdemo2;
//child class derived from Employee parent class
public class Accountant extends Employee {
String task,tech;

	public Accountant(int empId, String name,String t1,String t2) {
		super(empId, name);
		this.task=t1;
		this.tech=t2;
		
	}
	void print()
	{
		super.display();//invokes Employee base class() display method
		System.out.println("Accountant task is to do:"+task);
		System.out.println("SoftWares used:"+tech);
	}

	public static void main(String[] args) {
		

	}

}
