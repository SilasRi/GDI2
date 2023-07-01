
import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Uebung_4 {

	public static void main(String[] args) {
		Aufgabe_7();
	}

	public static void Aufgabe_1() {
//		Schreiben Sie ein Programm, das die Zahlen aus einer von Ihnen erstellten Datei
//		data.txt einliest und das Maximum, das Minimum sowie den arithmetischen
//		Mittelwert bestimmt und ausgibt.
//		Eine weitere statistische Kenngr®oﬂe ist der Median. Der Median einer Auflistung
//		von Zahlenwerten ist der Wert, der an der mittleren (zentralen) Stelle steht, wenn
//		man die Werte der Gr®oﬂe nach sortiert. Beispielsweise ist f®ur die Werte 4, 1, 37, 2, 1
//		die Zahl 2 der Median, n®amlich die mittlere Zahl in 1, 1, 2, 4, 37.
//		Erg®anzen Sie Ihr Programm um die Ausgabe des Medians.
//		Aufgabe

		List<Integer> numbers = new LinkedList<>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
			String line = reader.readLine();
			while (line != null) {
				numbers.add(Integer.parseInt(line));
				line = reader.readLine();
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(numbers);
		Collections.sort(numbers);
		System.out.println(numbers);
		float addAll = 0;
		for (int i : numbers) {
			addAll += i;
		}
		System.out.print("Maximum:\t" + numbers.get(numbers.size() - 1) + "\nMinimum:\t" + numbers.get(0)
				+ "\narithmetische Mittelwert:\t" + (addAll / numbers.size()) + "\nMedian:\t"
				+ numbers.get((numbers.size() / 2)));
	}

	public static void Aufgabe_2() {
//		Schreiben Sie ein Programm, das zwei Datumseingaben (Tag, Monat und Jahr)
//		einliest und aus gibt, ob das erste Datum vor oder nach dem zweiten Datum liegt,
//		oder ob die beiden gleich sind. Beachten Sie, dass die Klasse LocalDate hierzu entsprechende
//		Methoden bereitstellt.

		Scanner sc = new Scanner(System.in);
		System.out.print("Geben Sie das erste Datum ein (TT.MM.JJJJ):\t");
		String date1string = sc.nextLine();
		LocalDate date1 = LocalDate.parse(date1string, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

		System.out.print("Geben Sie das zweite Datum ein (TT.MM.JJJJ):\t");
		String date2string = sc.nextLine();
		LocalDate date2 = LocalDate.parse(date2string, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

		sc.close();

		if (date1.equals(date2)) {
			System.out.println("\n" + date1string + " und " + date2string + " sind gleich");
		} else if (date1.isBefore(date2)) {
			System.out.println("\n" + date1string + " liegt vor " + date2string);
		} else {
			System.out.println("\n" + date2string + " liegt vor " + date1string);
		}
	}

	public static void Aufgabe_3() {
//		Schreiben Sie ein Programm, das ein bereits vergangenes Datum (Tag, Monat und
//		Jahr) einliest und die vergangene Zeitdifferenz zu heute in Tagen ausgibt. Mit dem
//		Programm k®onnen Sie z.B. immer aktuell ihr Alter in Tagen ausrechnen .

		Scanner sc = new Scanner(System.in);
		System.out.print("Geben Sie ein Datum ein (TT.MM.JJJJ):\t");
		String dateString = sc.nextLine();
		sc.close();
		LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
		LocalDate now = LocalDate.now();

		long days = ChronoUnit.DAYS.between(date, now);

		System.out.println("Seit dem " + dateString + " sind " + days + " Tage vergangen.");

	}

	public static void Aufgabe_4() {
//		Schreiben Sie ein Java-Programm, das folgende Figur auf den Bildschirm ausgibt.
//		(Die drei Figuren sollen nebeneinander ausgegeben werden):
//		********** * *******
//		* * *** *****
//		* * ***** ***
//		********** ******* *
//		Erweitern sie Ihr Programm so, dass die Figuren beliebig oft hintereinander ausgeben
//		werden.
		Scanner sc = new Scanner(System.in);
		System.out.print("Wie oft ausgeben?   ");
		int out = sc.nextInt();
		sc.close();
		for (int i = 0; i < out; i++) {
			System.out.println("**********    *     *******");
			System.out.println("*        *   ***     *****");
			System.out.println("*        *  *****     ***");
			System.out.println("********** *******     *\n");
		}

	}

	public static void Aufgabe_5() {
//		Schreiben Sie ein Java-Programm, das eine integer-Variable n ®uber die Kommandozeile
//		einliest und diese ®uberpr®uft ob sie positiv und ungerade ist. Ist dies nicht der
//		Fall, beendet sich die Anwendung mit einem entsprechenden Hinweis f®ur den Benutzer,
//		ansonsten zeichnet die Anwendung mit í*í Zeichen eine Raute aus n Zeilen.
//		Beispiel: F®ur n = 5 soll folgende Ausgabe erfolgen:
//		*
//		***
//		*****
//		***
//		*

		Scanner sc = new Scanner(System.in);

		System.out.print("Bitte geben Sie eine positive ungerade Zahl ein: ");
		int n = sc.nextInt();

		sc.close();

		if (n <= 0 || n % 2 == 0) {
			System.out.println("Die Zahl muss positiv und ungerade sein.");
			return;
		}

		int halfRows = n / 2;

		// Obere H‰lfte der Raute
		for (int i = 0; i <= halfRows; i++) {
			for (int j = 0; j < halfRows - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Untere H‰lfte der Raute
		for (int i = halfRows - 1; i >= 0; i--) {
			for (int j = 0; j < halfRows - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void Aufgabe_6() {
//		Aufgabe 6
//		Schreiben Sie ein Java-Programm, das eine maximal zweistellige ganze positive Zahl
//		n
//		î
//		in Wortenì auf den Bildschirm ausgibt.
//		Eingabe: n (0..99) Ausgabe: n
//		î
//		in Wortenì
//		Beispiel: Eingabe: 12 Ausgabe: zw®olf

		String[] firstTwenty = { "null", "eins", "zwei", "drei", "vier", "f¸nf", "sechs", "sieben", "acht", "neun",
				"zehn", "elf", "zwˆlf", "dreizehn", "vierzehn", "f¸nfzehn", "sechzehn", "siebzehn", "achtzehn",
				"neunzehn" };
		String[] zehner = { "", "", "zwanzig", "dreiﬂig", "vierzig", "f¸nfzig", "sechzig", "siebzig", "achtzig",
				"neunzig" };

		Scanner sc = new Scanner(System.in);
		System.out.print("Geben Sie eine Zahl zwischen 0 und 99 ein: ");
		int zahl = sc.nextInt();
		sc.close();
		if (zahl < 20) {
			System.out.println(firstTwenty[zahl]);
		} else {
			firstTwenty[1] = "ein";
			if (zahl % 10 != 0) {
				System.out.println(firstTwenty[zahl % 10] + "und" + zehner[zahl / 10]);
			} else {
				System.out.println(zehner[zahl / 10]);
			}

		}
	}

	public static void Aufgabe_7() {
//		F®ur die Multiplikation n∑m zweier ganzer Zahlen kleiner 10 wollen wir das Produkt
//		vorberechnen und in einer Tabelle zum sp®ateren Nachschlagen (look-up-table, LUT)
//		abspeichern. Der Einfachheit halber soll dazu ein rechteckiges zweidimensionales
//		Array lut benutzt werden. Gehen sie dabei wie folgt vor:
//		1. Formulieren Sie den Java-Quellcode zum Anlegen der LUT lut.
//		2. Formulieren Sie den Java-Quellcode zum Abfragen des Produkts n ∑ m aus
//		der LUT lut bei gegebenem n,m. Bei Bereichs®uberschreitung ist das Produkt
//		obligat zu berechnen.
//		3. Schreiben Sie eine Java-Anwendung, welche die beiden int-Variablen n und
//		m vom Benutzer einliest und das Produkt n ∑ m unter Verwendung der LUT
//		berechnet und ausgibt.

		int LUT[][] = new int[10][10];
		for (int y = 0; y < 10; y++) {
			for (int x = 0; x < 10; x++) {
				LUT[x][y] = x * y;
			}
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("Gib 2 Zahlen f¸r die Multiplikation ein:\nZahl 1:\t");
		int num1 = sc.nextInt();
		System.out.print("Zahl 2:\t");
		int num2 = sc.nextInt();
		sc.close();
		if (num1 <= 9 && num2 <= 9) {
			System.out.println("Ergebnis:\t" + LUT[num1][num2]);
		} else {
			System.out.println("Ergebnis:\t" + num1 * num2);
		}
	}
}
