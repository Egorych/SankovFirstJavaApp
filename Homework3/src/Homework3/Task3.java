package Homework3;

public class Task3 {
	
	public static void main(String[] args) {
		String text = "sadbsahfd sd4345645*&&&*##$j   hyussваоврсwwe№;НпмО:Е%6*  &6GhjЛоыв56";//create the line of type String
		text = text.replaceAll("[^a-zA-Zа-яА-Я ]","");//replace all symbols except those that in expression [^a-zA-Zа-яА-Я ] on an empty symbol ""
		System.out.println(text);//print to the screen the string
	}
}