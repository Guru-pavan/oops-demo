package oopsdemo3;

public abstract class Bike {
	//default constructor or implicit constructor
	public Bike() {
		// TODO Auto-generated constructor stub
	System.out.println("bike is created");
	}
	abstract void run();//abstract method
		void changeGear() {
			System.out.println("gear changer");
		}
	}
	class Honda extends Bike{

		@Override
		void run() {
			// TODO Auto-generated method stub
			System.out.println("honda bike is runninggg.....");
		}
		
	}