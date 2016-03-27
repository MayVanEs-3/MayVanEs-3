package com.internationaleaccountmanagement;

public class Betrag {
	long betrag;
	
	public void getVorzeichen(double a){
		
		if (a<0){
			System.out.println("-1");

		} else {
				System.out.println("1");
			}
	}
	

	public void addition(long betrag, long a) {
		
		
		double ergebnis = a + b;
	}

	public void subtraktion(double a, double b) {

		double ergebnis1 = a - b;

	}

	public  void multiplikation() {
	
		
	}

	public void multiplikation2() {
		int a = 3;
		int b = 3;

		double ergebnis3 = a * b;
		System.out.println("Das Ergebnis ist:" + ergebnis3);

	}

	public static void prozent() {
		double eingabe = 1;

		double ergebnis4 = (eingabe / 100);
		System.out.println("Der Prozentsatz ist:" + ergebnis4);

	}

	public static void promille() {
		double eingabe2 = 2;

		double ergebnis5 = (eingabe2 / 1000);
		System.out.println("Der Promillewert beträgt:" + ergebnis5);
	}
/*
	public static void getVorkomma() {
			String s = null;
			while(st.hasMoreTokens()){
				s = st.nextToken();
		
			if(s.equals(".")){
				// mache nichts, weil da der erste term beginnt
			}else if(s.equals("/")|| s.equals("-") || s.equals("+")|| s.equals("*")){
				operator.push(s);
			}else if (s.equals(")")){
				// rechne, wenn der term zu ende ist und, rechnung erfolgt mit den letzten beiden operanden und letzten operator
				Double result = solve(operand.pop(), operator.pop(), operand.pop());
				operand.push(result.toString());
			}else{
				// ist eine Zahl
				operand.push(s);
			}
		}
		return Double.parseDouble(operand.pop());
		//letzte operand ist nach dem durchlauf das ergebnis im Stack

	}
*/
	public static void getNachkomma() {
		int i = 1;
		do {
			i++;
		} while (i <= 99);
		System.out.println(i);

	}
}