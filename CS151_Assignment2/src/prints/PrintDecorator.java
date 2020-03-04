package prints;

public class PrintDecorator implements Print {
	private Print p;
	
	@Override
	public String getDescription() {
		return p.getDescription();
	}

}
