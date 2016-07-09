package Homework3;

import java.util.Arrays;

public class Task6 {

	public static void main(String[] args) {
		String s1 = ("q wr    ");
		String s2 = ("rq   w");
		s1 = s1.toLowerCase().replace(" ", "");
		s2 = s2.toLowerCase().replace(" ", "");
		char[] s1ToArray = s1.toCharArray();
		char[] s2ToArray = s2.toCharArray();
		if (s1ToArray.length == s2ToArray.length) {
			Arrays.sort(s1ToArray);
			Arrays.sort(s2ToArray);
			if (Arrays.equals(s1ToArray, s2ToArray)) {
				System.out.println("Строка является перестановкой другой строки");
			} else
				System.out.println("Строка НЕ является перестановкой другой строки");
		} else
			System.out.println("Строка НЕ является перестановкой другой строки");
	}

}