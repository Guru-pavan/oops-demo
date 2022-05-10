package Assignment;

public class BMW implements ITruck {
	protected int Axles;
	protected double Weight;
	

	public BMW(int axles, double weight) {
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
