package prints;

public class PrintTester {

	public static void main(String[] args) {
		Print p = new BasicPrint("Mona Lisa", 5, 5);
		p.printDescription();
		p = new MatPrint(p, MatColor.BLACK);
		p.printDescription();
		p = new MatPrint(p, MatColor.BLUE);
		p.printDescription();
		p = new DigitalPrint(p, "Shutterstock", 12);
		p.printDescription();
		p = new FramePrint(p);
		p.printDescription();
	}
}
