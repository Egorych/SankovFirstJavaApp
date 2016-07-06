package Task7;

public class Task7 {

	public static void main(String[] args) {
		int sum=0;
		int[] arrayOfInt = {5, 34, 56, 4, 1, 43, 0, 32, 12, 10}; //create the array of type int;
		for(int i = 0; i<10; i++)
		{
			if(arrayOfInt[i] == 0) break;//if element == 0 we leave a cycle
			sum+=arrayOfInt[i];//summa = summa plus element
		}
		System.out.print("Summa = " + sum); //we print the sum of elements to the first zero
	}

}