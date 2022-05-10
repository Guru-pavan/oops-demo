package basics;
/*
 * Ternary operator is the conditional operator that takes three operands.
 * It is used in place of if-else.
 * Syntax: variable= expr 1 ? expr 2 : expr 3 
 */
//programm to find maximum of two numbers.
public class TernaryDemo {

	public static void main(String[] args)
	{
	int a=10,b=20,max;
	System.out.println("First number :"+a);
	System.out.println("Second number :"+b);
	max = (a>b)?a:b;//Ternary operator
	String msg=(a>b)?"A is greatest":"B is greatest";
	System.out.println("The Maximum of two numbers is :"+max);
	System.out.println("the maximum of two numbers is :"+max);
	

	}

}
