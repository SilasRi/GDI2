import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Uebung_5_1 {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 1, 3, 4, 3 };
		int[] b = new int[] { 7, 1, 3, 2, 3 };
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i : b) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(toSet(a));
		System.out.println(toSet(b));
		int[] test = vereinigung(a, b);
		for (int i : test) {
			System.out.print(i + " ");
		}

	}

	public static List<Integer> toSet(int[] a) {
//		die ein int-Array in eine Menge in Form eines List-Objekts umwandelt (d.h.
//				die Duplikate werden nicht ber¨ucksichtigt.) Zum Beispiel liefert der Aufruf
//				von toSet(new int[]{1,1,3,4,3}) eine Liste mit den Elementen 1, 3 und 4
//				zur¨uck.

		Set<Integer> set = new HashSet<>();
		for (int i : a) {
			set.add(i);
		}
		return new LinkedList<>(set);
	}

	public static List<Integer> vereinigung(List<Integer> a, List<Integer> b) {
//		die die Vereinigung zweier ,,Mengen” a und b liefert.

		Set<Integer> set = new HashSet<>();
		for (int i : a) {
			set.add(i);
		}
		for (int i : b) {
			set.add(i);
		}
		return new LinkedList<>(set);

	}

	public static int[] vereinigung(int[] a, int[] b) {
//		die die Vereinigung zweier ,,Mengen” a und b liefert.

		List<Integer> list1 = toSet(a);
		List<Integer> list2 = toSet(b);
		List<Integer> list = vereinigung(list1, list2);
		int[] help = new int[list.size()];

		for (int i = 0; i < help.length; i++) {
			help[i] = list.get(i);
		}
		return help;
	}


}
