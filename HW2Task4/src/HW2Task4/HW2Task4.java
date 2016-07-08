package HW2Task4;

import java.util.Arrays;
import java.util.Random;

public class HW2Task4 {

	public static void main(String[] args) {
		
		int max, index=0;
		int[] arrayRandom = new int[15]; //create the array of type int;
		Random rand = new Random();//create object of type Random
		for (int i=0; i<15; i++)
		{
			arrayRandom[i]= rand.nextInt(100); //fill the array
		}
		for (int i = 0; i < 15; i++)
		{
			System.out.print(arrayRandom[i]+" "); //print to the screen the elements of array
		}
		max = arrayRandom[0]; //we appropriate to an element under an index 0 the maximum value
		for(int i=0; i<15; i++)
		{
			if(max<arrayRandom[i])
			{
				max = arrayRandom[i]; //if true we remember the maximum element
				index=i;//and remember index of maximum element
			}
		}
		System.out.println("\nMax element: " + max);//print to the screen the value of maximum element of array
		System.out.print("Index: " + index);//print to the screen the index of maximum element of array
	}

}
