package com.yhuvfkoxhvvhoxqjprogramm;

import com.yhuvfkoxhvvhoxqjprogramm.CrypterSubstitution.Verschluesselung;

/**
 * Eingabe wird eingelesen und diese wird verschlüsselt und
 * wieder entschlüsselt
 */

class TestCrypterSubstitution {
	 public static void main(String[] args){
	        String wort = "hallo";
	        Verschluesselung v = new Verschluesselung("uflpwdrasjmconqybvtexhzkgi");
	        String x = v.verschluesseln(wort);
	        String y = v.entschluesseln(wort);
	        System.out.println(wort);
	        System.out.println(x);
	        System.out.println(y);
	    }
	
}
