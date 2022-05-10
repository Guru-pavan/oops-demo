package oopsdemo2;

class Bank{
	int getRateofInterest(){
		return 0;
	}
	void display() {
		System.out.println("welcome to demo ");
	}
}
class SBI extends Bank{
	int getRateofInterest() {//overridden method
		return 5;
	}
}
class ICICI extends Bank{
	int getRateofInterest() {
		return 7;
	}
}
class AXIS extends Bank{
	int getRateofInterest() {
		return 6;
	}
}
public class OverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SBI b1=new SBI();
ICICI b2=new ICICI();
AXIS b3=new AXIS();
b1.display();
System.out.println("the interest rate of sbi is : "+b1.getRateofInterest());
b2.display();
System.out.println("the interest rate of icici is : "+b2.getRateofInterest());
b3.display();
System.out.println("the interest rate of axis is : "+b3.getRateofInterest());
	}

}