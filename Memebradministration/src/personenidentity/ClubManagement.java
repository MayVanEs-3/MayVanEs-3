package personenidentity;

//System.out.println();
import java.util.ArrayList;
import java.util.Collection;

class ClubManagement extends MembershipList {

	/**
	 * Member eins, zwei, drei soll Daten der Member speichern 
	 * �ber addAll werden die Daten wieder ausgegeben
	 */
	public void saveData() {
		ArrayList<String> MemberInfo = new ArrayList<String>();

		Member eins = new Member(2, "Max", "Mustermann", 16);
		Member zwei = new Member(6, "Anette", "Koch", 15);
		Member drei = new Member(5, "Bart", "Simpson", 9);
		Member vier = new Member(3, "Lisa", "Simpson", 5);

		MemberInfo.addAll((Collection<? extends String>) eins);
		MemberInfo.addAll((Collection<? extends String>) zwei);
		MemberInfo.addAll((Collection<? extends String>) drei);
		MemberInfo.addAll((Collection<? extends String>) vier);
		/**
		 * L�nge der Vereinsliste ausgeben
		 */
		System.out.println("Die Liste hat" + MemberInfo.size() + "Mitglieder.");
		/**
		 * Mitglieder ausgeben
		 */
		System.out.println(MemberInfo.get(0));
		System.out.println(MemberInfo.get(1));
		System.out.println(MemberInfo.get(2));
		System.out.println(MemberInfo.get(3));
		/**
		 * l�scht den Nutzer mit der ID 2 (Member eins)
		 */
		MemberInfo.remove(eins);
		/**
		 * neue Vereinsliste erstellen
		 * mit for-Schleife... wenn MemberInfo = -1,
		 * dann neue Liste ausgeben...nur wie?
		 */
		System.out.println(MemberInfo.get(1));
		System.out.println(MemberInfo.get(2));
		System.out.println(MemberInfo.get(3));
		/**
		 * Member mit der ID 5 ausgeben
		 */
		System.out.println(MemberInfo.get(2));
		/**
		 * Vorname der ID 5 in
		 * G�nther um�ndern
		 */
		MemberInfo.set(2, "G�nther");
		/**
		 * Mitglied auf der Konsole ausgeben
		 */
		System.out.println("G�nther hat die ID 5");
		/**
		 * ID 5 l�schen
		 */
		MemberInfo.remove(zwei);
		/**
		 * alle Mitglieder der ersten
		 * und zweiten Liste ausgeben
		 */
		System.out.println(MemberInfo.get(0));
		System.out.println(MemberInfo.get(1));
		System.out.println(MemberInfo.get(2));
		System.out.println(MemberInfo.get(3));
		System.out.println(MemberInfo.get(1));
		System.out.println(MemberInfo.get(2));
		System.out.println(MemberInfo.get(3));
		System.out.println(MemberInfo.get(2));
		/**
		 * beide Listen l�schen
		 */
		//MemberInfo.remove(eins);
		//MemberInfo.remove(zwei);
		//MemberInfo.remove(drei);
		//MemberInfo.remove(vier);
		MemberInfo.removeAll(MemberInfo);
		System.out.println(MemberInfo.size());
		
	//Leider vergessen f�r was das nochmal sein sollte	
//		MemberInfo.set(0, getMitgliederID());

	}
}