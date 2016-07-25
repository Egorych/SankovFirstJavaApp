package OopFlowers;

import java.util.Scanner;

public class AdditionalWork extends Tax {

	public AdditionalWork() {
		setProcent(15);
		getSumFromUser();
	}

	@Override
	public void getSumFromUser() {
		int sumFromUser;
		System.out.println("Введите сумму дохода с дополниельной работы: ");
		Scanner vvodDohoda = new Scanner(System.in);
		sumFromUser = vvodDohoda.nextInt();
		setDohod(sumFromUser);
		summaNaloga();
		summaDohoda();
		System.out.println("Налог добавлен!");

	}

	
	@Override
	public void showTax(){
		System.out.println("Введена сумма с дополнительной работы без налога: " + getDohod() + "   Процент налога с дополнительной работы: 15%   Сумма налога: " + getSummaNaloga()
				+ "   Зарплата дополнительной работы: " + getSummaDohoda());
	}
}