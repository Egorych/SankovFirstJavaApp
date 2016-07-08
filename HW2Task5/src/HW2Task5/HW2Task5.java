package HW2Task5;

import java.util.Random;

public class HW2Task5 {

	public static void main(String[] args) {
		int min, index=0;
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
		min = arrayRandom[0]; //we appropriate to an element under an index 0 the minimum value
		for(int i=0; i<15; i++)
		{
			if(min>arrayRandom[i])
			{
				min = arrayRandom[i]; //if true we remember the minimum element
				index=i;//and remember index of minimum element
			}
		}
		System.out.println("\nMin element: " + min);//print to the screen the value of minimum element of array
		System.out.print("Index: " + index);//print to the screen the index of minimum element of array
	}

}
