package oopsdemo2;
class Staff
{
	private int empId;
    private String name;
    protected float salary,hra;
	public Staff(int empId, String name, float salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
    void getHRA()
    {
    	hra=(salary*60)/100;
    	System.out.println("HRA:"+hra);
    	//System.out.println("Gross Salary:"+(salary+hra));
    }
  
    void display()
    {
       System.out.println(empId+" "+name+" "+salary);
    }
    void print()
    {
    	System.out.println("Gross salary of Staff is:"+(salary+hra));
    }
} 
    //Staff------------->Manager
    class Manager extends Staff
    {
    	protected float da;
        private float gross;
		public Manager(int empId, String name, float salary) {
			super(empId,name,salary);
		}
		void getDA()
	    {
	        da=(salary*80)/100;
	        System.out.println("DA is : "+da);
	    }

	    void getGross()
	    {
	        gross= salary+hra+da;
	        System.out.println("Gross Salary of Manager is :"+gross);
	    }
    }
    //Staff----------->Director--------->Manager
		class Director extends Manager
		{
			protected float ta;
			private float gross;
			
			public Director(int empId, String   name, float salary ) {
				super(empId, name, salary);
				
			}
			void getTA()
		    {
		        ta=(salary*30)/100;
		        System.out.println("TA is :"+ta);
		    }

		    void getGross()
		    {
		        gross= salary+hra+da+ta;
		        System.out.println("Gross Salary of Director is :"+gross);
		    }
    	
    }
		//Staff------->Director-------->Manager----------->Founder
		class Founder extends Director
		{
            private float mra,gross;
			public Founder(int empId, String name, float salary) {
				super(empId, name, salary);
				// TODO Auto-generated constructor stub
			}
			void getmra()
			{
				mra=(salary*40)/100;
				System.out.println("MRA is:"+mra);
			}
			void getGross()
			{
				gross=salary+hra+da+ta+mra;
				System.out.println("Gross Salary of Founder is:"+gross);
			}
			
		}
public class Multilevel2 {

	public static void main(String[] args) {
		Director d1=new Director(101,"Keane",5000);

        System.out.println("*********** Director Details ***********");
        d1.display(); // staff  // staff
        d1.getHRA();
        d1.getDA();  // manager
        d1.getTA();  // director
        d1.getGross();  //director

        Manager m1=new Manager(201,"Mary",4000);

        System.out.println("*********** Manager Details ***********");
        m1.display();
        m1.getHRA();
        m1.getDA();
        m1.getGross();

        Staff s1=new Staff(301,"Helen",2000);
        System.out.println("*********** Staff Details ***********");
        s1.display();
        s1.getHRA();
        s1.print();
        
        Founder f1=new Founder(301,"Pavan",8000);
        System.out.println("**************Founder Details***************");
        f1.display();
        f1.getHRA();
        f1.getDA();
        f1.getTA();
        f1.getmra();
        f1.getGross();

	}

}
