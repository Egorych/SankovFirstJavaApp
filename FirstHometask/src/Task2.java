import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
	System.out.println("������� ������ �����: ");
	Scanner firstNumber = new Scanner(System.in);
	int x1 = firstNumber.nextInt();
	System.out.println("������� ������ ����� �����: ");
	Scanner secondNumber = new Scanner(System.in);
	int x2 = secondNumber.nextInt();
	if (x1 < x2) {
		System.out.println("����� " + x2 + " ������ ����� " + x1);
		}
	if (x1 > x2) {
		System.out.println("����� " + x1 + " ������ ����� " + x2);
		}
	if (x1 == x2) {
		System.out.println("����� " + x1 + " ����� ����� " + x2);
		}
	}

}