package Homework3;

public class Task5 {

	public static void main(String[] args) {
		String s = ("cfdghjhgfdslf  dsf ");// create the line of type String
		char[] sToArray = s.toCharArray();// transfer a line to symbols
		int count = 0;// set the counter
		outerloop: // loop termination
		for (int i = 0; i < sToArray.length; i++) {
			for (int j = i + 1; j < sToArray.length; j++) {
				if (sToArray[i] == sToArray[j]) {//compare the first and second element
					count++;
					break outerloop;//interrupt an external cycle
					  
				}
			}
		}
		if (count == 0)
			System.out.println("В строке повторяющихся символов нет");// do if in line there are no repeating symbols
		else
			System.out.println("В строке есть повторяющиееся символы");// do if in line there are repeating symbols
	}

}