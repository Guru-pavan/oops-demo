package basics;

import java.util.Scanner;

public class Rectanglearea {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Length");
		double length = scan.nextDouble();
		System.out.println("Enter Breadth");
		double breadth = scan.nextDouble();
		int area = ((int)(length*breadth));
		System.out.println("Area of Rectangle is:"+area);



	}

}
