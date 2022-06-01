package coding;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// #1. Using Scanner create an array of integer values. After the array is
				// created, calculate the sum of all stored
				// elements in that array.
				Scanner input = new Scanner(System.in);
				int[] set = new int[5];

				int sum = 0;
				for (int i = 0; i < set.length; i++) {
					System.out.println("Enter Value");
					set[i] = input.nextInt();
					sum += set[i];
				}
				System.out.println("The sum of all numbers in array is " + sum);
		        input.close();

	}

}
