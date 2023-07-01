
import java.util.Scanner;

public class Uebung_2 {

	public static void main(String[] args) {
		Aufgabe_4();

	}

	public static void Aufgabe_1() {
//		Schreiben Sie ein Programm, bei dem der Benutzer eingeben kann, wie viel 50 Cent-
//		, 2-Cent- und 1 Cent-M¨unzen er hat. Anschließend wird angezeigt, wie viel Geld er
//		in Euro und Cent insgesamt hat.

		Scanner sc = new Scanner(System.in);
		System.out.print("Wie viele 50 Cent Münzen:\t");
		int cent50 = sc.nextInt();
		System.out.print("Wie viele 2 Cent Münzen:\t");
		int cent2 = sc.nextInt();
		System.out.print("Wie viele 1 Cent Münzen:\t");
		int cent1 = sc.nextInt();
		sc.close();
		int all = cent50 * 50 + cent2 * 2 + cent1 * 1;
		System.out.println("Du hast: " + all / 100 + " Euro & " + all % 100 + " Cent!");

	}

	public static void Aufgabe_2() {
//		Die Ankunftszeit eines Zuges ist durch die Angabe einer Stunde (0-23), einer Minute
//		(0-59) beschrieben, z. B. 10:52 Uhr. Wenn der Zug versp¨atet ist, muss die
//		Ankunftszeit neu berechnet werden. Schreiben Sie ein Programm, das die geplante
//		Ankunftszeit und die Versp¨atung (in Minuten) einliest und die neue Ankunftszeit
//		ausgibt.

		Scanner sc = new Scanner(System.in);
		System.out.print("geplante Ankunft (Stunde):\t");
		int hour = sc.nextInt();
		System.out.print("geplante Ankunft (Minute):\t");
		int min = sc.nextInt();
		System.out.print("Verspätung (Minuten):\t");
		min += sc.nextInt();
		sc.close();
		hour += min / 60;
		hour %= 24;
		min %= 60;
		System.out.println("\nNeue Ankunft nach Verspätung:\t" + hour + " : " + min);
	}

	public static void Aufgabe_3() {
//		Eine Zahlenfolge (ai) sei wie folgt definiert:
//			a0 = 1, ai+1 = ai + (i + 1).
//			Schreiben Sie ein Programm, das die Zahlen a0, a1, ..., a99 berechnet und sie in ein
//			Array speichert. Anschließend werden diese 100 Werte ausgegeben. Es sollen immer
//			10 (durch Tabulatoren getrennte) Zahlen in einer Zeile ausgegeben werden, bevor
//			ein Zeilenumbruch erfolgt.

		int[] a = new int[100];
		a[0] = 1;
		for (int i = 0; i < 99; i++) {
			a[i + 1] = a[i] + (i + 1);
		}
		for (int i = 0; i < 100; i++) {
			System.out.print(a[i] + "\t");
			if (i % 10 == 9) {
				System.out.println();
			}
		}
	}

	public static void Aufgabe_4() {


		Scanner sc = new Scanner(System.in);
		System.out.print("Gegeben ist das Polynom p(x) = ax3 + bx2 + cx + d\nGebe a an:\t");
		int a = sc.nextInt();
		System.out.print("Gebe b an:\t");
		int b = sc.nextInt();
		System.out.print("Gebe c an:\t");
		int c = sc.nextInt();
		System.out.print("Gebe d an:\t");
		int d = sc.nextInt();
		sc.close();
		System.out.print("\nx\tp(x)\n");
		for (double x = -5; x <= 5; x+=0.2) {
			System.out.print(x + "\tp(" + (a * x * x * x + b * x * x + c * x + d) + ")\n");
		}

	}
}
