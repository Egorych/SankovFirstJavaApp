package Homework3;

public class Task3 {
	
	public static void main(String[] args) {
		String text = "sadbsahfd sd4345645*&&&*##$j   hyussваоврсwwe№;НпмО:Е%6*  &6GhjЛоыв56";
		text = text.replaceAll("[^a-zA-Zа-яА-Я ]","");
		System.out.println(text);
	}
}