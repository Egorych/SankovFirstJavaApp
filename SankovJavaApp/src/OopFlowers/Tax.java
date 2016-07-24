package OopFlowers;

public abstract class Tax {
	private int summaDohoda, dohod, procent, summaNaloga;

	public int getSummaNaloga() {
		return summaNaloga;
	}

	public void setSummaNaloga(int summaNaloga) {
		this.summaNaloga = summaNaloga;
	}

	public int getSummaDohoda() {
		return summaDohoda;
	}

	public void setSummaDohoda(int summaDohoda) {
		this.summaDohoda = summaDohoda;
	}

	public int getDohod() {
		return dohod;
	}

	public void setDohod(int dohod) {
		this.dohod = dohod;
	}

	public int getProcent() {
		return procent;
	}

	public void setProcent(int procent) {
		this.procent = procent;
	}

	public void summaNaloga() {
		summaNaloga = dohod * procent / 100;// Посчитали сумму налога

	}

	public void summaDohoda() {// Посчитали сумму минус налог;
		summaDohoda = dohod - summaNaloga;
	}

	public void getSumFromUser() {
	}
	
	public void showTax(){
		
	}
}
