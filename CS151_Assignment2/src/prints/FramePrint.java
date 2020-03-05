package prints;

public class FramePrint implements Print {
	Print p;
	
	public FramePrint(Print p) {
		this.p = p;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
}
