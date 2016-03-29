package com.internationaleaccountmanagement;

import java.util.ArrayList;
import org.omg.Messaging.SyncScopeHelper;

class Konto{

	private ArrayList<Betrag> listup = new ArrayList<Betrag>();//Liste inder man objekte vom typ betrag speichern kann
	private String vorname;
	private String nachname;
	private Waehrung w;

	Konto(String vorname,String nachname, Waehrung w){
		this.vorname = vorname;
		this.nachname = nachname;
		this.w= w;
		
	}
	
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
		double sum = 0;
		for(int i = 0; i< listup.size(); i++){
			Betrag b = listup.get(i);
			sum += b.getAsDouble();
			
		}
		return sum;
	}
	double gebuehren(double prosatz){
		Betrag neu = new Betrag(saldo(),w);
		double ergebnis = neu.promille(prosatz) ;
		return ergebnis/100;
	}
	
	public String toString(){
		
		System.out.print("Inhaber"+ getInhaber());
		System.out.print("Währung"+getWaehrung());
		System.out.println("------------------------");
		buche(listup.add(, nul0l));
		System.out.println("------------------------");
		System.out.println("Saldo"+ saldo());
		return null;
		
		
		
	}

	
	 
}
