package bank_implementation;

import bank.CreditInterest;
import bank.DepositAccount;

public class FixedDepositAccount implements DepositAccount, CreditInterest {
	double balance;
	static final double minDepositLimit = 10000, maxDepositLimit = 150000;
	
	@Override
	public void createAcc() {
		System.out.println("Fixed deposit account created");
	}

	@Override
	public double calculateInterest() {
		//returns yearly interest, by default
		return balance * (CreditInterest.FixedDepositInterestRate / 100);
	}

	@Override
	public void addMonthlyInterest() {
		balance += (calculateInterest() / 12);
	}

	@Override
	public void addHalfYearlyInterest() {
		balance += (calculateInterest() / 6);
	}

	@Override
	public void addAnnualInterest() {
		balance += calculateInterest();
	}
	
	@Override
	public boolean withdraw(double amount) {
		if(amount == balance) {
			balance = 0;
			return true;
		}
		return false;
	}

	@Override
	public boolean deposit(double amount) {
		if(balance <= minDepositLimit) {
			balance = amount;
			return true;
		}
		return false;
	}

	@Override
	public double getBalance() {
		return balance;
	}
}
