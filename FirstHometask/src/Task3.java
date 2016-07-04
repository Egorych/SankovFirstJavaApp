import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		System.out.println("Введите первое число: ");
		Scanner firstNumber = new Scanner(System.in);
		float x1 = firstNumber.nextFloat();
		System.out.println("Введите второе число число: ");
		Scanner secondNumber = new Scanner(System.in);
		float x2 = secondNumber.nextFloat();
		if (x2 == 0) {
			System.out.println("Ошибка! На ноль делить нельзя!");
			}
		float chastnoe = x1 / x2;
		System.out.println(x1+"/" +x2+"="+chastnoe);
	}

}
