package ssa;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccountTestCases {
	Checking checkingAcct;
	Savings savingsAcct;
	@Before
	public void setup(){
		
		
		savingsAcct= new Savings();
		checkingAcct= new Checking();
		checkingAcct.setDescription("Evans Account");
		checkingAcct.setAccountBalance(100);
		savingsAcct.setInterestRate(0.015);
		checkingAcct.setLastCheckNumber(0);
		
	}

	@Test
	public void testBalance(){
		assertEquals(100,checkingAcct.getBalance(),0);
		
	}
	

	@Test
	public void testDeposit() {
		assertEquals(200, checkingAcct.deposit(100),0);
		
	}
	
	@Test
	public void testDescription() {
		assertEquals("Evans Account", checkingAcct.getDescription());
		
	}
	@Test
	public void testSavings(){
		assertEquals(0.015, savingsAcct.getInterestRate(),0);
		
	}
	@Test
	public void testLastCheckingNumber() {
		assertEquals(0, checkingAcct.getLastCheckNumber(),0);
	}
	
	
}
