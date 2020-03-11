package prints;

public enum PaperType {
	MATTE("matte"),
	GLOSSY("glossy");
	
	private String label;
	
	private PaperType(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}
}
