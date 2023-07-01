
public class Uebung_5_3 {
	private String autor;
	private String titel;
	private int isbn_Nummer;
	private String verlag;

	public static void main(String[] args) {
//		Schreiben Sie eine Klasse, die einige Daten eines Buches repr¨asentiert. Es sollte
//		(private) Attribute f¨ur den (nur einen) Autor, den Titel, die ISBN-Nummer und
//		den Verlag geben. Schreiben Sie zu jedem Attribut eine entsprechende Setter- und
//		Getter-Methode. Deklarieren Sie auch eine Methode toString(), die eine entsprechend
//		formatierte Ausgabe liefert.

		Uebung_5_3 test = new Uebung_5_3();
		test.setAutor("Babsi");
		test.setTitel("Lieber mit dem Fuß");
		test.setIsbn_Nummer(12345);
		test.setVerlag("Babsis Bücher");
		System.out.print(test.toString());
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public int getIsbn_Nummer() {
		return isbn_Nummer;
	}

	public void setIsbn_Nummer(int isbn_Nummer) {
		this.isbn_Nummer = isbn_Nummer;
	}

	public String getVerlag() {
		return verlag;
	}

	public void setVerlag(String verlag) {
		this.verlag = verlag;
	}

	@Override
	public String toString() {
		return "Uebung_5_3 [getAutor()=" + getAutor() + ", getTitel()=" + getTitel() + ", getIsbn_Nummer()="
				+ getIsbn_Nummer() + ", getVerlag()=" + getVerlag() + "]";
	}

}
