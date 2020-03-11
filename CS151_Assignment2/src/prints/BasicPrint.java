package prints;

public class BasicPrint implements Print {
	
	public BasicPrint(String printName, int height, int width) {
		this.printName = printName;
		this.height = height;
		this.width = width;
		this.description = String.format("Print of %s (Height: %d inches, Width: %d inches).", this.printName, this.height, this.width);
	}
	
	@Override
	public String getDescription() {
		return description;
	}
	
	@Override
	public void printDescription() {
		System.out.println(String.format("%s Total Cost: $%d", description, BASIC_PRINT_COST));
	}
	
	@Override
	public int getCost() {
		return BASIC_PRINT_COST;
	}
	
	private String printName;
	private String description;
	private int height;
	private int width;
	private static final int BASIC_PRINT_COST = 10;
}
