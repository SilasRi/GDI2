
public class Uebung_6_3_Sensor {

	private double wert;
	private double schranke;
	private Uebung_6_3_IAlarm sDefault;

	public Uebung_6_3_Sensor(double schranke) {
		this.schranke = schranke;
	}

	public double getWert() {
		return wert;
	}

	public void setWert(double wert) {
		this.wert = wert;
		if (wert > schranke) {
			sDefault.sendAlarm();
		}
	}

	public double getSchranke() {
		return schranke;
	}

	public void setSchranke(double schranke) {
		this.schranke = schranke;
	}

	public Uebung_6_3_IAlarm getAlarm() {
		return sDefault;
	}

	public void setAlarm(Uebung_6_3_IAlarm alarm) {
		this.sDefault = alarm;
	}

}

class TonAlarm implements Uebung_6_3_IAlarm {

	public void sendAlarm() {
		for (int i = 0; i < 100; i++) {
			System.out.println(((char) 7));
		}
	}
}

class SendAlarm implements Uebung_6_3_IAlarm {

	public void sendAlarm() {
		System.out.println(" Alarm wird ¨u ber Internet geschickt !");
	}
}

class IgnoreAlarm implements Uebung_6_3_IAlarm {

	public void sendAlarm() {
// nichts !
	}
}
