package Task8;

public class Task8 {

	public static void main(String[] args) {
		int multiplication=1;
		int[] arrayOfInt = {5,4,8,1,5,6,0,4,5,2}; //create the array of type int;
		for(int i = 0; i<10; i++)
		{
			if(arrayOfInt[i] == 0) break;//if element == 0 we leave a cycle
			multiplication*=arrayOfInt[i];//multiplication = multiplication * element
		}
		System.out.print("Multiplication = " + multiplication); //we print the multiplication of elements to the first zero
	}

}
