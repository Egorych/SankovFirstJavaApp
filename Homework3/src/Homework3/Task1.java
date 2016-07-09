package Homework3;

public class Task1 {

	public static void main(String[] args) {
		String text = new String("Стояла суровая зима. Все было покрыто снегом. Тяжело пришлось от этого воробушкам. Бедняжки нигде не могли найти корма.");//create the line of type String
		String[] words = text.split(" ");//break a line into words
		int countWords = words.length;//create a variable of type int
		int k = 5;//appropriate value to a variable 
		for (int i = 0; i < countWords; i++)//cycle
		{
			if (words[i].length() > k) 
			{
				char[] wordToCharArray = words[i].toCharArray();//transfer the word to a line of symbols
				wordToCharArray[k] = '!';//give to an k element the set symbol
				words[i] = new String(wordToCharArray);//write down value to the massif
				
			}
			System.out.print (words[i] + " ");//print to the screen the array  
		}
			
	}

}
