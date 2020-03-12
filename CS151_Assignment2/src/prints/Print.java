package prints;

/**
 * Interface for all prints
 * @author benja
 *
 */
public interface Print {
	
	/**
	 * Get description of the print
	 * @return Print description
	 */
	public String getDescription();
	
	/**
	 * Print description of the print to the console and include the cost
	 */
	public void printDescription();
	
	/**
	 * Get the cost of the print
	 * @return Print cost
	 */
	public int getCost();
}
