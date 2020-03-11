package prints;

public enum Color {
	RED("red"),
	ORANGE("orange"),
	YELLOW("yellow"),
	GREEN("green"),
	BLUE("blue"),
	PURPLE("purple"),
	BROWN("brown"),
	MAGENTA("magenta"),
	TAN("tan"),
	CYAN("cyan"),
	OLIVE("olive"),
	MAROON("maroon"),
	NAVY("navy"),
	TURQUOISE("turquoise"),
	SILVER("silver"),
	LIME("lime"),
	TEAL("teal"),
	INDIGO("indigo"),
	VIOLET("violet"),
	PINK("pink"),
	BLACK("black"),
	WHITE("white"),
	GRAY("gray");
	
	private String label;
	
	private Color(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}
}
