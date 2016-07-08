package Task9;

public class Task9 {

	public static void main(String[] args) {
		int[] arrayOfInt = {0, 0, 0, 4, 9, 43, 10, 0, 12, 0}; //create the array of type int;
		int size=10, i, j=0;
		for( i = 0; i<size-1; i++)
		{
			if(arrayOfInt[i] == 0)// condition if element = 0
			{
				for(j=i; j<size-1; j++)
				{
					arrayOfInt[j]=arrayOfInt[j+1];//move elements to the left
				}
				arrayOfInt[size-1]=0;//write zero in the end of the array
				size--;//reduce the size
				i--;//reduce the iteration
			}
		}
		for (i = 0; i < 10; i++)
		{
			System.out.print(arrayOfInt[i]+" "); //print to the screen the elements of array
		}
	}

}