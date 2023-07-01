
public class Uebung_5_2 {
	private String name;
	private String straﬂenanschrift;
	private int postleitzahl;
	private String stadt;
	private String land;

	public static void main(String[] args) {
//		Schreiben Sie eine Klasse, die die Postanschrift einer Person repr®asentiert. Es sollte
//		(private) Attribute f®ur Namen, die Straﬂenanschrift, die Postleitzahl, die Stadt und
//		das Land geben. Schreiben Sie zu jedem Attribut eine entsprechende setter- und
//		getter-Methode. Deklarieren Sie auch eine Methode toString(), die eine entsprechend
//		formatierte Ausgabe liefert.

		Uebung_5_2 test = new Uebung_5_2();
		test.setName("Peter");
		test.setStraﬂenanschrift("Schorr schieﬂt Tor");
		test.setPostleitzahl(12345);
		test.setName("Frankfurt");
		test.setName("Deutschland");
		System.out.print(test.toString());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStraﬂenanschrift() {
		return straﬂenanschrift;
	}

	public void setStraﬂenanschrift(String straﬂenanschrift) {
		this.straﬂenanschrift = straﬂenanschrift;
	}

	public int getPostleitzahl() {
		return postleitzahl;
	}

	public void setPostleitzahl(int postleitzahl) {
		this.postleitzahl = postleitzahl;
	}

	public String getStadt() {
		return stadt;
	}

	public void setStadt(String stadt) {
		this.stadt = stadt;
	}

	public String getLand() {
		return land;
	}

	public void setLand(String land) {
		this.land = land;
	}

	public String toString() {
		return "Uebung_5_2 [name=" + name + ", straﬂenanschrift=" + straﬂenanschrift + ", postleitzahl=" + postleitzahl
				+ ", stadt=" + stadt + ", land=" + land + "]";
	}
}
