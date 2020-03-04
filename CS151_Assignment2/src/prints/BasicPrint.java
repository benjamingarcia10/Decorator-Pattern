package prints;

public class BasicPrint implements Print {
	
	private String description;
	private int height;
	private int width;
	
	public BasicPrint(int height, int width) {
		this.height = height;
		this.width = width;
		description = String.format("Basic Print with No Decorations and a height of %d and width of %d.", height, width);
	}
	
	@Override
	public String getDescription() {
		return description;
	}
	
}
