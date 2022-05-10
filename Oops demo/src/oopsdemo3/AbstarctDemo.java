package oopsdemo3;

public class AbstarctDemo {

	public static void main(String[] args) {
		Trainee t1=new Marks("Pavan","America",1005,90);//UPCASTING
t1.show();//invoke abstract base class method
double marks=t1.CalculateMarks();//invoke sub class method
System.out.println(t1+" "+marks);
	}

}
