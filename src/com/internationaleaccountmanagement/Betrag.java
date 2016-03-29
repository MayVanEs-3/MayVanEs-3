package com.internationaleaccountmanagement;
import java.text.DecimalFormat;

public class Betrag extends Waehrungen {
long betrag;
	
	public void getVorzeichen(long a){
		
		if (a<0){
			System.out.println("-1");

		} else {
				System.out.println("1");
			}
	}
	/**
	 * 
	 * @param a ein weiterer Betrag kann mit einer anderen Waehrung gegeben sein
	 * @return gibt den Betrag a in der gleichen waehrung wie mein Betrag zurück
	 */
	
	public long untersuche (long a){
		if(getName() == a.getName()&& untersuchebet(betrag)== a.getName()){
			return a.getName();
		}else{
			a.umrechnen();
		}
	}
	/**
	 * 
	 * @param Betrag mein Betrag das in einer Waehrung vorliegt
	 * @return Betrag in der jeweiligen Währung in der es vorliegt
	 */
	 public long untersuchebet(long betrag){
		 if(getName() == betrag.getName()){
			 return betrag.getName();
		 }
	 }

	Betrag(long x){
		betrag = x;
	}
	
	public Betrag newBetrag(long i){
		return newBetrag(i);
	}
	
	public long addition(long betrag, double a) {
		
		double ergebnis = betrag + a;
		long neuBetrag = (long) ergebnis;
		return neuBetrag;
	}

	public long subtraktion(long betrag, double a) {

		double ergebnis = betrag - a;
		long neuBetrag = (long) ergebnis;
		return neuBetrag;
	}

	public long multiplikation(long betrag, double a) {
		
		double ergebnis = betrag* a;
		long neuBetrag = (long) ergebnis;
		return neuBetrag;
	}

	public long multiplikation2(long betrag,int a) {
		int ergebnis = (int) (betrag * a);
		long neuBetrag = (long) ergebnis;
		return neuBetrag;

	}

	public long prozent(long betrag) {
		
		double ergebnis = (betrag/ 100);
		long neuBetrag = (long) ergebnis;
		return neuBetrag;
	}

	public long promille(long betrag) {
	
		double ergebnis = (betrag / 1000);
		long neuBetrag = (long)ergebnis;
		return neuBetrag;
	}
	public long getVorkomma(long betrag){
		/**
		 * Mit int y = (int) betrag werden alle Zahlen nach dem Komma abgeschnitten
		 */
		
		int y = (int)betrag;
		long neuBetrag = (long) y;
		return neuBetrag;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Waehrung that = (Waehrung) obj;
		if(getName() == that.getName())
		return true;
		Betrag other = (Betrag) obj;
		if (betrag != other.betrag)
			return false;
		return true;
	}
	public double getAsDouble(long betrag){
		
		double ergebnis = (Math.round(betrag*100)/100.0);
		/*
		DecimalFormat D = new DecimalFormat("#0.00");
		
		double betrag1 = (long) betrag;
		double mal = 0.2;
		System.out.println(D.format(betrag1));
		System.out.println(D.format(mal));
		*/
		return ergebnis;
	}
	
	public String toString(long betrag) {
		do{
			double ergebnis = betrag * 0.1;
			long neuBetrag = (long)ergebnis;
			
		}while(betrag < 1.00);
		return "Betrag [betrag=" + betrag + getKuerzel()+ " ]";
	}
	public long getNachkomma(long betrag){
		
		do {
			int gN = (int) (betrag % 1);
			//int gN = (int) (betrag - getVorkomma());
			long neuBetrag = (long) gN;
			return neuBetrag;
			
		} while (betrag <= 99);
		
	}
}
	