import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		System.out.println("������� ������ �����: ");
		Scanner firstNumber = new Scanner(System.in);
		float x1 = firstNumber.nextFloat();
		System.out.println("������� ������ ����� �����: ");
		Scanner secondNumber = new Scanner(System.in);
		float x2 = secondNumber.nextFloat();
		if (x2 == 0) {
			System.out.println("������! �� ���� ������ ������!");
			}
		float chastnoe = x1 / x2;
		System.out.println(x1+"/" +x2+"="+chastnoe);
	}

}
