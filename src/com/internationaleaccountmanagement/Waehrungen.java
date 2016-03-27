package com.internationaleaccountmanagement;

public class Waehrungen {


		
		public Waehrung getDollar(){
			return new Waehrung("Dollar","$", 1.0000);
		}
		
		public Waehrung getEuro(){
			return new Waehrung("Euro","€", 1.2690);
		}
		
		public Waehrung getYen(){
			return new Waehrung("Yen","Y",0.0091);
		}
		
		public Waehrung getRubel(){
			return new Waehrung("Rubel","RUB", 0.0255);
		}
		
		public Waehrung getSchweizerFranken(){
			return new Waehrung("Schweizer Franken","CHF",1.0509);
		}
		
		
		
		
		

	}