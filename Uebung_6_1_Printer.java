
public class Uebung_6_1_Printer {

	public static void printFunction(Uebung_6_1_IFunction iFunction) {
		 
		        System.out.println("x\tf(x)");
		        System.out.println("-----------------");
		        for (double x = 1.0; x <= 10.0; x++) {
		            System.out.println(x + "\t" + iFunction.getVal(x));
		        }
		    
	}

}
