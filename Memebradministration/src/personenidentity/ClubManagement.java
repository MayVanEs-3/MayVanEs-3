package personenidentity;

import java.util.Scanner;

class ClubManagement {

	public static void main(String[] args) {

		MembershipList list = new MembershipList(); // Inititalisierung der
													// Klasse MembershipList

		Member list1 = new Member(0, null, null, 0);

		Scanner sc = new Scanner(System.in);

		// ClubManagement neueListe = new ClubManagement();

		// public void saveData(int mitgliederID, int vorname, String nachname,
		// int
		// mitgliedsJahre) {

		Member mem1 = new Member(2, "Heinz", "Mustermann", 16);
		Member mem2 = new Member(6, "Anette", "Koch", 15);
		Member mem3 = new Member(5, "Bart", "Simpson", 9);
		Member mem4 = new Member(3, "Lisa", "Simpson", 5);

		list.put(mem1);
		list.put(mem2);
		list.put(mem3);
		list.put(mem4);

		/**
		 * Gibt L�nge der Liste aus
		 */
		list.size();
		System.out.println("Die L�nge betr�gt: " + list.size());

		/**
		 * Entfernt Mitglied und gibt neue L�ngenliste aus
		 */
		// list.remove(2);
		System.out.println("Die L�nge der neuen Liste betr�gt :" + list.remove(2));

		// list.remove
		MembershipList list2 = new MembershipList();
		 list.putAll(list2);
		 System.out.println("Die neue Liste betr�gt:" + list2.toString());

		

	}
}