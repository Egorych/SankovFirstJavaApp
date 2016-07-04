import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		System.out.print("Введите кол-во рублей: ");
		Scanner cash = new Scanner(System.in);
		int intCash = cash.nextInt();
		if (intCash >= 1 && intCash <= 999)
		{
			int ostatok = intCash % 10;
			if (ostatok == 1) System.out.println("Вы ввели "+intCash+" рубль");
			else 
			{
				if (ostatok==2 || ostatok==4 || ostatok==5 ) System.out.println("Вы ввели "+intCash+" рубля");
				else System.out.println("Вы ввели "+intCash+" рублей");
			}
		}
		else System.out.println("Кол - во рублей должно быть в диапазоне от 1 до 999!");
	}

}
