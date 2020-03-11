package prints;

public class MatPrint implements Print {
	
	public MatPrint(Print p, Color matColor) {
		this.p = p;
		this.matColor = matColor;
		this.cost = p.getCost() + ADDITIONAL_COST;
		this.description = String.format("%s With %s colored mat.", p.getDescription(), this.matColor.getLabel());
	}

	@Override
	public String getDescription() {
		return description;
	}
	
	@Override
	public void printDescription() {
		System.out.println(String.format("%s Total Cost: $%d", description, cost));
	}
	
	@Override
	public int getCost() {
		return cost;
	}
	
	private Print p;
	private String description;
	private Color matColor;
	private int cost;
	private static final int ADDITIONAL_COST = 2;
}
