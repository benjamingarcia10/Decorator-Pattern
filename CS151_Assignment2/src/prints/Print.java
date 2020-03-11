package prints;

/**
 * Interface for all prints
 * @author benja
 *
 */
public interface Print {
	
	/**
	 * Method to get description of the print
	 * @return print description
	 */
	public String getDescription();
	
	/**
	 * Method to print description of the print to the console and include the cost
	 */
	public void printDescription();
	
	/**
	 * Method to get the cost of the print
	 * @return print cost
	 */
	public int getCost();
}
