package exceptionsDemo;

import java.util.Scanner;

public class DivisionDemo {

	public static void main(String[] args) {
		 int a, b, result;
         Scanner input = new Scanner(System.in);

          System.out.println("Input two integers");
          a = input.nextInt();
          b = input.nextInt();  // enter 0
          
          try//statements to be monitored which may throw exception
          {
        	  result = a/b;
        	  System.out.println("Result is ="+result);
          }
          catch(ArithmeticException e)// Exception thrown is handled in catch block
          {
        	  System.out.println("Divide by Zero Error-Enter Non Zero value");
        	  System.out.println("Exception Description :"+e.getMessage());
        	  System.out.println("Exception Name & description:"+e.toString());
       // Details about Exception Name,Description,Line number of code which generated Exception  
        	  e.printStackTrace();
          }
           finally//Clean up Operations
           {
        	   input.close();
        	   System.out.println("In Finally Block-Program Execution ended");
           }
         result = a / b;  //  JRE Throws Arithmetic exception

         System.out.println("Result = " + result);
         input.close();

	}

}
