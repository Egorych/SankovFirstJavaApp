package ParserHW;

public class Point {
	int x, y;
	String unit;

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String getUnit() {
		return unit;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	@Override
	public String toString() {
		return "Point " + SaxParserHW.count + ": "  + x + unit + ", " + y + unit;
	}
}
