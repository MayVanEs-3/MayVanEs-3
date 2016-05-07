package personenidentity;

import java.util.ArrayList;
import java.util.List;

class ClubManagement extends MembershipList {

	ClubManagement(String nachname, String vorname, int mitgliedsJahre, int mitgliederID) {
		super();
	}

	public class vereinsliste { // Verein
		ArrayList<vereinsliste> vereinliste = new ArrayList<vereinsliste>();
		ArrayList<Member> memberListe = new ArrayList<Member>();
		

		public vereinsliste(String avorname, String anachname, int amitgliedsJahre, int amitgliederID) {
			this.vorname = avorname;
			this.nachname = anachname;
			this.mitgliederID = amitgliederID;
			this.mitgliedsJahre = amitgliedsJahre;
			vereinliste.add(this);
		}

		private void addMember(Member member) {
			memberListe.add(member);
		}

		public void main(String[] args) {
			Member eins = new Member("Mustermann", "Max", 2, 16);
			Member zwei = new Member("Koch", "Anette", 6, 15);
			Member drei = new Member("Simpson", "Bart", 5, 9);
			Member vier = new Member("Simpson", "Lisa", 3, 5);

			// ArrayList<Member> liste1 = new ArrayList<Member>();

			for (vereinsliste item : vereinliste) {
				System.out.println(
						item.mitgliederID + "," + item.vorname + "," + item.nachname + ";" + item.mitgliedsJahre);
				System.out.println();
			}
		}
	}
}