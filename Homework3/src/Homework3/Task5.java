package Homework3;

public class Task5 {

	public static void main(String[] args) {
		String s = ("cfdghjhgfdslf  dsf ");
		char[] sToArray = s.toCharArray();
		int count = 0;
		outerloop:
		for(int i = 0; i < sToArray.length; i++)
		{
			for(int j = i+1; j < sToArray.length;j++)
			{
				if(sToArray[i]==sToArray[j])
				{
					count++;
					break outerloop;
				}
			}
		}
		if (count == 0) System.out.println("В строке повторяющихся символов нет");
		else System.out.println("В строке есть повторяющиееся символы");
		}
		
	}