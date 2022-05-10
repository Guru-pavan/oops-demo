package oopsdemo1;
//Program to add TWO Complex Numbers
public class Complex {
	double real;
	double imaginary;
	public Complex(double real, double imaginary) {//Parameterized Constructor
		this.real = real;
		this.imaginary = imaginary;
	}
	
	void add(Complex obj) // method which accepts object as an argument
    {
		//c1.real+=c2.real
       this.real+=obj.real;
       //c1.imaginary+=c2.imaginary
       this.imaginary+=obj.imaginary;
    }

    void display()
    {
        //System.out.println("The Addition of 2 Complex Numbers is :");
        System.out.println("r"+this.real+" + i"+this.imaginary);
    }
	


}
