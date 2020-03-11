package prints;

public class DigitalPrint implements Print {
	
	public DigitalPrint(String imageName, String digitalFileName) {
		this.imageName = imageName;
		this.digitalFileName = digitalFileName;
		description = String.format("Digital Print of %s stored digitally at %s.", imageName, digitalFileName);
	}
	
	@Override
	public String getDescription() {
		return description;
	}
	
	@Override
	public void printDescription() {
		System.out.println(description);
	}
	
	private String description;
	private String imageName;
	private String digitalFileName;
}
