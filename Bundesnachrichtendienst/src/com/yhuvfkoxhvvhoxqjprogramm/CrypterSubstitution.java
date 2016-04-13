package com.yhuvfkoxhvvhoxqjprogramm;
//Variante1
import java.util.Scanner;

public abstract class CrypterSubstitution implements Crypter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Text eingeben");
		String text = scanner.nextLine(); 
		//Text eingeben
		
		char [] verschlüsselung = new char [26];
		public enum klartext{A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z};
		public enum schlüssel{U,F,L,P,W,D,R,A,S,J,M,C,O,N,Q,Y,B,V,T,E,X,H,Z,K,G,I};
		
		//ich weis nicht welches von beiden eher stimmt.. sind jetzt 2 Varianten,
		//die ausgebaut werden müssen ._.

	}
}
//Variante2
//@Override
//public void reset() {
	/**
	* Verschlusselt das gegebene Zeichen.
	*
	* @param klartextZeichen Zeichen, das verschlusselt werden soll.
	*
	* @return verschlusseltes Zeichen.
	* @throws CrypterException Wird geworfen, wenn Probleme mit der
	* Verschlusselung auftreten.
	*/
	
//}

/*@Override
public char verschluesseln(char WIKIPEDIAISTINFORMATIV) {
	
	return 0;
}

@Override
public char entschluesseln(char ZSMSYWPSUSTESNDQVOUESH) {
	
	return 0;
}

private String codieren ("WIKIPEDIAISTINFORMATIV", new String[]
		{"A","B","C","D","E","F","G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"},
		 new String[]{"U", "F", "L", "P", "W", "D", "R", "A", "S", "J", "M", "C", "O", "N", "Q", "Y", "B", "V", "T", "E", "X", "H", "Z", "K", "G", "I");

}
}*/
