package Assignment;

import java.util.Scanner;

public class Solution{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	int input2;
	System.out.println("enter array elements");
	int[]array=new int[4];
	int n=2;
	for(int i=0;i<=n;i++) {
	
		array[i]=s.nextInt();
		
	}
	
	
	System.out.println("enter the balance amount");
	input2=s.nextInt();
	
	
	array[0]*=0.25;
	array[1]*=1;
	array[2]*=10;
	int sum=array[0]+array[1]+array[2];
	if(sum>input2) {
		int value=sum-input2;
		System.out.printf("(1,"+value+")");
	}
	else {
		System.out.printf("(0,"+sum+")");
	}
	
	}
}