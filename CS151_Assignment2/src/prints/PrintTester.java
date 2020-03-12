package prints;

/**
 * Tester for print decorations
 * @author benja
 *
 */
public class PrintTester {

	public static void main(String[] args) {
		Print p1 = new BasicPrint("Mona Lisa", 5, 5);
		//p1.printDescription();
		p1 = new GlossyPrint(p1);
		//p1.getDescription();
		p1 = new MatPrint(p1, MatColor.BLACK);
		//p1.printDescription();
		p1 = new MatPrint(p1, MatColor.BLUE);
		//p1.printDescription();
		p1 = new FramePrint(p1);
		p1.printDescription();
		
		Print p2 = new BasicPrint("Golden Gate Bridge", 7, 5);
		//p2.printDescription();
		p2 = new DigitalPrint(p2, "Shutterstock", 20);
		p2.printDescription();
		
		Print p3 = new BasicPrint("SJSU", 30, 10);
		//p3.printDescription();
		p3 = new MattePrint(p3);
		//p3.printDescription();
		p3 = new FramePrint(p3);
		//p3.printDescription();
		p3 = new MatPrint(p3, MatColor.GOLD);
		p3.printDescription();
		
		Print p4 = new BasicPrint("Stairs to Heaven", 8, 11);
		//p4.printDescription();
		p4 = new FramePrint(p4);
		p4.printDescription();
		
		Print p5 = new BasicPrint("Wondering", 20, 16);
		//p5.printDescription();
		p5 = new GlossyPrint(p5);
		//p5.printDescription();
		p5 = new MatPrint(p5, MatColor.CYAN);
		p5.printDescription();
	}
}
