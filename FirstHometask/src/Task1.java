
public class Task1 {

	public static void main(String[] args) {
		String s = "Съешь ещё этих мягких французских булок, да выпей чаю";
		int length =  s.length();
		System.out.println("Кол-во символов в строке: " + length);
		length/=2;
		String s1 = s.substring(0, length);
		String s2 = s.substring(length);
		System.out.println(s1);
		System.out.println(s2);
	}

}