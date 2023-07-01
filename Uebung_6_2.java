import java.util.LinkedList;
import java.util.List;

public class Uebung_6_2 {

	Uebung_5_2 anschrift = new Uebung_5_2();
	List<Uebung_5_3> ausleihe = new LinkedList<>();

	public static void main(String[] args) {
//		Schreiben Sie nun eine Klasse, die eine Person, genauer eine Leserin bzw. Leser einer
//		Bibliothek repr¨asentiert (vgl. Abb. 1). Eine Person hat einen Namen, genau eine
//		Postanschrift und kann verschiedene B¨ucher (aus Aufgabe 2) ausgeliehen haben.
//		Die Klasse soll die foldenden Methoden haben:
	}

	public void ausleihe(Uebung_5_3 buch) {
		ausleihe.add(buch);
	}

	public void rueckgabe(Uebung_5_3 buch) {
		ausleihe.remove(buch);
	}

	public List<Uebung_5_3> aktAusleihe() {
		return ausleihe;
	}

}
