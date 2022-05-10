package basics;

import java.util.Scanner;

public class Fordemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i,N;
		System.out.println("enter n value: ");
		N=s.nextInt();
	/*	for(i=0;i<=N;i++) {
			System.out.println(i);
		}*/
		for(i=55;i>=N;i--) {
			System.out.println(i);
		}
	}

}