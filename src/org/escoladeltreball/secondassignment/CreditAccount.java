/**
 * 
 */
package org.escoladeltreball.secondassignment;

/**
 * @author alex
 *
 */
public class CreditAccount extends BankImpl {

	/**
	 * @param owner
	 * @param balance
	 */
	public CreditAccount(String owner, double balance) {
		super(owner, balance);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.secondassignment.BankImpl#withdraw(double)
	 */
	@Override
	public void withdraw(double euros) throws Exception {
		// TODO Auto-generated method stub
		if (euros > 0) {
			if (this.balance - euros >= this.MIN_BALANCE) {
				balance = balance - euros;
			}
		}
	}
	
	

}
