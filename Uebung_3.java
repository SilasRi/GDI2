import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Uebung_3 {

	public static void main(String[] args) {
		Aufgabe_3();
	}

	public static void Aufgabe_1() {
//		Implementieren Sie eine statische Methode
//		public static int[] merge(int[] a1, int[] a2, int[] a3),
//		die drei int-Arrays als Argumente erh¨alt und sie in ein neues Array merged, d.h.
//		die Element im Reißverschlussverfahren einf¨ugt. Beispiel:
//		int [] a1 = new int []{1 ,3 ,4 ,5 ,6 ,7};
//		int [] a2 = new int []{2 ,7 ,4};
//		int [] a3 = new int []{1 ,12 ,42 ,0};
//		liefert :
//		[1, 2, 1, 3, 7, 12, 4, 4, 42, 5, 0, 6, 7]

		int[] a1 = new int[] { 1, 3, 4, 5, 6, 7 };
		int[] a2 = new int[] { 2, 7, 4 };
		int[] a3 = new int[] { 1, 12, 42, 0 };
		int[] merge = new int[(a1.length + a2.length + a3.length)];

		for (int i = 0, count = 0; i < (a1.length + a2.length + a3.length); i++) {
			if (i < a1.length) {
				merge[count] = a1[i];
				count++;
			}
			if (i < a2.length) {
				merge[count] = a2[i];
				count++;
			}
			if (i < a3.length) {
				merge[count] = a3[i];
				count++;
			}
		}
		for (int i = 0; i < merge.length; i++) {
			System.out.print(merge[i] + "  ");
		}
	}

	public static void Aufgabe_2() {
//		Schreiben Sie ein Programm, das die Effizienz von ArrayList<Integer> und LinkedList<Integer>
//		untersucht.
//		F¨uhren Sie f¨ur folgende Operationen 100000 mal aus und vergleichen Sie die ben¨otigten
//		Zeiten (mit System.nanoTime()
//		1. Anf¨ugen eines Elements an das Ende (mit add(Integer a)
//		2. Einschieben eines Elements am Anfang (mit add(int index, Integer a)
//		F¨uhren Sie nach der Erzeugung der Listen die folgenden Aktionen aus, und messen
//		Sie die entsprechenden Zeiten:
//		1. Summieren aller Elemente mit Hilfe von einer for-Schleife und der get(int pos)-
//		Methode.
//		2. Summieren aller Elemente mit Hilfe der foreach-Schleife.
//		Hinweis Verwenden Sie ein Random-Objekt und dessen Methode nextInt(), um ein
//		zuf¨alliges Objekt vom Typ Integer zu erzeugen.

		final int runs = 100000;
		Random random = new Random();
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		long startTime, endTime;

		startTime = System.nanoTime();
		for (int i = 0; i < runs; i++) {
			linkedList.add(random.nextInt());
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList - add(Integer a):	" + (endTime - startTime));

		startTime = System.nanoTime();
		for (int i = 0; i < runs; i++) {
			arrayList.add(random.nextInt());
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList - add(Integer a):	" + (endTime - startTime) + "\n");

		startTime = System.nanoTime();
		for (int i = 0; i < runs; i++) {
			linkedList.add(0, random.nextInt());
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList - add(int index, Integer a):	" + (endTime - startTime));

		startTime = System.nanoTime();
		for (int i = 0; i < runs; i++) {
			arrayList.add(0, random.nextInt());
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList - add(int index, Integer a):	" + (endTime - startTime) + "\n");

		int add = 0;

		startTime = System.nanoTime();
		for (int i = 0; i < linkedList.size(); i++) {
			add += linkedList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList - Summieren mit for:	" + (endTime - startTime));

		add = 0;
		startTime = System.nanoTime();
		for (int i = 0; i < arrayList.size(); i++) {
			add += arrayList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList - Summieren mit for:	" + (endTime - startTime) + "\n");

		add = 0;
		startTime = System.nanoTime();
		for (int i : linkedList) {
			add += i;
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList - Summieren mit foreach:	" + (endTime - startTime));

		add = 0;
		startTime = System.nanoTime();
		for (int i : arrayList) {
			add += i;
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList - Summieren mit foreach:	" + (endTime - startTime) + "\n");
	}

	public static void Aufgabe_3() {
//		Implementieren Sei eine statische Methode intersection, welche die Schnittmenge
//		von zwei Set<Integer> bildet. Vergleich folgendes Beispiel:
//		public class Aufgabe4
//		{
//		public static void main ( String [] args )
//		{
//		Set < Integer > set1 = new HashSet < >();
//		Set < Integer > set2 = new HashSet < >();
//		set1 .add (3);
//		set1 .add (7);
//		set2 .add (7);
//		set2 .add (12) ;
//		Set < Integer > result = intersection (set1 , set2 );
//		System . out. println ( result );
//		}
//		public static Set < Integer > intersection (
//		Set < Integer > set1 , Set < Integer > set2 ) {
//		// TO DO - hier eigenen Code implementieren
//		}
//		}

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		set1.add(3);
		set1.add(7);
		set2.add(7);
		set2.add(12);
		Set<Integer> result = intersection(set1, set2);
		System.out.println(result);

	}

	public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> help = new HashSet<>();

		for (int i : set1) {
			if (set2.contains(i)) {
				help.add(i);
			}
		}
		return help;
	}
}
