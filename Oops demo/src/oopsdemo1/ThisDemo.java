package oopsdemo1;
//INSTANCE CLASS

public class ThisDemo {
	int age;
	//Instance method
	//this key word is used in instance method to access object
	void init(int age)
	{
		this.age=age;//THIS key word refers to the current object Which invokes the method
	}

	public static void main(String[] args) {
		ThisDemo td1=new ThisDemo();
		td1.init(20);
		System.out.println("The value of age is :"+td1.age);
		

	}

}
