package Homework3;

public class Task2 {

	public static void main(String[] args) {
		String text = "The big clock on the tower of the Palace of Westminster in London is often called Big Ben.".toLowerCase();
		String textReplace = text.replace(" ", "");
		char[] charText = textReplace.toCharArray();
			for(int i=0 ; i < textReplace.length(); i++)
			{
				System.out.print(charText[i] + "  ");
			}
			System.out.println();
			for(int i=0 ; i < textReplace.length(); i++){
			String line = "abcdefghijklmnopqrstuvwxyz";
			char[] lineChar = line.toCharArray();
				for (int j =0; j < 26; j++)
				{
					if(lineChar[j]==charText[i])
					{
						System.out.print(j+1 + " ");
						break;
					}
				}
			}
	}

}
