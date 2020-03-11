package prints;

/**
 * Enum to specify valid colors for mat decorator
 * @author benja
 *
 */
public enum MatColor {
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
	
	private String label;					// String to hold string value of the mat
	
	/**
	 * Set label variable to data value of enum
	 * @param label Corresponding color as a string
	 */
	private MatColor(String label) {
		this.label = label;
	}
	
	/**
	 * Return the associated label of the color
	 * @return label Corresponding color as a string
	 */
	public String getLabel() {
		return label;
	}
}
