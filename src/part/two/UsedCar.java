package part.two;

public class UsedCar extends Car {
	private double mileage;

	public double getMilage() {
		return mileage;
	}

	public void setMilage(double milage) {
		this.mileage = milage;
	}

		
	


	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return super.toString() + "(UsedCar) \t mileage: " + mileage;
	}
	
	

}
