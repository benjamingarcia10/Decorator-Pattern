package prints;

public class MattePaper implements Print {

	public MattePaper(Print p) {
		this.p = p;
		this.cost = p.getCost() + ADDITIONAL_COST;
		this.description = p.getDescription() + " Printed on matte paper.";
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
