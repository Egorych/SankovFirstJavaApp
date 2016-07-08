package Homework3;
import java.util.Arrays;
public class Task4 {

	public static void main(String[] args) {
		
		String text = "Na labute nah nah i v voshititlnyh shta nah";
		int lengthOfDeletedWord = 3;
		String[] textSplit = text.split(" ");
		for (int i=0; i<textSplit.length;i++){
			if (textSplit[i].length()==lengthOfDeletedWord)
			{
				char firstLetter[] = textSplit[i].toCharArray();
				if(firstLetter[0]!='a' && firstLetter[0]!='e' && firstLetter[0]!='i' && firstLetter[0]!='o' && firstLetter[0]!='u' && firstLetter[0]!='y')
				{
					textSplit[i]="";
				}
			}
		}
		for (int j =0; j < textSplit.length; j++){
			if (textSplit[j]!="")
				System.out.print(textSplit[j]+" ");
		}
	}
}