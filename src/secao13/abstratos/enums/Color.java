package secao13.abstratos.enums;

public enum Color {
	BLACK(0),
	BLUE(1),
	RED(2);
	
	private final int valorColor;

	private Color(int valorColor) {
		this.valorColor = valorColor;
	}

	public int getValorColor() {
		return valorColor;
	}
	
	
	

}
