import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
	System.out.println("¬ведите первое число: ");
	Scanner firstNumber = new Scanner(System.in);
	int x1 = firstNumber.nextInt();
	System.out.println("¬ведите второе число число: ");
	Scanner secondNumber = new Scanner(System.in);
	int x2 = secondNumber.nextInt();
	if (x1 < x2) {
		System.out.println("„исло " + x2 + " больше числа " + x1);
		}
	if (x1 > x2) {
		System.out.println("„исло " + x1 + " больше числа " + x2);
		}
	if (x1 == x2) {
		System.out.println("„исло " + x1 + " равно числу " + x2);
		}
	}

}