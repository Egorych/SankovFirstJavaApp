package OopFlowers;

import java.util.ArrayList;
import java.util.Scanner;

public class OopFlowersMain {

	public static void main(String[] args) {

		boolean stop = false;
		ArrayList taxes = new ArrayList();

		while (!stop) {
			System.out.println(
					"\nВыберите действие:\n1)Налог на основную работу\n2)Налог на дополнительную работу\n3)Налог на продажу иммущества\n4)Налог на вознаграждение\n5)Показать все налоги\n6)Сортировать налоги\n0)Выход");
			Scanner numberOfNalog = new Scanner(System.in);
			int number = numberOfNalog.nextInt();
			switch (number) {
			case 1:
				MainWork mainwork = new MainWork();
				taxes.add(mainwork);
				break;
			case 5:
				if (taxes.size() == 0)
					System.out.println("Данных нет!");
				for (int i = 0; i < taxes.size(); i++) {
					Tax tax = (Tax) taxes.get(i);
					tax.showTax();
				}
				break;
			case 0:
				stop = true;
				System.out.println("Вы вышли из программы!");
				break;
			}
		}
	}
}