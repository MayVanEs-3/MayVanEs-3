package com.internationaleaccountmanagement;

import java.util.ArrayList;
import org.omg.Messaging.SyncScopeHelper;

class Konto{

	/**
	 * Daklaration und Liste in der man Objekte vom Typ Betrag speichern kann
	 */
	private ArrayList<Betrag> listup = new ArrayList<Betrag>();//
	private String vorname;
	private String nachname;
	private Waehrung w;

	Konto(String vorname,String nachname, Waehrung w){
		/**
		 * Auf die Klasse Waehrung zugreifen und und zeigt auf lokale Klassenvariable
		 */
		this.vorname = vorname;
		this.nachname = nachname;
		this.w= w;
		
	}
	
	/**
	 * Ausgabe der getter
	 */
	String getVorname(){
		return vorname;
	}
	String getNachname(){
		return nachname;
	}

	String getInhaber() {
		return vorname +" "+ nachname;
	}
	
	Waehrung getWaehrung() {
		return w;

	}

	void buche(Betrag zahl) {
		/**
		 * Neuen Betrag umrechnen
		 */
		if(zahl != null){
			if(zahl.getBetrag()!= 0){
				if (!this.w.equals(zahl.getWaehrung())) {
					long t = zahl.getWaehrung().umrechnen(zahl.getBetrag(), w);
					listup.add(new Betrag(t, w));
			
				}else{
					listup.add(zahl);
				}
			}
		}
	}
	
	double saldo(){
		/**
		 * Saldo vom Konto abfragen
		 */
		double sum = 0;
		for(int i = 0; i< listup.size(); i++){
			Betrag b = listup.get(i);
			sum += b.getAsDouble();
			
		}
		return sum;
	}
	double gebuehren(double prosatz){
		/**
		 * Bestimmten Promillesatz vom Konto abziehen
		 */
		Betrag neu = new Betrag(saldo(),w);
		double ergebnis = neu.promille(prosatz) ;
		return ergebnis/100;
	}
	
	public String toString(){
		/**
		 * Ausgabe aller Ergebnisse der Variablen
		 */
		System.out.print("Inhaber"+ getInhaber());
		System.out.print("W�hrung"+getWaehrung());
		System.out.println("------------------------");
		buche(listup.add(,null));
		System.out.println("------------------------");
		System.out.println("Saldo"+ saldo());
		return null;
		
		
	
	} 
}
