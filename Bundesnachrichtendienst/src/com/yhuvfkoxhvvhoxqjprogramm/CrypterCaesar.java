package com.yhuvfkoxhvvhoxqjprogramm;
import java.util.Scanner;

public class CrypterCaesar implements Crypter {

	public static void main(String[] args) {

		/**
		 * Abfragen, was codiert werden soll über Scanner und Text eingabe Text
		 * als String int offset ist die Verschiebung um 3Stellen
		 */
		/**
		 * Text in Char Array mit der unteren Methode neues Array zum
		 * verschlüsseln erstellen verschlüsselten Text ausgeben
		 */
		/**
		 * Methode verschlüsselt eingegebenen Text
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Zu verschlüsselnden Text eingeben:");

		String text = scanner.nextLine();

		
		

			char[] Array1 = text.toCharArray();

			char[] Array2 = verschluesseln(3, Array1);

			System.out.println("Und so sieht der Text verschlüsselt aus:");

			for (int i = 0; i < Array2.length; i++) {
				System.out.print(Array2[i]);
			}
			System.out.println("\n");

			
			
		}
	

	
	@Override
	public char verschluesseln(char klartextZeichen) { //(int offset, char[] charArray)
		char [] cryptArray = new char[charArray.length]; //leeres Char- Array erstellen
		for (int i = 0; i < charArray.length; i++){
			int verschiebung = charArray[i] + 3) % 128;
			cryptArray[i] = (char) (verschiebung);
		}
		return 0; //return cryptArray;
	}

	@Override
	public char entschluesseln(char cypherTextZeichen) {
		  Array2 = entschluesseln(offset, Array2);
		  
		  // entschlüsselten Text wieder ausgeben:
		  
		  System.out.println("Und so wieder zurück entschlüsselt:");
		  
		  for (int i = 0; i <Array2.length; i++) {
		  
		  System.out.print(Array2[i]); } System.out.println("\n");
		  
		 scanner.close();
		return 0;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		
	}
}