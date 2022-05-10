package oopsdemo1;

public class TimeTest {

	public static void main(String[] args) {
		Time t1=new Time(21,5,33,24);
		Time t2=new Time(5,18,56,41);
		
				
	t1.add(t2);
System.out.println("The Addition of 2 Times is");
t1.display();
	}
}


