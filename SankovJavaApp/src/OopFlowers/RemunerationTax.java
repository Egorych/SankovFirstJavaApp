package OopFlowers;

import java.util.Scanner;

public class RemunerationTax extends Tax {

	public RemunerationTax() {
		setProcent(17);
		getSumFromUser();
	}

	@Override
	public void getSumFromUser() {
		int sumFromUser;
		System.out.println("Введите сумму вознаграждения: ");
		Scanner vvodDohoda = new Scanner(System.in);
		sumFromUser = vvodDohoda.nextInt();
		setDohod(sumFromUser);
		summaNaloga();
		summaDohoda();
		System.out.println("Налог добавлен!");

	}

	@Override
	// public void showTax(){
	// System.out.println("Введено вознаграждение без налога: " + getDohod() + "
	// Процент налога от вознаграждения: 17% Сумма налога: " + getSummaNaloga()
	// + " Остаток от вознаграждения: " + getSummaDohoda());
	// }
	public void showTax() {
		System.out.printf("%-50s%-10d%-40s%-4d%-12s%-8d%-35s%-10d%n", "Введено вознаграждение без налога:", getDohod(),
				"Процент налога от вознаграждения", getProcent(), "Сумма налога:", getSummaNaloga(),
				"Остаток от вознаграждения:", getSummaDohoda());
	}
}