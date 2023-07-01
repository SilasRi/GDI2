
public class Uebung_6_1_Testumgebung {

	public static void main(String[] args) {
		System.out.println("Quadratfunktion:");
		Uebung_6_1_Printer.printFunction(new Quadrat());

		System.out.println("\nQuadratwurzelfunktion:");
		Uebung_6_1_Printer.printFunction(new Quadratwurzel());

		System.out.println("\nFunktion 2x:");
		Uebung_6_1_Printer.printFunction(new x2());
	}

}

class Quadrat implements Uebung_6_1_IFunction {
	@Override
	public double getVal(double x) {
		return x * x;
	}

}

class Quadratwurzel implements Uebung_6_1_IFunction {
	@Override
	public double getVal(double x) {
		return Math.sqrt(x);
	}

}

class x2 implements Uebung_6_1_IFunction {
	@Override
	public double getVal(double x) {
		return 2 * x;
	}

}
