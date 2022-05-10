package oopsdemo2;

public class JavaCandidate extends Candidate {
	String Tech;
	private double perks;

	public JavaCandidate(int id, String name, double salary,String t) {
		super(id, name, salary);
		this.Tech=t;
	}	
		void getperks()
		{
	perks=salary*0.5;
System.out.println("perks of JavaCAndidate:"+perks);
		}
		void display()
		{
			super.dsiplay();
			System.out.println("tech");
		}
	}


