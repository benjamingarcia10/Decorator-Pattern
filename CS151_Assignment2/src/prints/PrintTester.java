package prints;

public class PrintTester {

	public static void main(String[] args) {
		Print p = new BasicPrint("Mona Lisa", 5, 5);
		p.printDescription();
		p = new MatPrint(p, Color.BLACK);
		p.printDescription();
		p = new MatPrint(p, Color.BLUE);
		p.printDescription();
		p = new DigitalPrint(p, "Shutterstock", 12);
		p.printDescription();
		p = new FramePrint(p);
		p.printDescription();
	}
}
