package prints;

public class PrintTester {

	public static void main(String[] args) {
		Print p = new BasicPrint("Mona Lisa", 5, 5, PaperType.GLOSSY);
		p.printDescription();
		p = new MatPrint(p, Color.BLACK);
		p.printDescription();
		p = new MatPrint(p, Color.BLUE);
		p.printDescription();
	}
}
