package prints;

public class MatPrint implements Print {
	
	/**
	 * Decorator to create a print on a mat from an existing print
	 * @param p Existing print to be decorated
	 * @param matColor Desired color of mat
	 */
	public MatPrint(Print p, MatColor matColor) {
		this.p = p;
		this.matColor = matColor;
		this.cost = p.getCost() + ADDITIONAL_COST;
		this.description = String.format("%s With %s colored mat.", p.getDescription(), this.matColor.getLabel());
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
	private MatColor matColor;							// Color of mat
	private int cost;									// Total cost of decorated print
	private static final int ADDITIONAL_COST = 2;		// Additional dollar amount to add mat to print
}
