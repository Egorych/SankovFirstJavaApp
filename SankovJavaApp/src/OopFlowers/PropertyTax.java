package OopFlowers;

import java.util.Scanner;

public class PropertyTax extends Tax {

	public PropertyTax() {
		setProcent(20);
		getSumFromUser();
	}

	@Override
	public void getSumFromUser() {
		int sumFromUser;
		System.out.println("Введите сумму с продажи имущества: ");
		Scanner vvodDohoda = new Scanner(System.in);
		sumFromUser = vvodDohoda.nextInt();
		setDohod(sumFromUser);
		summaNaloga();
		summaDohoda();
		System.out.println("Налог добавлен!");

	}

	@Override
	public void showTax() {
		System.out.printf("%-50s%-10d%-40s%-4d%-12s%-8d%-35s%-10d%n", "Введена сумма с продажи имущества без налога:",
				getDohod(), "Процент налога с продажи имущества:", getProcent(), "Сумма налога:", getSummaNaloga(),
				"Остаток с продажи имущества:", getSummaDohoda());
	}
}