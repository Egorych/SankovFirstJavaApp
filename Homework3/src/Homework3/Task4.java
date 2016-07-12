package Homework3;
public class Task4 {

	public static void main(String[] args) {
		
		String text = "Na labute nah nah i v voshititlnyh shta nah";//create the line of type String
		int lengthOfDeletedWord = 3;//appropriate value
		String[] textSplit = text.split(" ");//break a line into words
		for (int i=0; i<textSplit.length;i++){
			if (textSplit[i].length()==lengthOfDeletedWord)//if length of the word is equal to the set length
			{
				char firstLetter[] = textSplit[i].toCharArray(); //break the word into symbols
				if(firstLetter[0]!='a' && firstLetter[0]!='e' && firstLetter[0]!='i' && firstLetter[0]!='o' && firstLetter[0]!='u' && firstLetter[0]!='y')//if first letter is vowel
				{
					textSplit[i]="";//replace the found word on ""
				}
			}
		}
		for (int j =0; j < textSplit.length; j++){
			if (textSplit[j]!="")
				System.out.print(textSplit[j]+" ");//print to the screen the array
		}
	}
}