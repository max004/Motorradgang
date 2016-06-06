import java.util.ArrayList;


public class Motorradfahrer {

	private int motorradfahrerID;
	private String vorname;
	private String nachname;
	private String motorrad;
	private String geschlecht;
	private ArrayList<Ausfahrt> ausfahrten;
	
	
	public Motorradfahrer(int id, String vorname, String nachname, String motorrad, String geschlecht ){
		
		this.motorradfahrerID = id;
		this.vorname = vorname;
		this.nachname = nachname;
		this.motorrad = motorrad;
		this.geschlecht = geschlecht;
		
	}


	public int getMotorradfahrerId() {
		return motorradfahrerID;
	}


	public void setId(int id) {
		this.motorradfahrerID = id;
	}


	public String getVorname() {
		return vorname;
	}


	public void setVorname(String vorname) {
		this.vorname = vorname;
	}


	public String getNachname() {
		return nachname;
	}


	public void setNachname(String nachname) {
		this.nachname = nachname;
	}


	public String getMotorrad() {
		return motorrad;
	}


	public void setMotorrad(String motorrad) {
		this.motorrad = motorrad;
	}


	public String getGeschlecht() {
		return geschlecht;
	}


	public void setGeschlecht(String geschlecht) {
		
		if(geschlecht == "M" || geschlecht == "m" || geschlecht == "W" || geschlecht == "w"){
		
			this.geschlecht = geschlecht.toUpperCase();
			
		}
		
		else
			
			System.out.println("Keine oder falsche Geschlechtsangabe");
			this.geschlecht = "U";
		
	}


	
	public String toString() {
		return "Motorradfahrer [id=" + motorradfahrerID + ", vorname=" + vorname
				+ ", nachname=" + nachname + ", motorrad=" + motorrad
				+ ", geschlecht=" + geschlecht + "]";
	}


	
	
	
	
}
