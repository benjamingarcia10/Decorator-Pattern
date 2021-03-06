package prints;

/**
 * Decorator to create a print on glossy paper
 * @author benja
 *
 */
public class GlossyPrint implements Print {
	
	/**
	 * Decorator to print onto glossy paper from an existing print
	 * @param p Existing print to be decorated
	 */
	public GlossyPrint(Print p) {
		this.p = p;
		this.cost = p.getCost() + ADDITIONAL_COST;
		this.description = String.format("%s Printed on glossy paper.", p.getDescription());
	}
	
	/**
	 * Returns the description of the print
	 * @return description Print description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Prints the description to the console along with the cost of the print
	 */
	public void printDescription() {
		System.out.println(String.format("%s Total Cost: $%d", description, cost));
	}
	
	/**
	 * Returns the cost of the newly decorated print
	 * @return cost Print cost
	 */
	public int getCost() {
		return cost;
	}
	
	private Print p;									// Existing print to be decorated
	private String description;							// Description of the print
	private int cost;									// Total cost of decorated print
	private static final int ADDITIONAL_COST = 2;		// Additional dollar amount to print on glossy paper
}
