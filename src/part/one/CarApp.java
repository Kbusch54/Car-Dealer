package part.one;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Grand Circus Motors admin console!");

		ArrayList<Car> carLot = new ArrayList<>();

		String userMake;
		String userModel;
		int userYear;
		double userPrice;
		Scanner scan = new Scanner(System.in);

		int z;
		int i = 1;
		System.out.println("How many cars are you entering: ");
		z = scan.nextInt();
		while (i <= z) {
			int x = i;

			scan.nextLine();
			System.out.println("Enter Car " + x + " make: ");
			userMake = scan.nextLine();

			System.out.println("Enter Car " + x + " model: ");
			userModel = scan.nextLine();

			System.out.println("Enter Car " + x + " year: ");
			userYear = scan.nextInt();

			System.out.println("Enter Car " + x + " price: ");
			userPrice = scan.nextDouble();

			i++;
			carLot.add(new Car(userMake, userModel, userYear, userPrice));
		}

		System.out.println("Current Inventory");
		for (Car car : carLot) {

			System.out.println(car);
		}
		

		scan.close();
	}

}
