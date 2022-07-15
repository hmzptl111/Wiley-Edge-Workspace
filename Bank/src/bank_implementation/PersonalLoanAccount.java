package bank_implementation;

import bank.CreditInterest;
import bank.DebitInterest;
import bank.LoanAccount;

public class PersonalLoanAccount implements LoanAccount, DebitInterest {
	SavingsAccount sa;
	double principal;
	
	public PersonalLoanAccount(SavingsAccount sa, double principal) {
		this.sa = sa;
		this.principal = principal;
	}

	@Override
	public void createAcc() {
		System.out.println("Personal loan account created");
	}

	@Override
	public double calculateInterest() {
		//returns yearly interest, by default
		return principal * (CreditInterest.PersonalLoanRate / 100);
	}

	@Override
	public void deductMonthlyInterest() {
		sa.setBalance(sa.getBalance() - (calculateInterest() / 12));
		principal += (calculateInterest() / 12);
	}

	@Override
	public void deductHalfYearlyInterest() {
		sa.setBalance(sa.getBalance() - (calculateInterest() / 6));
		principal += (calculateInterest() / 6);
	}

	@Override
	public void deductAnnualInterest() {
		sa.setBalance(sa.getBalance() - calculateInterest());
		principal += calculateInterest();
	}

	@Override
	public boolean repayPrincipal() {
		if(sa.getBalance() > principal) {
			sa.setBalance(sa.getBalance() - principal);
			principal = 0;
			return true;
		}
		return false;
	}

	@Override
	public void payInterest() {
		System.out.println("Paying interest on personal loan account");
	}

	@Override
	public boolean payPartialPrincipal(double amount) {
		if(amount < principal) {
			sa.setBalance(sa.getBalance() - amount);
			principal -= amount;
			return true;			
		}
		return false;
	}
	
	public double getPrincipal() {
		return principal;
	}
}
