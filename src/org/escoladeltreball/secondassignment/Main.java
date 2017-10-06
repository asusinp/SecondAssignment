/**
 * 
 */
package org.escoladeltreball.secondassignment;

/**
 * @author iaw21752927
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bank cashBank = new CashAccount("Alex", 100);
		
		try {
			cashBank.withdraw(150);
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println(cashBank.getBalance());
	}

}
