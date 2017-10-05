/**
 * 
 */
package org.escoladeltreball.secondassignment;

/**
 * @author alex
 *
 */
public class CashAccount extends BankImpl {

	/**
	 * @param owner
	 * @param balance
	 */
	public CashAccount(String owner, double balance) {
		super(owner, balance);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.secondassignment.BankImpl#withdraw(double)
	 */
	@Override
	public void withdraw(double euros) throws Exception {
		// TODO Auto-generated method stub
		if (!isBalanceNegative()) {
			if (euros > 0) {
				this.balance = this.balance - euros;
			}
		}
	}

}
