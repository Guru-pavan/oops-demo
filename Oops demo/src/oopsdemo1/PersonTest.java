package oopsdemo1;

public class PersonTest {

	public static void main(String[] args) {
		Person objPerson1=new Person(); // invoke implicit constructor

        objPerson1.input();
        objPerson1.print();
        System.out.println("-------------------------------------");
        Person objPerson2=new Person("Mike",45); // invokes constructor with 2 args

        objPerson2.input();
        System.out.println("-------------------------------------");
        Person objPerson3=new Person("Ravi","Delhi",60); // invokes constructor with 3 args

        objPerson3.print();
	}

}
