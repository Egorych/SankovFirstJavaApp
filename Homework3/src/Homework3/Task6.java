package Homework3;

import java.util.Arrays;

public class Task6 {

	public static void main(String[] args) {
		String s1 = ("q wr    ");// create the first line of type String
		String s2 = ("rq   w");// create the second line of type String
		s1 = s1.toLowerCase().replace(" ", ""); //delete gaps,lead a line to the lower register
		s2 = s2.toLowerCase().replace(" ", "");
		char[] s1ToArray = s1.toCharArray();// transfer a line to symbols
		char[] s2ToArray = s2.toCharArray();
		if (s1ToArray.length == s2ToArray.length) { //compare length of the first and second line of symbols
			Arrays.sort(s1ToArray);//sort the first line
			Arrays.sort(s2ToArray);//sort the second line
			if (Arrays.equals(s1ToArray, s2ToArray)) {//compare lines
				System.out.println("Строка является перестановкой другой строки");// do if the first line is equal to a  second line
			} else
				System.out.println("Строка НЕ является перестановкой другой строки");//// do if the first line is not equal to a  second line
		} else
			System.out.println("Строка НЕ является перестановкой другой строки");// do if length of the first line != length of the second line
	}

}