package RegexHW;

public class RegexHW {


	public static void main(String[] args) {
		String text = "0x7FFF <p id=p1> 0x7AAF <p id=p1> kkkk  khg gkhjg";//create the line on type String
		text = text.replaceAll("<[^>]*>.","<p> ");//replace all symbols except those that in expression regex on an empty symbol ""
		System.out.println(text);
	}
}