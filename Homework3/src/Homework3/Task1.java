package Homework3;

public class Task1 {

	public static void main(String[] args) {
		String text = new String("Стояла суровая зима. Все было покрыто снегом. Тяжело пришлось от этого воробушкам. Бедняжки нигде не могли найти корма.");
		String[] words = text.split(" ");
		int countWords = words.length;
		int k = 5;
		for (int i = 0; i < countWords; i++)
		{
			if (words[i].length() > k)
			{
				char[] wordToCharArray = words[i].toCharArray();
				wordToCharArray[k] = '!';
				words[i] = new String(wordToCharArray);
				
			}
			System.out.print (words[i] + " ");
		}
			
	}

}
