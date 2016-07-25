package OopFlowers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OopFlowersMain {

	public static void main(String[] args) {

		boolean stop = false;
		int number = 0;
		ArrayList taxes = new ArrayList<Tax>();
		while (!stop) {
			System.out.println(
					"\nВыберите действие:\n1)Налог на основную работу\n2)Налог на дополнительную работу\n3)Налог на продажу иммущества\n4)Налог на вознаграждение\n5)Показать все налоги\n6)Сортировать налоги по сумме\n0)Выход");
			Scanner numberOfNalog = new Scanner(System.in);
			try {
				number = numberOfNalog.nextInt();
			} catch (java.util.InputMismatchException e) {
				System.out.println("Введён неверный символ! ");
				number = 7;
			}
			// int number = numberOfNalog.nextInt();
			switch (number) {
			case 1:
				MainWork mainwork = new MainWork();
				taxes.add(mainwork);
				break;
			case 2:
				AdditionalWork additionalWork = new AdditionalWork();
				taxes.add(additionalWork);
				break;
			case 3:
				PropertyTax propertyTax = new PropertyTax();
				taxes.add(propertyTax);
				break;
			case 4:
				RemunerationTax remunerationTax = new RemunerationTax();
				taxes.add(remunerationTax);
				break;
			case 5:
				if (taxes.size() == 0)
					System.out.println("Данных нет!");
				for (int i = 0; i < taxes.size(); i++) {
					Tax tax = (Tax) taxes.get(i);
					tax.showTax();
				}
				break;
			case 6:
				if (taxes.size() == 0)
					System.out.println("Данных нет!");
				else {
					Collections.sort(taxes, new TaxSumComparator());
					for (int i = 0; i < taxes.size(); i++) {
						Tax tax = (Tax) taxes.get(i);
						tax.showTax();
					}
				}
				break;
			case 0:
				stop = true;
				System.out.println("Вы вышли из программы!");
				break;
			default:
				System.out.println("Вводите только существующие пункты меню!!!");
				break;
			}
		}
	}
}