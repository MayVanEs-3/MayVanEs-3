package com.internationaleaccountmanagement;

public class Betrag extends Waehrungen {

	long betrag;

	public void getVorzeichen(int b) {

		if (b < 0) {
			System.out.println("-1");

		} else {
			System.out.println("1");
		}
	}

/*	public double getset() {
		boolean b = false;
				
		if (b.) {

		}
	}*/

	Betrag(long x) {
		betrag = x;
	}

	public Betrag newBetrag(long i) {
		return newBetrag(i);
	}

	
	
	
	
	
	public double addition(double betrag, double a) {
		getName gN = new getName();
		gN.Waehrung();
		/*if (getName() == a.getName()){
			return a.getName();
		}else{
			a.umrechnen();
		}
		double ergebnis = betrag + a;
		long betrag = double ergebnis;
		return betrag;
	*/}
	
	
	
	
	

	public double subtraktion(double betrag, double a) {

		double ergebnis = (betrag - a);
		return ergebnis;
	}

	public int multiplikation2(double betrag, int a) {
		int ergo = (int) (betrag * a);
		int ergebnis = (int) ergo;
		return ergebnis;
	}

	public double multiplikation(double betrag, double a) {
		double ergo = (betrag * a);
		double ergebnis = (double) ergo;
		return ergebnis;

	}

	public double prozent(double betrag) {

		double ergebnis = (betrag / 100);
		return ergebnis;
	}

	public double promille(double betrag) {

		double ergebnis = (betrag / 1000);
		return ergebnis;
	}

	public double getVorkomma(double betrag) {
		//String rz = betrag + "";
		//return (rz.substring(0, 1)).equalsIgnoreCase("-");
		int y = (int) betrag;
		double good = betrag % 1;
		return good;

	}

	public double getNachkomma(double betrag) {
		good gg = new good();
		good.getVorkomma();
		
		int i = 1;
		do {
			i++;
		} while (i <= 99);
		System.out.println(i);
		double ergebnis = (betrag - getVorkomma(good));
		return ergebnis;
	}
}