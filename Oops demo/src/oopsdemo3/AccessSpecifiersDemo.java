package oopsdemo3;

import oopsdemo1.Bicycle;

class Test
{
	int a; // default variable
    private int b; // private variable
    protected int c; // accessed in sub class
    public int d;
    public Test(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        d=500;
    }
 
    public void display()  // public method
    {
        System.out.println("Private Variable:"+b);
    }
}
class Test2 extends Test{

	public Test2(int a, int b, int c) {
		super(a, b, c);
	}
	 public void display()  // public method
	    {
	        System.out.println("Protected Variable:"+c);
	    }
void print()//Default Method
{
	System.out.println("Hello from Defaulut method");
}
	}
public class AccessSpecifiersDemo {

	public static void main(String[] args) {
		Test t1=new Test(100,200,300);
        t1.display();
        // t1.b=50; compiler error. cannot access private variable
        System.out.println("Defaut Variable :"+t1.a);
        Test t2=new Test(100,200,300);
        t2.display();
		
Bicycle sportsbicycle=new Bicycle();
////Access Public Method of oopsdemo1
sportsbicycle.startCycling();

	}

}
