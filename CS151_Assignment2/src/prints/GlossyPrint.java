package prints;

public class GlossyPrint implements Print {
	
	public GlossyPrint(Print p) {
		this.p = p;
		this.cost = p.getCost() + ADDITIONAL_COST;
		this.description = String.format("%s Printed on glossy paper.", p.getDescription());
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
	private int cost;
	private static final int ADDITIONAL_COST = 2;
}