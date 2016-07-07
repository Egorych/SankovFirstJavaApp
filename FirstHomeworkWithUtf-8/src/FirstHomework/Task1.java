package FirstHomework;


public class Task1 {

	public static void main(String[] args) {
		String s = "Съешь ещё этих мягких французских булок, да выпей чаю";//create a string
		int length =  s.length();//find the string length
		System.out.println("Кол-во символов в строке: " + length);//We derive the number of characters in a string
		length/=2;//divide in half the string length
		String s1 = s.substring(0, length);//create a string from 0 to length index
		String s2 = s.substring(length);//create a string to length
		System.out.println(s1);//output the string  s1
		System.out.println(s2);//output the string s2
	}

}