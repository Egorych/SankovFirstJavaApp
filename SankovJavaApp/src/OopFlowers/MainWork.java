package OopFlowers;

import java.util.Scanner;

public class MainWork extends Tax {

	public MainWork() {
		setProcent(11);
		getSumFromUser();
		// System.out.println(toString());
	}

	@Override
	public void getSumFromUser() {
		int sumFromUser;
		System.out.println("Введите сумму дохода с основноый работы: ");
		Scanner vvodDohoda = new Scanner(System.in);
		sumFromUser = vvodDohoda.nextInt();
		setDohod(sumFromUser);
		summaNaloga();
		summaDohoda();
		System.out.println("Налог добавлен!");

	}

	/*
	 * @Override public String toString() { return "\nСумма без налога:" +
	 * getDohod() +
	 * "\nПроцент налога с основной работы: 11%\nНалог с дохода основной работы: "
	 * + getSummaNaloga() + "\nЗарплата основной работы: " + getSummaDohoda(); }
	 */

	@Override
	public void showTax() {
		System.out.printf("%-50s%-10d%-40s%-4d%-12s%-8d%-35s%-10d%n", "Введена сумма с основной работы без налога: ",
				getDohod(), "Процент налога с основной работы:", getProcent(), "Сумма налога:", getSummaNaloga(),
				"Зарплата основной работы:", getSummaDohoda());
	}
}