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
		String language = "", country = "";
		ArrayList<Tax> taxes = new ArrayList<Tax>();
		System.out.println("Choose language:\n1)English\n2)Русский");
		try (Scanner languageNumb = new Scanner(System.in)) {
			numberOfLang = languageNumb.nextInt();
			switch (numberOfLang) {
			case 1:
				language = "EN";
				country = "US";
				break;
			case 2:
				language = "RU";
				country = "RUS";
				break;
			}

			Locale current = new Locale(language, country);
			ResourceBundle res = ResourceBundle.getBundle("OopFlowersProperties.text", current);
			Date currentDate = new Date();
			DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, current);
			DateFormat time = DateFormat.getTimeInstance(DateFormat.MEDIUM);
			System.out.println("\n" + time.format(currentDate) + " " + df.format(currentDate));
			while (!stop) {
				System.out.println("\n" + res.getString("operation") + "\n" + res.getString("osnwork") + "\n"
						+ res.getString("dopwork") + "\n" + res.getString("immun") + "\n" + res.getString("vozn") + "\n"
						+ res.getString("showall") + "\n" + res.getString("sortnal") + "\n" +res.getString("exit"));
				number = languageNumb.nextInt();
				switch (number) {
				case 1:
					MainWork mainwork = new MainWork(languageNumb, res);
					taxes.add(mainwork);
					break;
				case 2:
					AdditionalWork additionalWork = new AdditionalWork(languageNumb, res);
					taxes.add(additionalWork);
					break;
				case 3:
					PropertyTax propertyTax = new PropertyTax(languageNumb, res);
					taxes.add(propertyTax);
					break;
				case 4:
					RemunerationTax remunerationTax = new RemunerationTax(languageNumb, res);
					taxes.add(remunerationTax);
					break;
				case 5:
					if (taxes.size() == 0)
						System.out.println(res.getString("dannyhnown"));
					for (int i = 0; i < taxes.size(); i++) {
						Tax tax = (Tax) taxes.get(i);
						tax.showTax();
					}
					break;
				case 6:
					if (taxes.size() == 0)
						System.out.println(res.getString("dannyhnown"));
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
					System.out.println(res.getString("exitprog"));
					break;
				default:
					System.out.println(res.getString("excmain"));
					break;
				}
			}
		}
	}
}