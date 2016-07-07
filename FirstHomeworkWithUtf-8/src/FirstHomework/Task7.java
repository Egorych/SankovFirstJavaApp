package FirstHomework;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		System.out.print("Введите день недели от 1 до 7: ");
		Scanner day = new Scanner(System.in);
		int intDay = day.nextInt();
		if (8>intDay & intDay>0)
		{
		switch (intDay) 
			{
	
			  case 1:
				  System.out.println("Понедельник");
				  break;
			  case 2:
				  System.out.println("Вторник");
				  break;
			  case 3:
				  System.out.println("Среда");
				  break;
			  case 4:
				  System.out.println("Четверг");
				  break;
			  case 5:
				  System.out.println("Пятница");
				  break;
			  case 6:
				  System.out.println("Суббота");
				  break;
			  case 7:
				  System.out.println("Воскресенье");
				  break;
			}
		}
		else System.out.println("В неделе только 7 дней!");
		
	}
}
