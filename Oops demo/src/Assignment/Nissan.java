package Assignment;

public class Nissan implements ITruck  {
protected int Axles;
protected double Weight;
public Nissan(int axles, double weight) {
	this.Axles = axles;
	this.Weight = weight;
}
@Override
public int getAxles() {
	// TODO Auto-generated method stub
	return this.Axles;
}
@Override
public double getweight() {
	// TODO Auto-generated method stub
	return this.Weight;
}


}
