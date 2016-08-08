package OopFlowers;

import java.util.ResourceBundle;
import java.util.Scanner;

public class MainWork extends Tax {
	Scanner vvodDohoda;
	ResourceBundle res;

	public MainWork(Scanner sc, ResourceBundle res) {
		setProcent(11);
		this.vvodDohoda = sc;
		this.res = res;
		getSumFromUser();

	}

	@Override
	public void getSumFromUser() {
		int sumFromUser;
		System.out.println(res.getString("sumosn"));
		sumFromUser = vvodDohoda.nextInt();
		setDohod(sumFromUser);
		summaNaloga();
		summaDohoda();
		System.out.println(res.getString("naladd"));

	}

	@Override
	public void showTax() {
		System.out.printf("%-55s%-10d%-40s%-4d%-12s%-8d%-35s%-10d%n", res.getString("osnwithout"),
				getDohod(), res.getString("procosn"), getProcent(), res.getString("sumnal"), getSummaNaloga(),
				res.getString("zarposn"), getSummaDohoda());
	}
}