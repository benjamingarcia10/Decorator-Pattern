package prints;

/**
 * Decorator to create a digital print
 * @author benja
 *
 */
public class DigitalPrint implements Print {
	
	/**
	 * Decorator to create a digital print from an existing print
	 * @param p	Existing print to be decorated
	 * @param agencyName Stock Photo Agency's name
	 * @param additionalCost Additional cost of digital print
	 */
	public DigitalPrint(Print p, String agencyName, int additionalCost) {
		this.p = p;
		this.agencyName = agencyName;
		this.cost = p.getCost() + additionalCost;
		this.description = String.format("%s Digitally sold by %s.", p.getDescription(), this.agencyName); 
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
	
	private Print p;				// Existing print to be decorated
	private String description;		// Description of the print
	private String agencyName;		// Stock Photo Agency's name
	private int cost;				// Total cost of decorated print
}
