package prints;

public class MatPrint implements Print {
	
	public MatPrint(Print p, Color matColor) {
		this.p = p;
		this.matColor = matColor;
		description = p.getDescription() + String.format(" With %s colored mat.", matColor.getLabel());
	}

	@Override
	public String getDescription() {
		return description;
	}
	
	@Override
	public void printDescription() {
		System.out.println(description);
	}
	
	private Print p;
	private String description;
	private Color matColor;
}
