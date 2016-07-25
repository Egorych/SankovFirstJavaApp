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
	public void showTax(){
		System.out.println("Введена сумма с продажи имущества без налога: " + getDohod() + "   Процент налога с продажи имущества: 20%   Сумма налога: " + getSummaNaloga()
				+ "   Остаток с продажи имущества: " + getSummaDohoda());
	}
}