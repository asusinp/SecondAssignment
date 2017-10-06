/**
 * 
 */
package org.escoladeltreball.secondassignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author iaw21752927
 *
 */
public class cashAccountTest {
	
	private Bank bank;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		bank = new CashAccount("Alex", 2500);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		bank = null;
	}

	/**
	 * Test method for {@link org.escoladeltreball.secondassignment.CashAccount#withdraw(double)}.
	 */
	@Test
	public void testWithdraw() {
		try {
			bank.withdraw(250);
			assertEquals(2250, bank.getBalance(), 1e-4);
			bank.withdraw(2500);
			assertEquals(2250, bank.getBalance(), 1e-4);
		}		
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Test method for {@link org.escoladeltreball.secondassignment.BankImpl#deposit(double)}.
	 */
	@Test
	public void testDeposit() {
		bank.deposit(250);
		assertEquals(2750, bank.getBalance(), 1e-4);
	}

	/**
	 * Test method for {@link org.escoladeltreball.secondassignment.BankImpl#toDollars()}.
	 */
	@Test
	public void testToDollars() {
		assertEquals(3500,bank.toDollars(), 1e-4);
		
	}

	/**
	 * Test method for {@link org.escoladeltreball.secondassignment.BankImpl#getBalance()}.
	 */
	@Test
	public void testGetBalance() {
		assertEquals(2500, bank.getBalance(), 1e-4);
	}

	/**
	 * Test method for {@link org.escoladeltreball.secondassignment.BankImpl#isBalanceNegative()}.
	 */
	@Test
	public void testIsBalanceNegative() {
		assertFalse(bank.isBalanceNegative());
	}
}
