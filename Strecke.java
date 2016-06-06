import java.util.ArrayList;


public class Strecke {
	
/*	StreckenID INT NOT NULL,
	Startort VARCHAR(30) NOT NULL,
	StartPlz VARCHAR(10) NOT NULL,
	StartLand VARCHAR(3) NOT NULL,
	Zielort VARCHAR(30) NOT NULL,
	ZielPlz VARCHAR(10) NOT NULL,
	ZielLand VARCHAR(3) NOT NULL,
*/
	
	private int streckenID;
	private String startOrt;
	private String startPlz;
	private String startLand;
	private String zielOrt;
	private String zielPlz;
	private String zielLand;
	private ArrayList<Ausfahrt> ausfahrten;
	
	
	public Strecke(int streckenID, String startOrt, String startPlz,
			String startLand, String zielOrt, String zielPlz, String zielLand,
			ArrayList<Ausfahrt> ausfahrten) {
		super();
		this.streckenID = streckenID;
		this.startOrt = startOrt;
		this.startPlz = startPlz;
		this.startLand = startLand;
		this.zielOrt = zielOrt;
		this.zielPlz = zielPlz;
		this.zielLand = zielLand;
		this.ausfahrten = ausfahrten;
	}
	
	
	public int getStreckenID() {
		return streckenID;
	}
	public void setStreckenID(int streckenID) {
		this.streckenID = streckenID;
	}
	public String getStartOrt() {
		return startOrt;
	}
	public void setStartOrt(String startOrt) {
		this.startOrt = startOrt;
	}
	public String getStartPlz() {
		return startPlz;
	}
	public void setStartPlz(String startPlz) {
		this.startPlz = startPlz;
	}
	public String getStartLand() {
		return startLand;
	}
	public void setStartLand(String startLand) {
		this.startLand = startLand;
	}
	public String getZielOrt() {
		return zielOrt;
	}
	public void setZielOrt(String zielOrt) {
		this.zielOrt = zielOrt;
	}
	public String getZielPlz() {
		return zielPlz;
	}
	public void setZielPlz(String zielPlz) {
		this.zielPlz = zielPlz;
	}
	public String getZielLand() {
		return zielLand;
	}
	public void setZielLand(String zielLand) {
		this.zielLand = zielLand;
	}
	public ArrayList<Ausfahrt> getAusfahrten() {
		return ausfahrten;
	}
	public void setAusfahrten(ArrayList<Ausfahrt> ausfahrten) {
		this.ausfahrten = ausfahrten;
	}


	public String toString() {
		return "Strecke [streckenID=" + streckenID + ", startOrt=" + startOrt
				+ ", startPlz=" + startPlz + ", startLand=" + startLand
				+ ", zielOrt=" + zielOrt + ", zielPlz=" + zielPlz
				+ ", zielLand=" + zielLand + ", ausfahrten=" + ausfahrten + "]";
	}
	
	
	
}
