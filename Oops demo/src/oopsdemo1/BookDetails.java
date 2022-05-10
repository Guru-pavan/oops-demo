package oopsdemo1;

import java.util.Scanner;

class Book{
	private String BookName,Author;
	private int bookId,price,discount;
	Scanner s=new Scanner(System.in);
	public void inputBookDetails() {
		System.out.println("enter the book name : ");
		BookName=s.nextLine();
		System.out.println("enter the book author name : ");
		Author=s.next();
		System.out.println("enter the book Id : ");
		bookId=s.nextInt();
		System.out.println("enter the book price : ");
		price=s.nextInt();
		System.out.println("Enter the book discount:");
	}
	float discountprice()
	{
		return ((this.price)-(this.price*.10f));
	}
	public void DisplayDetails() {
		System.out.println("the book name is "+BookName);
		System.out.println("the author of the book is "+Author);
		System.out.println("the Id of the book is "+bookId);
		System.out.println("the price of the book is "+price);
		System.out.println("the discount given for the book and final price  is:"+discountprice());
	}
}

public class BookDetails {

	public static void main(String[] args) {
	Book b1=new Book();
	Book b2=new Book();
	Book b3=new Book();
	
	b1.inputBookDetails();
	b1.DisplayDetails();
	
	b2.inputBookDetails();
	b2.DisplayDetails();
	
	b3.inputBookDetails();
	b3.DisplayDetails();
	

	}

}
