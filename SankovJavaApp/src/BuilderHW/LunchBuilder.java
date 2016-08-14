package BuilderHW;

public class LunchBuilder {

	private String pervoe;

	private String vtoroe;

	private String kompot;

	private String hleb;

	private String salad;

	private String garnir;

	private String zapek;

	public LunchBuilder standartLunch() {
		this.pervoe = "Cуп куриный";
		this.vtoroe = "Гречка с тушёнкой";
		this.kompot = "Компот";
		this.hleb = "Хлеб";
		return this;
	}

	public LunchBuilder salad() {
		this.salad = "Салат";
		return this;
	}

	public LunchBuilder garnir() {
		this.garnir = "Пюре с котлетой";
		return this;
	}

	public LunchBuilder zapek() {
		this.zapek = "Запеканка";
		return this;
	}

	public String getPervoe() {
		return pervoe;
	}

	public String getVtoroe() {
		return vtoroe;
	}

	public String getKompot() {
		return kompot;
	}

	public String getHleb() {
		return hleb;
	}

	public String getSalad() {
		return salad;
	}

	public String getGarnir() {
		return garnir;
	}

	public String getZapek() {
		return zapek;
	}

	public Lunch build() {
		return new Lunch(this);
	}
}
