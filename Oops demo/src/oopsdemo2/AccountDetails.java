package oopsdemo2;

public class AccountDetails extends SavingsBank {
int Withdrawl,deposit,finalbalance;
	public AccountDetails(int accNo, String name, int mb, int b,int w,int d) {
		
		super(accNo, name, mb, b);
		this.Withdrawl=w;
		this.deposit=d;
		// TODO Auto-generated constructor stub
	}
	void display()
	{
	    super.display(); // invokes savings bank display()method
        System.out.println ("Deposit: "+deposit);
        System.out.println ("Withdrawals: "+Withdrawl);
        finalbalance=(balance+deposit)-Withdrawl;
        System.out.println("Final Balance:" + finalbalance);
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
