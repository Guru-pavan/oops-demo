package Assignment;

import java.util.Scanner;

public class SavingsAccount {
 
	private double balance;
	private int rateofinterest;
	private int accountno;
	Scanner sc=new Scanner(System.in);
	public SavingsAccount()
	{
		System.out.println("Enter your Account Number");
		accountno=sc.nextInt();
		System.out.println("Enter Rate of interest");
		rateofinterest=sc.nextInt();
		System.out.println("Enter the balance");
		balance=sc.nextDouble();
	}
	public SavingsAccount(double balance, int rateofinterest, int accountno) {
		this.balance = balance;
		this.rateofinterest = rateofinterest;
		this.accountno = accountno;
	}
	public double getBalance() {
		return balance;
	}
	public int getRateofinterest() {
		return rateofinterest;
	}
	public int getAccountno() {
		return accountno;
	}
	void withdraw(double amount)
	{
	if(amount>balance)
	{
		System.out.println("Error");
	}
	else
	{
		balance-=amount;
		System.out.println("Successfully Withdrawn:"+amount);
	}
	}
	void calculateInterest()
	{
		System.out.println("Simple interest for one year is");
		double simpleinterest=(balance*rateofinterest*1);
		System.out.println("Simple Interest ");
	}
}
