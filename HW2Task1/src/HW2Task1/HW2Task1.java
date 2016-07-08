package HW2Task1;
import java.util.*;
public class HW2Task1 {

	public static void main(String[] args) {
		float[] arrayOfFloat = new float[10]; //create the array of type float;
		Random rand = new Random();//create object of type Random
		float count = 0;// counter
		for(int i=0; i<10; i++)
		{
			arrayOfFloat[i]= rand.nextFloat(); //fill the array
			count += arrayOfFloat[i]; //counter plus element of array
			System.out.print(arrayOfFloat[i] + " | "); //print to the screen the elements of array
		}
		float averageValue = (float) count / 10; //arithmetic average
		System.out.printf("\naverage value = " + averageValue); //print to the screen average value
	}

}