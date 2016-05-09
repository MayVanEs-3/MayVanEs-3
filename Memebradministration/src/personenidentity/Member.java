package personenidentity;

public class Member {

	/**
	 * Variablen deklariert
	 */
	private String nachname;
	private String vorname;
	public int mitgliedsJahre;
	private int mitgliederID;
	

	/**
	 * Konstruktor
	 */
	public Member(int mitgliederID,String vorname,String nachname, int mitgliedsJahre ) {
		this.mitgliederID = mitgliederID;
		this.vorname = vorname;
		this.nachname = nachname;
		this.mitgliedsJahre = mitgliedsJahre;
	}
	
	/**
	 * @return mitgliedsJahre
	 */
	public int getMitgliedsJahre(){
		return mitgliedsJahre;
	}
	
	/**
	 * @param newMitgliedsJahre bekommt den wert �bergeben und speichert diese in mitgliedsJahre ab
	 */
	public void setMitgliedsJahre(int newMitgliedsJahre){
		mitgliedsJahre = newMitgliedsJahre;
	}
	
	/**
	 * @return die mitgliederID
	 */
	int getMitgliederID(){
		return mitgliederID;
	}
	
	/**
	 * @return den nachnamen, durch die get methode k�nnen wir auf sie zugreifen
	 */
	public String getNachname() {
		return nachname;
	}
	/**
	 * @param newNachname bekommt eine variable �bergeben und diese wird in nachname gespeichert 
	 */
	public void setNachname(String newNachname){
		nachname = newNachname;
	}

	/**
	 * @return den vornamen
	 */
	public String getVorname() {
		return vorname;
	}
	
	/**
	 * @param newVorname bekommt eine Variable �bergeben und diese wird in vorname gespeichert
	 */
	public void setVorname(String newVorname){
		vorname = newVorname;
	}

	/**
	 * toString gibt Informationen �ber ein Mitglied aus
	 */
	@Override
	public String toString() {
		return  mitgliederID +" "+ vorname +" "+ nachname+" "+ mitgliedsJahre;
	}
	
	/**
	 * Abfrage ob die ID des einen Members identisch ist wie vom zweiten Member
	 */
	public boolean hasTheSameMemberID(Member member2){
		if(getMitgliederID() != member2.getMitgliederID()){
			return true;
		}else{
			return false;
		}
	}

	/**
	 * die mitgliedsJahre von zwei Mitgliedern vergleichen
	 */
	
	public boolean hasSameMitgliedsJahre (Member member2) {
		if(getMitgliedsJahre() == member2.getMitgliedsJahre()){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * Die nachnamen von zwei personen werden vergleicht
	 */
	public boolean isTheSameNachname(Member member2){
		if(getNachname() == member2.getNachname()){
			return true;
		}else{
			return false;
		}
	}
	/**
	 * vergleiche ob der Vorname mehr als einmal vorkommt
	 */
	public boolean isTheSameVorname(Member member2){
		if(getVorname()== member2.getVorname()){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mitgliederID;
		result = prime * result + mitgliedsJahre;
		result = prime * result + ((nachname == null) ? 0 : nachname.hashCode());
		result = prime * result + ((vorname == null) ? 0 : vorname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (mitgliederID != other.mitgliederID)
			return false;
		if (mitgliedsJahre != other.mitgliedsJahre)
			return false;
		if (nachname == null) {
			if (other.nachname != null)
				return false;
		} else if (!nachname.equals(other.nachname))
			return false;
		if (vorname == null) {
			if (other.vorname != null)
				return false;
		} else if (!vorname.equals(other.vorname))
			return false;
		return true;
	}
}
