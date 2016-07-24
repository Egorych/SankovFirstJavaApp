package OopFlowers;

import java.util.Scanner;

public class MainWork extends Tax {

	public MainWork() {
		setProcent(11);
		getSumFromUser();
		//System.out.println(toString());
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

	}

	/*@Override
	public String toString() {
		return "\nСумма без налога:" + getDohod() +  "\nПроцент налога с основной работы: 11%\nНалог с дохода основной работы: " + getSummaNaloga()
				+ "\nЗарплата основной работы: " + getSummaDohoda();
	}*/
	
	@Override
	public void showTax(){
		System.out.println("Введена сумма с основной работы без налога: " + getDohod() + "   Процент налога с основной работы: 11%   Налог с дохода основной работы: " + getSummaNaloga()
				+ "   Зарплата основной работы: " + getSummaDohoda());
	}
}