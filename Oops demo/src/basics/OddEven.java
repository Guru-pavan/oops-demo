package basics;

import java.util.Scanner;

/*
 * To find OddEven number using Modulus operator and if else 
 */
public class OddEven {

	public static void main(String[] args) 
	{
		int a;

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number :");
		a=scan.nextInt();
		scan.close();
		if(a %2 == 0)
		{
			System.out.println("The given number is even number");
		}
		else
		{
			System.out.println("The given number is odd number");
		}


		
	}

}
