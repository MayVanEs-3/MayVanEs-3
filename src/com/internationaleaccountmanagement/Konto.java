package com.internationaleaccountmanagement;

public class Konto extends Waehrung{

	Konto(java.lang.String name, java.lang.String kuerzel, double kurs) {
		super(name, kuerzel, kurs);
		}
	Konto(java.lang.String umrechnen){
		super(umrechnen, umrechnen, eingebwaehrung);
	}
	


	private static final java.lang.String Peter = null;
	private static final java.lang.String Lustig = null;
	private static java.lang.String vorname;
	private static java.lang.String nachname;
	static double eingebwaehrung = 20;
	private double konto = 10;
	
	
	public static <vorname, nachname> void inhaber() {
		vorname = Peter;
		nachname = Lustig;
	}

	public String getInhaber() {
		return vorname + nachname;
	}

	
	public static void Waehrung() { // zum dollar umrechnen
		int Euro;
		int Yen;
		int Rubel;
		int CHF;
		double eingabe = 10;
		
		if (eingabe == Euro)
			do (eingabe * 1.2690);
			
		if (eingabe == Yen)
			do (eingabe * 0.0091);
			
		if (eingabe == Rubel)
			do (eingabe * 0.0255);
			
		if (eingabe == CHF)
			do (eingabe * 1.0509);
		
	}

	
	public String getWaehrung() {
		
		return getWaehrung();

	}
	

	
	private static double buche() {
		double konto = 10;
		double eingebwaehrung = 20;//Das Geld, was eingezahlt wird.
		/*int eingabewaehrung1 = (int) Euro;
		int eingabewaehrung2 = (int) Yen;
		int eingabewaehrung3 = (int) Rubel;
		int eingabewaehrung4 = (int) CHF;
		*/
	
	
		if (eingebwaehrung <= 0) {
			double sub = (konto - eingebwaehrung);
			return sub;

		} else {
			double sub1 = (konto + eingebwaehrung);
			return sub1; 
			}
	}


	public double getKonto() {
		return konto;
	}


	public void setKonto(double konto) {
		this.konto = konto;
	}
	
	}