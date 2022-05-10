package oopsdemo3;

public class Circle implements IShape{

	private double radius;
//Generate Constructor using Fields
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		
		System.out.println("Drawing   Circle");
	
	}

	@Override
	public double getArea() {
		
		return Math.PI*this.radius*this.radius;
	}
//Generate getter() method for RADIUS

	public double getRadius() {
		return radius;
	}
	
}
