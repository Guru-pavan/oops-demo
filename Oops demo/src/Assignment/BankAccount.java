package Assignment;

import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {
		SavingsAccount s1=new SavingsAccount();
		s1.withdraw(6000);
		s1.calculateInterest();
		System.out.println("----------------------------------------------------------------");
		SavingsAccount s3=new SavingsAccount(50000,3,1000000);
		s3.withdraw(10000);
		s3.calculateInterest();
		
		}
}