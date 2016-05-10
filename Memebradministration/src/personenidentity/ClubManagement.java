package personenidentity;

import java.util.Scanner;

class ClubManagementVERSUCH {

	private MembershipList list = new MembershipList();

	public void saveData(int mitgliederID, int vorname, String nachname, int mitgliedsJahre) {

		Member mem1 = new Member(2, "Heinz", "Mustermann", 16);
		Member mem2 = new Member(6, "Anette", "Koch", 15);
		Member mem3 = new Member(5, "Bart", "Simpson", 9);
		Member mem4 = new Member(3, "Lisa", "Simpson", 5);

		list.put(mem1);
		list.put(mem2);
		list.put(mem3);
		list.put(mem4);

		int memAuswahl;
		int gesuchteEingabe;
		int ergebnis = -1;

		System.out.println("");
		System.out.println("Welche Folge soll benutzt werden?");
		memAuswahl = readInt();

		System.out.println("Welche Zahl soll gesucht werden?");
		gesuchteEingabe = readInt();
  
		/*
		 * if (memAuswahl == 1) { ergebnis = binaereSucheRek(0, mem1.length - 1,
		 * gesuchteEingabe, mem1); } if (memAuswahl == 2) { ergebnis =
		 * binaereSucheRek(0, mem2.length - 1, gesuchteEingabe, mem2); } if
		 * (memAuswahl == 3) { ergebnis = binaereSucheRek(0, mem3.length - 1,
		 * gesuchteEingabe, mem3); } if (memAuswahl == 4) { ergebnis =
		 * binaereSucheRek(0, mem4.length - 1, gesuchteEingabe, mem4); }
		 */
		// memAuswahl > 4 ODER memAuswahl < 0 existiert nicht

		if (memAuswahl > 4 | memAuswahl < 0) {
			System.out.println("Der Member konnte nicht gefunden werden.");
		} else if (ergebnis < 0) {
			System.out.println("Der gesuchte Wert wurde nicht gefunden.");
		} else if (ergebnis >= 0) {
			System.out.println("Die gesuchte ID wurde bei Member " + ergebnis + " gefunden!");
		}
	}

	public static int binaereSucheRek(int links, int rechts, int gesuchteEingabe, int[] array) {

		int mitte = (links + rechts) / 2;
		// Abbruchbedienung falls gesuchteZahl nicht gefunden werden kann
		if (links > rechts) {
			return -1;
		}
		// Falls array leer ist
		if (array.length == 0) {
			return -1;
		}
		if (array[mitte] == gesuchteEingabe) {
			return mitte;
		}
		if (array[mitte] > gesuchteEingabe) {
			return binaereSucheRek(links, mitte - 1, gesuchteEingabe, array);
		}
		if (array[mitte] < gesuchteEingabe) {
			return binaereSucheRek(mitte + 1, rechts, gesuchteEingabe, array);
		}
		return 0;

	}

	public static int readInt() {
		return new Scanner(System.in).nextInt();
	}
}
