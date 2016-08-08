package OopFlowers;

import java.util.ResourceBundle;
import java.util.Scanner;

public class PropertyTax extends Tax {
	Scanner vvodDohoda;
	ResourceBundle res;
	public PropertyTax(Scanner sc, ResourceBundle res) {
		setProcent(20);
		this.vvodDohoda = sc;
		this.res = res;
		getSumFromUser();
		
	}

	@Override
	public void getSumFromUser() {
		int sumFromUser;
		System.out.println(res.getString("sumsprim"));
		sumFromUser = vvodDohoda.nextInt();
		setDohod(sumFromUser);
		summaNaloga();
		summaDohoda();
		System.out.println(res.getString("naladd"));

	}

	@Override
	public void showTax() {
		System.out.printf("%-55s%-10d%-40s%-4d%-12s%-8d%-35s%-10d%n", res.getString("sumsprodbez"),
				getDohod(), res.getString("procsprodimm"), getProcent(), res.getString("sumnal"), getSummaNaloga(),
				res.getString("ostsprodim"), getSummaDohoda());
	}
}