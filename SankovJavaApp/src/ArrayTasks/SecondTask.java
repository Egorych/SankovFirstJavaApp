package ArrayTasks;

import java.util.*;

public class SecondTask {

	public static void main(String[] args) {
		int[] arrayOfInt = { 5, 34, 56, 4, 1, 43, 55, 32, 12, 10 }; // create
																	// the array
																	// of type
																	// int;
		Arrays.sort(arrayOfInt);// sort array
		System.out.printf("Max value = %5d\t", arrayOfInt[9]);// print to the
																// screen max
																// element of
																// array
		System.out.printf("Min value = %5d", arrayOfInt[0]);//// print to the
															//// screen min
															//// element of
															//// array
	}

}