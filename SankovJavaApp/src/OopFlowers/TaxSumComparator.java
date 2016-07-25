package OopFlowers;

import java.util.Comparator;

public class TaxSumComparator implements Comparator<Tax> {
	@Override
	public int compare(Tax tax1, Tax tax2) {
		if (tax1.getSummaNaloga() > tax2.getSummaNaloga()) {
			return 1;
		} else {
			return -1;
		}
	}
}