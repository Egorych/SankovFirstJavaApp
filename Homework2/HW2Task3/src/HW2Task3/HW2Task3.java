package HW2Task3;

import java.util.Random;
import java.util.Scanner;

public class HW2Task3 {

	public static void main(String[] args) {
		int[] listOfInitialization = {1,2,3,4,4,5,3,3,2,1,2,3,6}; //list of initialization
		
		int[] inputFromKeypad = new int[5]; //input from keypad
		Scanner elementOfArray = new Scanner(System.in);//create object Scanner
		System.out.println("Insert array elements:");
		for (int i = 0; i < 5; i++)
		{
			inputFromKeypad[i] =  elementOfArray.nextInt();//appropriate into the array the values which entered from the keyboard      
		}
		for (int i = 0; i < 5; i++)
		{
			System.out.print(inputFromKeypad[i]+" "); ////print to the screen the elements of array
		}
		
		int[] arrayRandom = new int[10]; //create the array of type int;
		Random rand = new Random();//create object of type Random
		System.out.println();
		for (int i=0; i<10; i++)
		{
			arrayRandom[i]= rand.nextInt(100); //fill the array
		}
		for (int i = 0; i < 10; i++)
		{
			System.out.print(arrayRandom[i]+" "); //print to the screen the elements of array
		}
	}

}
