package prints;

public class BasicPrint implements Print {
	
	/**
	 * Create a basic print with the attributes printName, height, and width
	 * @param printName Artistic name of print
	 * @param height Height of print in inches
	 * @param width Width of print in inches
	 */
	public BasicPrint(String printName, int height, int width) {
		this.printName = printName;
		this.height = height;
		this.width = width;
		this.description = String.format("Print of %s (Height: %din x Width: %din).", this.printName, this.height, this.width);
	}
	
	/**
	 * This method returns the description of the print
	 * @return description Print description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * This method prints the description to the console along with the cost of the print
	 */
	public void printDescription() {
		System.out.println(String.format("%s Total Cost: $%d", description, BASIC_PRINT_COST));
	}
	
	/**
	 * This method returns the cost of a basic print
	 * @return cost Print cost
	 */
	public int getCost() {
		return BASIC_PRINT_COST;
	}
	
	private String printName;								// Artistic name of the print
	private String description;								// Description of the print
	private int height;										// Height of the print in inches
	private int width;										// Width of the print in inches
	private static final int BASIC_PRINT_COST = 10;			// Cost of a basic print
}
