package basics;

import java.util.Scanner;

public class RobertMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Subject 1 marks:");
		int m1=sc.nextInt();
		System.out.println("Enter subject 2 marks:");
		int m2 = sc.nextInt();
		System.out.println("Enter subject 3 marks:");
		int m3 = sc.nextInt();
		int totalMarks = m1+m2+m3;
		System.out.println("Total marks:"+totalMarks);
		float avgMarks = ((m1+m2+m3)/3);
		System.out.println("Average marks:"+avgMarks);


	}

}
  