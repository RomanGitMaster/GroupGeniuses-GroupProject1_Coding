package coding;

public class Task11 {

	public static void main(String[] args) {
		// #11 Write a program to print out duplicate elements from an Array of Strings?

		String[] cars = { "Mercedes", "Toyota", "Ford", "Subaru", "Ford", "Tesla", "Honda", "Toyota" };
		System.out.println("Duplicates: ");

		for (int i = 0; i < cars.length - 1; i++) {
			for (int a = i + 1; a < cars.length; a++) {
				if (cars[i].equals(cars[a])) {
					System.out.println(cars[i]);
				}
			}
		}

	}

}
