package OopFlowers;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class OopFlowersMain {

	public static void main(String[] args) {

		boolean stop = false;
		int number = 0, numberOfLang = 0;
		String language="", country = "";
		ArrayList<Tax> taxes = new ArrayList<Tax>();
		System.out.println("Choose language:\n1)English\n2)Русский");
		Scanner languageNumb = new Scanner(System.in);
			try{
				numberOfLang = languageNumb.nextInt();
			}catch (java.util.InputMismatchException e) {
				System.out.println("Error!");
			}
		
		switch (numberOfLang) {
		case 1:
			language = "EN";
			country = "US";
			break;
		case 2:
			language = "RU";
			country = "RUS";
			break;}
		Locale current = new Locale(language, country);
		ResourceBundle res = ResourceBundle.getBundle("OopFlowersProperties.text", current);
		Date currentDate = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,current);
		DateFormat time = DateFormat.getTimeInstance(DateFormat.MEDIUM);
		System.out.println("\n" + time.format(currentDate) + " " + df.format(currentDate));
		//System.out.println(res.getString("operation"));
		
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