package junitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import personenidentity.Member;

public class MemberTest {

	@Test
	public void test() {
		
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
	
		
	}

	
	
	
	
}
