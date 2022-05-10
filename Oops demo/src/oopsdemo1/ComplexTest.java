package oopsdemo1;

public class ComplexTest {

	public static void main(String[] args) {
		Complex c1=new Complex(10.3,76.9);//INVOKES Constructor
		Complex c2=new Complex(20.9,43.7);//INVOKES Constructor
		c1.add(c2);//Calls method add() by passing object c2
		//c3=c1+c2;
		System.out.println("The addition of 2 Complex number is:");
		c1.display();

	}

}
