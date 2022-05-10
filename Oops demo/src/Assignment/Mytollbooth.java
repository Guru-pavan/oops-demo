package Assignment;

public class Mytollbooth implements ITollbooth {
static int TotalTrucks=0;
static double TotalReceipts=0;
ITruck tc;
	@Override
	public void calculateTollDue(ITruck tc) {
		double due=0;
		due += (tc.getAxles()*5);
		due +=((tc.getweight()/1000)*20);
		System.out.println("Truck has Arrived");
		System.out.println("Welcome to Navallur Tollbooth");
		System.out.println("Total no of Axles are:"+tc.getAxles());
		System.out.println("Total weight of the Truck is:"+tc.getweight());
		System.out.println("****************************");
		System.out.println("The total due of the present truck is:"+due);
		System.out.println("***********************************");
		System.out.println();
		TotalTrucks+=1;
		TotalReceipts+=due;
	}

	@Override
	public void displaydata() {
		System.out.println("************Collecting Total Receipts of the day***************");
		System.out.println("Total trucks arrived:"+TotalTrucks);
		System.out.println("Total amount Received:"+TotalReceipts);
		System.out.println("******************************");
				TotalTrucks+=0;
				TotalReceipts+=0;
		
		
	}

}
