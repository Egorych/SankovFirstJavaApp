package Homework3;

public class Task2 {

	public static void main(String[] args) {
		String text = "The big, clock on the tower of the Palace of Westminster in London is often called Big Ben.".toLowerCase();//create the line of type String, translate to the lower register
		String textReplace = text.replace(" ", ""); //delete all gaps
		char[] charText = textReplace.toCharArray();//transfer a line to symbols
			for(int i=0 ; i < textReplace.length(); i++)
			{
				System.out.print(charText[i] + "  ");//print each symbol through 2 gaps
				//System.out.format("%-3d",charText[i]);
			}
			System.out.println(); //transfer the cursor to the next line
			for(int i=0 ; i < textReplace.length(); i++){
			String line = "abcdefghijklmnopqrstuvwxyz.,!"; //create a line with the English alphabet
			char[] lineChar = line.toCharArray(); 
				for (int j =0; j < 28; j++) //pass on a line, learn a symbol index
				{
					if(lineChar[j]==charText[i])
					{
						System.out.format("%-3d", j + 1);//print a symbol index
						break;
					}
					}
			}
	}

}
