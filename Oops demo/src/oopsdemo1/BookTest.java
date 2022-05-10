package oopsdemo1;

public class BookTest {

	public static void main(String[] args) {
		Bookshop b1=new Bookshop();
		b1.setBookId(101);
		b1.setBookName("Programming in C");
		b1.setPrice(400);
		b1.setPublisher("pavan");
		System.out.println(b1.getBookId()+" "+b1.getBookName()+" "+b1.getPrice()+" "+b1.getPublisher());
		System.out.println("Discounted Price of book :"+b1.discountPrice());
		Bookshop b2=new Bookshop();
		b2.setBookId(101);
		b2.setBookName("Programming in C");
		b2.setPrice(400);
		b2.setPublisher("pavan");
		System.out.println(b2.getBookId()+" "+b2.getBookName()+" "+b2.getPrice()+" "+b2.getPublisher());
		System.out.println("Discounted Price of book :"+b2.discountPrice());
		

	}

}
