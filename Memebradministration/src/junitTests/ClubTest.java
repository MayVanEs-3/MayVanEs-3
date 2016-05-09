package junitTests;

import org.junit.Assert;
import org.junit.Test;

import personenidentity.Member;
import personenidentity.MembershipList;

public class ClubTest {
 MembershipList list = new MembershipList();
 
 @Test
 public void testSetVorname() {
  boolean expected = true;
  
  String test = "Test";
  list.put(new Member(1,"Muster","Frau",7));
  list.setVorname(1, test);
  String actual = list.get(1).getVorname();
  Assert.assertEquals(expected,test == actual);
 }
 @Test
 public void testSetNachname() {
  
 }
 @Test
 public void testSetMitgliederJahre() {
  
 }
}