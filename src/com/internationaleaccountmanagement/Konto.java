package com.internationaleaccountmanagement;

public class Konto extends Waehrung{

	Konto(java.lang.String name, java.lang.String kuerzel, double kurs) {
		super(name, kuerzel, kurs);
		}
	Konto(java.lang.String umrechnen){
		super(umrechnen, umrechnen, eingebwaehrung);
	}
	


	private static final String Peter = null;
	private static final String Lustig = null;
	private static java.lang.String vorname;
	private static java.lang.String nachname;
	static double eingebwaehrung = 20;
	private double konto = 10;
	
	
	public static void inhaber() {
		vorname = Peter;
		nachname = Lustig;
	}

	public String getInhaber() {
		return vorname + nachname;
	}

	
	public static void waehrung() { // zum dollar umrechnen
		
	}

	
	public String getWaehrung() {
		return getWaehrung();
	}
	

	
	private static double buche() {
		
	
	
		if (eingebwaehrung <= 0) {
			

		} else {
			
			}
	}
	
	}