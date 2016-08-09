package OopFlowers;

import java.util.ResourceBundle;
import java.util.Scanner;

public class AdditionalWork extends Tax {//
	Scanner vvodDohoda;
	ResourceBundle res;

	public AdditionalWork(Scanner sc, ResourceBundle res) {
		setProcent(15);
		this.vvodDohoda = sc;
		this.res = res;
		getSumFromUser();
	}

	@Override
	public void getSumFromUser() {
		int sumFromUser;
		System.out.println(res.getString("sumdohdop"));
		sumFromUser = vvodDohoda.nextInt();
		setDohod(sumFromUser);
		summaNaloga();
		summaDohoda();
		System.out.println(res.getString("naladd"));

	}

	@Override
	public void showTax() {
		System.out.printf("%-55s%-10d%-40s%-4d%-12s%-8d%-35s%-10d%n", res.getString("sumdopbez"), getDohod(),
				res.getString("procdop"), getProcent(), res.getString("sumnal"), getSummaNaloga(),
				res.getString("zpdopwork"), getSummaDohoda());
	}
}