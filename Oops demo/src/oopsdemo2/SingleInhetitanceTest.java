package oopsdemo2;
//Parent Class or Base class or Super Class
class Animal
{
	String Name;//Properties
	public void eat()//Method
	{
		System.out.println("Every Animal will eat");
	}
}
//Inherits Animal Class or Parent Class
class Dog extends Animal//Sub class or Derived class
{
	public void display()
	{
		System.out.println("My Name is:"+Name);
	}
}
public class SingleInhetitanceTest {

	public static void main(String[] args) {
		// Create and intialize object of sub class
		Dog Labordor=new Dog();
		//call property from Parent Class
		Labordor.Name="Puppy";
		//call method of derived class
		Labordor.display();
//call method of super class using derived object
		Labordor.eat();
	}

}
