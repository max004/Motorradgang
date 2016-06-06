import java.sql.Date;
public class Ausfahrt {
	
	private int motorradfahrerID;
	private int streckenID;
	private Date zeitpunkt;
	private String beschreibung;
	private Motorradfahrer motorradfahrer;
	private Strecke strecke;
	
	public Ausfahrt(int motorradfahrerID, int streckenID, Date zeitpunkt,
			String beschreibung, Motorradfahrer motorradfahrer, Strecke strecke) {
		super();
		this.motorradfahrerID = motorradfahrerID;
		this.streckenID = streckenID;
		this.zeitpunkt = zeitpunkt;
		this.beschreibung = beschreibung;
		this.motorradfahrer = motorradfahrer;
		this.strecke = strecke;
	}

	public int getMotorradfahrerID() {
		return motorradfahrerID;
	}

	public void setMotorradfahrerID(int motorradfahrerID) {
		this.motorradfahrerID = motorradfahrerID;
	}

	public int getStreckenID() {
		return streckenID;
	}

	public void setStreckenID(int streckenID) {
		this.streckenID = streckenID;
	}

	public Date getZeitpunkt() {
		return zeitpunkt;
	}

	public void setZeitpunkt(Date zeitpunkt) {
		this.zeitpunkt = zeitpunkt;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public Motorradfahrer getMotorradfahrer() {
		return motorradfahrer;
	}

	public void setMotorradfahrer(Motorradfahrer motorradfahrer) {
		this.motorradfahrer = motorradfahrer;
	}

	public Strecke getStrecke() {
		return strecke;
	}

	public void setStrecke(Strecke strecke) {
		this.strecke = strecke;
	}

	public String toString() {
		return "Ausfahrt [motorradfahrerID=" + motorradfahrerID
				+ ", streckenID=" + streckenID + ", zeitpunkt=" + zeitpunkt
				+ ", beschreibung=" + beschreibung + ", motorradfahrer="
				+ motorradfahrer + ", strecke=" + strecke + "]";
	}
	

}
