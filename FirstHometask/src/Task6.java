import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		System.out.print("������� ���-�� ������: ");
		Scanner cash = new Scanner(System.in);
		int intCash = cash.nextInt();
		if (intCash >= 1 && intCash <= 999)
		{
			int ostatok = intCash % 10;
			if (ostatok == 1) System.out.println("�� ����� "+intCash+" �����");
			else 
			{
				if (ostatok==2 || ostatok==4 || ostatok==5 ) System.out.println("�� ����� "+intCash+" �����");
				else System.out.println("�� ����� "+intCash+" ������");
			}
		}
		else System.out.println("��� - �� ������ ������ ���� � ��������� �� 1 �� 999!");
	}

}
