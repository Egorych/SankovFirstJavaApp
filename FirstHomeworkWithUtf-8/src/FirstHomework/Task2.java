package FirstHomework;

import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
	System.out.println("Введите первое число: ");
	Scanner firstNumber = new Scanner(System.in);
	int x1 = firstNumber.nextInt();
	System.out.println("Введите второе число число: ");
	Scanner secondNumber = new Scanner(System.in);
	int x2 = secondNumber.nextInt();
	if (x1 < x2) {//condition 1
		
		System.out.println("Число " + x2 + " больше числа  " + x1);
		}
	if (x1 > x2) {//condition 2
		System.out.println("Число " + x1 + " больше числа  " + x2);
		}
	if (x1 == x2) {//condition 3
		System.out.println("Число " + x1 + " равно числу " + x2);
		}
	}

}