package part.one;

public class UsedCar extends Car {
	private double milage;

	public double getMilage() {
		return milage;
	}

	public void setMilage(double milage) {
		this.milage = milage;
	}

	public UsedCar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsedCar(String make, String model, int year, double price) {
		super(make, model, year, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "(UsedCar) milage=" + milage;
	}
	

}
