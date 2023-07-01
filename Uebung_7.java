import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Uebung_7 {

	public static void main(String[] args) {
		Aufgabe_4();

	}

	public static void Aufgabe_2() {
//		Die ganzzahlige Variable Zufallszahl soll in einer Schleife zuf¨allige Werte zwischen
//		0 und 9 annehmen. Es soll eine Ausnahme ausgel¨ost und abgefangen
//		werden, wenn derWert 0 angenommen wird. Zu diesem Zweck ist eine Ausnahmeklasse
//		IstNull zu erstellen, die eine entsprechende Fehlermeldung speichert.
//		Bemerkung: Die Zufallszahl kann mittels (int) (Math.random () * 10.) erzeugt
//		werden.
		while (true) {
			try {
				int x = (int) (Math.random() * 10);
				System.out.println(x);
				if (x == 0) {
					throw new Uebung_7_IstNull();
				}

			} catch (Uebung_7_IstNull e) {
				break;
			}

		}
	}

	public static void Aufgabe_3() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Welchen Fehler erzeugen?\n(1)ArithmeticException\n(2)NullPointerException");
			int a = sc.nextInt();
			sc.close();
			switch (a) {
			case 1:
				a = 7 / 0;
				break;
			case 2:
				String i = null;
				a = i.length();
			}

		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		System.out.print("Programm läuft nach catch noch!");
	}

	public static void Aufgabe_4() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Welchen Fehler erzeugen?\n(1)FileNotFoundException\n"
					+ "(2)ArrayIndexOutofBounds\n(3)IOException");
			int a = sc.nextInt();
			sc.close();

			switch (a) {
			case 1:
				File file = new File("falscher Filename");
				Scanner fileScanner = new Scanner(file);
				break;
			case 2:
				int[] i = new int[1];
				i[1] = a;
				break;
			case 3:
				// Simulieren einer IOException
				throw new IOException("Unerwarteter Ein-/Ausgabefehler");

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.print("Programm läuft nach catch noch!");

	}
}
