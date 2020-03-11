package prints;

public class DigitalPrint implements Print {
	
	public DigitalPrint(Print p, String agencyName, int additionalCost) {
		this.p = p;
		this.agencyName = agencyName;
		this.cost = p.getCost() + additionalCost;
		this.description = String.format("%s Digitally sold by %s.", p.getDescription(), this.agencyName); 
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
	private String agencyName;
	private int cost;
}
