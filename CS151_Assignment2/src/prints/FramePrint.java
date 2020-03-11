package prints;

public class FramePrint implements Print {
	
	public FramePrint(Print p) {
		this.p = p;
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
}
