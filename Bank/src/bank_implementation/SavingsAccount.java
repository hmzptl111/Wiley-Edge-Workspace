package bank_implementation;

import bank.CreditInterest;
import bank.DepositAccount;

public class SavingsAccount implements DepositAccount, CreditInterest {
	double balance;
	static final double minBalance = 500, maxDepositLimit = 98000, maxWithdrawLimit = 40000;
	
	@Override
	public void createAcc() {
		System.out.println("Savings account created");
	}

	@Override
	public double calculateInterest() {
		//returns yearly interest, by default
		return balance * (CreditInterest.SavingsInterestRate / 100);
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
		if(amount <= maxWithdrawLimit && (balance - amount) >= minBalance) {
			balance -= amount;
			return true;
		}
		return false;
	}

	@Override
	public boolean deposit(double amount) {
		if(amount <= maxDepositLimit) {
			balance += amount;
			return true;
		}
		return false;
	}

	@Override
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double amount) {
		if(amount >= minBalance) {
			balance = amount;
		}
	}
}
