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
		return mitgliederID;
	}
	
	/**
	 * @param newMitgliedsJahre bekommt den wert übergeben und speichert diese in mitgliedsJahre ab
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
	 * @return den nachnamen, durch die get methode können wir auf sie zugreifen
	 */
	String getNachname() {
		return nachname;
	}
	/**
	 * @param newNachname bekommt eine variable übergeben und diese wird in nachname gespeichert 
	 */
	public void setNachname(String newNachname){
		nachname = newNachname;
	}

	/**
	 * @return den vornamen
	 */
	String getVorname() {
		return vorname;
	}
	
	/**
	 * @param newVorname bekommt eine Variable übergeben und diese wird in vorname gespeichert
	 */
	public void setVorname(String newVorname){
		vorname = newVorname;
	}

	/**
	 * toString gibt Informationen über ein Mitglied aus
	 */
	public String toString() {
		System.out.println(mitgliederID +" "+ vorname +" "+ nachname+" "+ mitgliedsJahre);
		return null;
	}
	
	/**
	 * Abfrage ob die ID des einen Members identisch ist wie vom zweiten Member
	 */
	public boolean hasTheSameMemberID(Member member2){
		if(getMitgliederID() != member2.getMitgliederID()){
			System.out.println("Die IDs sind nicht identisch");
			return true;
		}else{
			System.out.println("Die IDs sind identisch ");
			return false;
		}
	}


	/**
	 * Fragt ab ob es sich bei den Member um einen jungen oder alten Member handelt.
	 */
	public void hasMembership(){
		if (mitgliedsJahre < 5) {
			System.out.println("Fresh Member!");
		} else {
			if(mitgliedsJahre >5 && mitgliedsJahre < 11){
				System.out.println("Old Member!");
			}else{
				if(mitgliedsJahre > 10){
					System.out.println("Very Old Member!");
				}
			}
		}
	}

	/**
	 * die mitgliedsJahre von zwei Mitgliedern vergleichen
	 */
	
	public boolean hasSameMitgliedsJahre (Member member2) {
		if(getMitgliedsJahre() == member2.getMitgliedsJahre()){
			System.out.println("Memebers: Die mitgliedsJahre sind genau gleich.");
		return true;
		}else{
			System.out.println("Memebers traten nicht im gleichem Jahr ins Verein ein. ");
		return false;
		}
	}
	
	/**
	 * Die nachnamen von zwei personen werden vergleicht
	 */
	public boolean isTheSameNachname(Member member2){
		if(getNachname() == member2.getNachname()){
			System.out.println("Members haben den gleichen Nachnamen");
			return true;
		}else{
			System.out.println("Dieser Nachnamen kommt nur einmal vor");
			return false;
		}
	}
	/**
	 * vergleiche ob der Vorname mehr als einmal vorkommt
	 */
	public boolean isTheSameVorname(Member member2){
		if(getVorname()== member2.getVorname()){
			System.out.println("Members haben den gleichen Vornamen");
			return true;
		}else{
			System.out.println("Dieser Vorname kommt nur einmal vor");
			return false;
		}
	}
}
