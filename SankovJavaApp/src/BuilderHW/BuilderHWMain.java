package BuilderHW;

import java.util.Scanner;

public class BuilderHWMain {

	public static void main(String[] args) {
		boolean stop = false;
		int number = 0;
		try (Scanner sc = new Scanner(System.in)) {
			while (!stop) {
				System.out.println(
						"Выберите обед.\n1)Комплексный обед\n2)Комплексный обед с дополнительным блюдом\n0)Выход");
				number = sc.nextInt();
				switch (number) {
				case 1:
					Lunch lunch = new LunchBuilder().standartLunch().build();
					System.out.println(lunch.toString());
					break;
				case 2:
					System.out.println("Выберите дополнительное блюдо.\n1)Салат\n2)Пюре с котлетой\n3)Запеканка");
					number = sc.nextInt();
					switch (number) {
					case 1:
						Lunch lunch2 = new LunchBuilder().standartLunch().salad().build();
						System.out.println(lunch2.toString());
						break;
					case 2:
						Lunch lunch3 = new LunchBuilder().standartLunch().garnir().build();
						System.out.println(lunch3.toString());
						break;

					case 3:
						Lunch lunch4 = new LunchBuilder().standartLunch().zapek().build();
						System.out.println(lunch4.toString());
						break;
					}
					break;
				case 0:
					stop = true;
					System.out.println("Приходите ещё.");
					break;
				default:
					System.out.println("Неверный пункт меню!!! Выберите 1,2 или 0");
					break;

				}

			}
		}
	}
}