import java.util.Arrays;

public class Uebung_7_Ueberweisung {

	private String nameAuftraggeber;
	private long kontoEmpfaenger;
	private char[] verwendungszweck = new char[40];
	private long BetragEuro;

	public Uebung_7_Ueberweisung() {

	}

	public Uebung_7_Ueberweisung(String nameAuftraggeber, long kontoEmpfaenger, char[] verwendungszweck,
			long betragEuro) {
		this.nameAuftraggeber = nameAuftraggeber;
		this.kontoEmpfaenger = kontoEmpfaenger;
		this.verwendungszweck = verwendungszweck;
		BetragEuro = betragEuro;
	}

	public static void main(String[] args) {
		char[] x = new char[10];
		for (int i = 0; i < 10; i++) {
			x[i] = (char) ('a' + i);
		}

		Uebung_7_Ueberweisung ue1 = new Uebung_7_Ueberweisung("Schorr", 123, x, 200);

		System.out.println(ue1.toString());
	}

	public String getNameAuftraggeber() {
		return nameAuftraggeber;
	}

	public void setNameAuftraggeber(String nameAuftraggeber) {
		this.nameAuftraggeber = nameAuftraggeber;
	}

	public long getKontoEmpfaenger() {
		return kontoEmpfaenger;
	}

	public void setKontoEmpfaenger(long kontoEmpfaenger) {
		this.kontoEmpfaenger = kontoEmpfaenger;
	}

	public char[] getVerwendungszweck() {
		return verwendungszweck;
	}

	public void setVerwendungszweck(char[] verwendungszweck) {
		this.verwendungszweck = verwendungszweck;
	}

	public long getBetragEuro() {
		return BetragEuro;
	}

	public void setBetragEuro(long betragEuro) {
		BetragEuro = betragEuro;
	}

	@Override
	public String toString() {
		return "Uebung_7_Ueberweisung [nameAuftraggeber=" + nameAuftraggeber + ", kontoEmpfaenger=" + kontoEmpfaenger
				+ ", verwendungszweck=" + Arrays.toString(verwendungszweck) + ", BetragEuro=" + BetragEuro + "]";
	}

}
