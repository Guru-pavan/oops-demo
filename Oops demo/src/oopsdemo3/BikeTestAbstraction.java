package oopsdemo3;

public class BikeTestAbstraction {

	public static void main(String[] args) {
		Bike obj=new Honda();//upcasting
		obj.run();
		obj.changeGear();

	}

}
