package oopsdemo2;
//HAS-A relationship
public class AggregationDemo {

	public static void main(String[] args) {
		Address ad1=new Address("Bengaluru","Karnataka","INDIA",566106);
		Address ad2=new Address("Guntur","Andhra pradesh","INDIA",522657);
		
		Student s1=new Student(100,"Pavan",ad1);
		Student s2=new Student(103,"Raja",ad2);
		
		s1.display();
s2.display();
	}

}
