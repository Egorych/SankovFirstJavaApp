import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		System.out.println("������� ���: ");
		Scanner year = new Scanner(System.in);
		int a = year.nextInt();
		if (a % 4 == 0)
			{
			 if(a % 100 == 0)
			 {
				 if (a % 400 == 0) System.out.println("��� ����������");
				 else System.out.println("��� �� ����������");
			 }
			 else System.out.println("��� ����������");
			}
		else System.out.println("��� �� ����������");
	}

}