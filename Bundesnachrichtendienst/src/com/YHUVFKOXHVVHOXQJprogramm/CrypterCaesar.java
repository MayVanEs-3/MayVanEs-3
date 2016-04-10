package com.YHUVFKOXHVVHOXQJprogramm;

import java.util.Scanner;

public class CrypterCaesar {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Zu verschlüsselnden Text eingeben:");

		String text = scanner.nextLine(); // Text eingeben

		int offset = 3;
		// Offset um 3 Stellen verschieben wie in der Aufgabe

		if (offset == 3) {

			/**
			 * Text in Char Array
			 * mit der unteren Methode neues Array zum verschlüsseln erstellen
			 * verschlüsselten Text ausgeben
			 */
			char[] Array1 = text.toCharArray();
		

			char[] Array2 = verschluesseln(offset, Array1);
		
		
			System.out.println("Und so sieht der Text verschlüsselt aus:");

			for (int i = 0; i < Array2.length; i++) {
				System.out.print(Array2[i]);
			}
			System.out.println("\n");

			/*Array2 = entschluesseln(offset, Array2);

			// entschlüsselten Text wieder ausgeben:

			System.out.println("Und so wieder zurück entschlüsselt:");

			for (int i = 0; i <Array2.length; i++) {

				System.out.print(Array2[i]);
			}
			System.out.println("\n");

			*/scanner.close();
		} 
	}


	/**
	 * Methode verschlüsselt eingegebenen Text
	 */
	public static char[] verschluesseln(int offset, char[] charArray) {

		char[] cryptArray = new char[charArray.length];
		// erstmal ein leeres Char Array erstellen

		for (int i = 0; i < charArray.length; i++) {

			int verschiebung = (charArray[i] + offset) % 128;
			// ursprüngliches Zeichen plus Offset modulo 128

			cryptArray[i] = (char) (verschiebung);

		}
		return cryptArray;

	}

}