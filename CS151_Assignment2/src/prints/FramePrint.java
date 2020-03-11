package prints;

public class FramePrint implements Print {
	
	/**
	 * Decorator to create a framed print from an existing print
	 * @param p Existing print to be decorated
	 */
	public FramePrint(Print p) {
		this.p = p;
		this.cost = p.getCost() + ADDITIONAL_COST;
		this.description = String.format("%s With a frame.", p.getDescription());
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
		System.out.println(String.format("%s Total Cost: $%d", description, cost));
	}
	
	/**
	 * This method returns the cost of the newly decorated print
	 * @return cost Print cost
	 */
	public int getCost() {
		return cost;
	}
	
	private Print p;									// Existing print to be decorated
	private String description;							// Description of the print
	private int cost;									// Total cost of decorated print
	private static final int ADDITIONAL_COST = 5;		// Additional dollar amount to add frame to print
}
