import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		System.out.print("������� ���� ������ �� 1 �� 7: ");
		Scanner day = new Scanner(System.in);
		int intDay = day.nextInt();
		if (8>intDay & intDay>0)
		{
		switch (intDay) 
			{
	
			  case 1:
				  System.out.println("�����������");
				  break;
			  case 2:
				  System.out.println("�������");
				  break;
			  case 3:
				  System.out.println("�����");
				  break;
			  case 4:
				  System.out.println("�������");
				  break;
			  case 5:
				  System.out.println("�������");
				  break;
			  case 6:
				  System.out.println("�������");
				  break;
			  case 7:
				  System.out.println("�����������");
				  break;
			}
		}
		else System.out.println("� ������ ������ 7 ����!");
		
	}
}
