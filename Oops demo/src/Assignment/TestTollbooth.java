package Assignment;

public class TestTollbooth {

	public static void main(String[] args) {



		ITollbooth booth = new Mytollbooth();

		ITruck Tatatruck = new Tatatruck(5, 12000); // 5 axles and 12000 kilograms
		ITruck BMW = new BMW(2, 5000); // 2 axles and 5000kg
		ITruck Nissan = new Nissan(6, 17000); // ….

		booth.calculateTollDue(Tatatruck);
		booth.calculateTollDue(BMW);
		booth.calculateTollDue(Nissan);
		booth.displaydata();


	}


}


