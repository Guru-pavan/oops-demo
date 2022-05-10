package oopsdemo3;

public interface IShape {

	 //implicitly public, static and final
    public String LABLE="Shape";//PUBLIC STRING STATIC FINAL

    //interface methods are implicitly abstract and public
    void draw();

    public abstract double getArea();// no need to mention public abstract because by default 
}
