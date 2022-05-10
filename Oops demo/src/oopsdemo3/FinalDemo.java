package oopsdemo3;

public class FinalDemo {
	final class Hello
	{
	    final void display()
	    {
	        System.out.println("This is a final Method");
	    }
	}
	 
	/*class World extends Hello  // final classes cannot be extended
	{
	    // final methods cannot be overridden
	    /*final void display()  
	    {
	        System.out.println("This is a final Method");
	    } 
	} */
	public static void main(String[] args) {
		final int age=20;
		final double pi=3.14;
	
	}

}
