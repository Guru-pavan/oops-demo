package basics;

import java.util.Scanner;

/*
 * To perform arithmetic operations using switch case
 */

public class Switchdemo {

	public static void main(String[] args) 
	{
		int a,b,res;

		String op;

		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 numbers :");
		a=s.nextInt();
        b=s.nextInt();
        System.out.println("Enter Operator :"); // +, -, *, /
        op=s.next();
        s.close();
        switch(op)
        {
        case "+": res=a+b;
        System.out.println("The addition is"+res);
        break;        
          
	case "-": res=a-b;
        System.out.println("The subtarction is"+res);
        break;
	case "*": res=a*b;
	System.out.println("The multiplication is"+res);
	break;
	case "/": res=a/b;
	System.out.println("The division is"+res);
	break;

	}
	}
	}
