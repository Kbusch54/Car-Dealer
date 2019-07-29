package part.two;

import java.util.ArrayList;

import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Grand Circus Motors admin console!");

		ArrayList<Car> cars = new ArrayList<>();

		Scanner scan = new Scanner(System.in);

		cars.add(new Car("Ford", "F-150", 2017, 54675.43));
		cars.add(new Car("Chevy", "Cruz", 2019, 36699.99));
		cars.add(new Car("Dodge", "Challenger", 2009, 48899.98));

		cars.add(new UsedCar("Ford", "Escape", 2006, 20000, 60032.2));
		cars.add(new UsedCar("Caddilac", "Escalade", 2004, 35889.99, 89000.54));
		cars.add(new UsedCar("Mercedes", "Cls", 1998, 27971.21, 102492.48));
		boolean loop = true;
		while (loop) {
			int i=1;

			System.out.println("Current Inventory");

			for (Car car : cars) {

				System.out.println((i++)+". "+car);
			}
			System.out.println("Do you want to buy a car? Choose a number");
			System.out.println("Press 9 to  exit");
			int x = scan.nextInt();
			if (x == 9) {
				loop = false;
			} else {
				System.out.println(cars.get(x - 1));
				scan.nextLine();
			}
			System.out.println("Would you like this car? (Y/N)");
			String cont = scan.nextLine();
			if (cont.equalsIgnoreCase("y")) {
				cars.remove(x - 1);
				loop = true;
				System.out.println("thank you for your bussines");
			} else {
				loop = false;
			}

		}
		scan.close();
		System.out.println("Thanks have a great day!");
	}
}
