package BuilderHW;

public class Lunch {

	private final String zapek;

	private final String salad;

	private final String garnir;

	private final String pervoe;

	private final String vtoroe;

	private final String kompot;

	private final String hleb;

	Lunch(LunchBuilder lunchBuilder) {
		this.pervoe = lunchBuilder.getPervoe();
		this.vtoroe = lunchBuilder.getVtoroe();
		this.kompot = lunchBuilder.getKompot();
		this.hleb = lunchBuilder.getHleb();
		this.salad = lunchBuilder.getSalad();
		this.garnir = lunchBuilder.getGarnir();
		this.zapek = lunchBuilder.getZapek();
	}

	@Override
	public String toString() {
		String retstr;
		retstr = "\nВы выбрали:\n" + this.pervoe + " \n" + this.vtoroe + "\n" + this.kompot + "\n" + this.hleb + "\n";
		if (this.salad != null) {
			retstr += this.salad + "\n";
		}

		if (this.garnir != null) {
			retstr += this.garnir + "\n";
		}

		if (this.zapek != null) {
			retstr += this.zapek + "\n";
		}
		return retstr;
	}

}
