package oopsdemo2;
/*
 * Program to implement simple inheritance
 */

public class AccountantTest {

	public static void main(String[] args) {
		Accountant ac1=new Accountant(201,"Gaurav Sharma","Process Salary of Employees","SAP");
		Accountant ac2=new Accountant(205,"Mary John","Payment to Vendors","Tally");
		ac1.print();
		ac2.print();
		

	}

}
