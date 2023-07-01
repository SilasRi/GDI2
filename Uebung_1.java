
import java.util.Arrays;
import java.util.Scanner;

public class Uebung_1 {

	public static void main(String[] args) {
		Aufgabe_4();

	}

	public static void Aufgabe_1() {
//		Schreiben Sie ein Programm, das zwei ganze Zahlen von der Konsole einliest und
//		anschlieﬂend deren Summe, Differenz, Produkt, den Quotienten und den Divisionsrest
//		auf den Bildschirm ausgibt.
//		Hinweis: Verwenden Sie f®ur das Einlesen die Klasse Scanner.

		Scanner sc = new Scanner(System.in);
		System.out.print("Zahl 1:\t");
		double x = sc.nextInt();
		System.out.print("Zahl 2:\t");
		double y = sc.nextInt();
		sc.close();
		System.out.println("Summe:\t" + (x + y) + "\nDifferenz:\t" + (x - y) + "\nProdukt:\t" + (x * y)
				+ "\nQuotienten:\t" + (x / y) + "\nDivisionsrest:\t" + (x % y));
	}

	public static void Aufgabe_2() {
//		Schreiben Sie ein Programm, das zwei Zahlen einliest und ausgibt, ob eine der
//		beiden Zahlen dem Quadrat der anderen entspricht.

		Scanner sc = new Scanner(System.in);
		System.out.print("Zahl 1:\t");
		double x = sc.nextInt();
		System.out.print("Zahl 2:\t");
		double y = sc.nextInt();
		sc.close();
		if (x * x == y || y * y == x) {
			System.out.println("Ist Quadrat!");
		} else {
			System.out.println("Ist kein Quadrat!");
		}

	}

	public static void Aufgabe_3() {
//		Schreiben Sie ein Programm, das die in Fahrenheit bzw. in Celsius eingelesene Temperatur
//		in die andere Einheit umrechnet.
//		Der Anwender muss am Anfang des Programms die Art der Umrechnung w®ahlen.

		System.out.println("Bitte w‰hlen: " + '\n' + "(1) Fahrenheit in Celsius" + '\n' + "(2) Celsius in Fahrenheit");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.print("Farenheit eingeben:  ");
			float far = sc.nextFloat();
			System.out.println(far + " Farenheit sind = " + ((5 * (far - 32)) / 9) + " Grad Celsius");
			break;
		case 2:
			System.out.print("Celsius eingeben:  ");
			float cel = sc.nextFloat();
			System.out.println(cel + " Grad sind = " + (cel * 1.8 + 32) + " Farenheit");
		}
		sc.close();
	}

	public static void Aufgabe_4() {
//		Schreiben Sie ein Programm, das drei ganze Zahlen einliest und die kleinste der
//		eingegebenen Zahlen ausgibt.

		int[] numbers = new int[3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.print("Bitte Zahl eingeben:\t");
			numbers[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(numbers);
		System.out.println("Kleinste Zahl:" + numbers[0]);

	}
}
