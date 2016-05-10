package junitTests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import personenidentity.Member;

public class MemberTest {

	@Test
	public void isTheSameNachname(){
		boolean expected = true;
		Member mem1 = new Member(1, "Maria", "Geist", 2);
		Member mem2 = new Member(2,"Caro", "Schmidt", 3);
		
		 Assert.assertNotEquals(expected, mem1.isTheSameNachname(mem2));
	}
	@Test
	public void isTheSameVorname(){
		boolean expected = true;
		
		Member mem1 = new Member(1, null, null, 0);
		Member mem2 = new Member(1, null, null, 0);
	}
		/*
		Member test1 = new Member(2, "Ran", "Mori", 3);
		Member test2 = new Member(2, "Kogoron", "Mori", 3);
		test1.equals(test2);
		test1.toString();
		test2.toString();
		test1.hasTheSameMemberID(test2);
		test1.hasSameMitgliedsJahre(test2);
		test1.isTheSameNachname(test2);
		test1.isTheSameVorname(test2);
		test1.equals(test2);
		equals(true);
	*/

	
	
	
	
}
