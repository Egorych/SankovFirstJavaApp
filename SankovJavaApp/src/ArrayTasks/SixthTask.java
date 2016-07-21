package ArrayTasks;

import java.util.Random;

public class SixthTask {

	public static void main(String[] args) {
		int negativeNumberCount = 0;
		int[] arrayRandom = new int[10]; // create the array of type int;
		Random rand = new Random();// create object of type Random
		for (int i = 0; i < 10; i++) {
			arrayRandom[i] = rand.nextInt(); // fill the array
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(arrayRandom[i] + " "); // print to the screen the
													// elements of array
			if (arrayRandom[i] < 0)
				negativeNumberCount += 1; // if in the array there is a negative
											// number, count +1
		}
		System.out.print("\nQuantity of negative elements = " + negativeNumberCount); // print
																						// to
																						// the
																						// screen
																						// quantity
																						// of
																						// negative
																						// elements
																						// in
																						// array
	}

}
