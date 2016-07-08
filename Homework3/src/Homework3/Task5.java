package Homework3;

public class Task5 {

	public static void main(String[] args) {
		String s = (" hjghjghjghj g  hjh");
		char[] sToArray = s.toCharArray();
		int count = 0;
		for(int i = 0; i <= sToArray.length; i++)
		{
			for(int j = i+1; j <= sToArray.length-1;j++)
			{
				if(sToArray[i]==sToArray[j])
				{
					count++;
				}
			}
		}
		if (count == 0) System.out.println("В строке повторяющихся символов нет");
		else System.out.println("В строке есть повторяющиееся символы");
		}
		
	}