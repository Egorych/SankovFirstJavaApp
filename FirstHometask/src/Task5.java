import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		System.out.print("������� ��� ���� � ��: ");
		Scanner height = new Scanner(System.in);
		int intHeight = height.nextInt();
		System.out.print("������� ��� ���: ");
		Scanner weight = new Scanner(System.in);
		int intWeight = weight.nextInt();
		int optimWeight = intHeight - 100;
		if (intWeight > optimWeight) System.out.print("��� ����� ��������");
		else System.out.print("��� ���� �����������");
	}

}
