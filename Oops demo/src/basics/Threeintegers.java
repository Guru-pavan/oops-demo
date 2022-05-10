package basics;

import java.util.Scanner;

public class Threeintegers {

	public static void main(String[] args) {

		int a,b,c,temp,largest,smallest;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of a");
		a = scan.nextInt();
		System.out.println("Enter the value of b");
		b = scan.nextInt();
		System.out.println("Enter the value of c");
		c = scan.nextInt();
		scan.close();
		int sum = (a+b+c);
		int product = (a*b*c);
		float avg =(sum)/3;
		System.out.println("addition is:" +sum);
		System.out.println("multiplication is:"+product);
		System.out.println("division is:"+avg);
		 temp = a>b?a:b;
		 largest = c>temp?c:temp;
		 System.out.println("The largest number is:"+largest);
		 temp = a>b?a:b;
		 smallest = c<temp?c:temp;
		 System.out.println("The smallest number is:"+smallest);

	}

}





