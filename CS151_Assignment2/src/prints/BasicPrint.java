package prints;

public class BasicPrint implements Print {
	
	public BasicPrint(String printName, int height, int width, PaperType type) {
		this.printName = printName;
		this.height = height;
		this.width = width;
		this.type = type;
		description = String.format("Basic Print of %s on %s paper with a height of %d and width of %d.", printName, type.getLabel(), height, width);
	}
	
	@Override
	public String getDescription() {
		return description;
	}
	
	@Override
	public void printDescription() {
		System.out.println(description);
	}
	
	private String printName;
	private String description;
	private int height;
	private int width;
	private PaperType type;
}
