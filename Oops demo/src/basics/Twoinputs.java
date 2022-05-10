package basics;

import java.util.Scanner;

public class Twoinputs {

	public static void main(String[] args) {
		int a,b,sum,difference,product;
		float quotient;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of a");
		System.out.println("Enter the value of b");
		a = scan.nextInt();
		b = scan.nextInt();
		scan.close();
		sum = (a+b);
		difference = (a-b);
		product = (a*b);
		 quotient =(float)a/b;
		System.out.println("addition is:" +sum);
		System.out.println("subtraction is:"+difference);
		System.out.println("multiplication is:"+product);
		System.out.println("division is:"+quotient);


	}

}
