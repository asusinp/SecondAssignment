/**
 * 
 */
package org.escoladeltreball.secondassignment;

/**
 * @author alex
 *
 */
public abstract class BankImpl implements Bank {
	
	protected String owner;
	protected double balance;
	
	/**
	 * @param owner the owner of this account
	 * @param balance the actual balance of this account
	 */
	public BankImpl(String owner, double balance) {
		this.owner = owner;
		this.balance = balance;
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.secondassignment.Bank#withdraw(double)
	 */
	@Override
	public abstract void withdraw(double euros) throws Exception;

	/* (non-Javadoc)
	 * @see org.escoladeltreball.secondassignment.Bank#deposit(double)
	 */
	@Override
	public void deposit(double euros) {
		// TODO Auto-generated method stub
		if (euros > 0) {
			this.balance += euros;
		}
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.secondassignment.Bank#toDollars()
	 */
	@Override
	public double toDollars() {
		// TODO Auto-generated method stub
		return balance * Bank.DOLAR_RATE;
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.secondassignment.Bank#getBalance()
	 */
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return this.balance;
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.secondassignment.Bank#isBalanceNegative()
	 */
	@Override
		public boolean isBalanceNegative() {
			// TODO Auto-generated method stub
			return this.balance < 0;
		}

}
