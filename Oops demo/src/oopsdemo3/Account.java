package oopsdemo3;

public class Account {
	String name;
    protected double balance;
	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
	final void deposit(double amt) {//Final methods can not be overridden thats why we used Final key word
		 
        balance += amt;
        System.out.println("Depositing: " + amt);
 
    }
 
    void withdraw(double amt) {
 
        balance -= amt;
        System.out.println("WithDrawing: " + amt);
 
    }
}
