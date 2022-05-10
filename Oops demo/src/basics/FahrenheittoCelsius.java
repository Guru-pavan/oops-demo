package basics;

import java.util.Scanner;

public class FahrenheittoCelsius {

	public static void main(String[] args) {
		float Fahrenhiet,Celsius;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the value in F");
		float F = scan.nextFloat();
		scan.close();
		 Celsius  = ((F-32)*5)/9; 
		System.out.println("Temperature in Celsius:" +Celsius);


	}

}
