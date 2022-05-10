package Assignment;
import java.util.Scanner;
public class Area{
	private float length;
	private float breadth;
	Scanner sc=new Scanner(System.in);
	
	
	void getDimensions() {
		System.out.println("Enter the length of rectangle:");
		length=sc.nextFloat();
		System.out.println("Enter the breadth of the rectangle");
		breadth = sc.nextFloat();
	}
	public float area()
	
	{
		float area=length*breadth;
		return area;
	}

	
}


	
	