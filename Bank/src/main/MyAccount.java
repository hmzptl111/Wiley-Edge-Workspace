package main;

import bank.Interest;
import bank_implementation.FixedDepositAccount;
import bank_implementation.HousingLoanAccount;
import bank_implementation.PersonalLoanAccount;
import bank_implementation.SavingsAccount;

public class MyAccount {

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount();
		sa.createAcc();
		
		System.out.println("Balance before deposit: " + sa.getBalance());
		System.out.println("Deposit amount: " + 98000);
		if(sa.deposit(98000)) {
			System.out.println("Balance after deposit: " + sa.getBalance());			
		} else {
			System.out.println("Couldn't deposit amount");
		}
		
		System.out.println("Balance before withdrawal: " + sa.getBalance());
		System.out.println("Withdraw amount: " + 20000);
		if(sa.withdraw(20000)) {
			System.out.println("Balance after withdrawal: " + sa.getBalance());			
		} else {
			System.out.println("Couldn't withdraw amount");
		}
		
		System.out.println("Annual interest on savings account: " + Interest.SavingsInterestRate + "%");
		
		System.out.println("Balance before monthly interest: " + sa.getBalance());
		sa.addMonthlyInterest();
		System.out.println("Balance after monthly interest: " + sa.getBalance());
		
		System.out.println("Balance before half-yearly interest: " + sa.getBalance());
		sa.addHalfYearlyInterest();
		System.out.println("Balance after half-yearly interest: " + sa.getBalance());
		
		System.out.println("Balance before annual interest: " + sa.getBalance());
		sa.addAnnualInterest();
		System.out.println("Balance after annual interest: " + sa.getBalance());
		
		
		
		System.out.println("------------------");
		
		
		
		FixedDepositAccount fd = new FixedDepositAccount();
		fd.createAcc();
		
		System.out.println("Balance before deposit: " + fd.getBalance());
		System.out.println("Deposit amount: " + 50000);
		if(fd.deposit(50000)) {
			System.out.println("Balance after deposit: " + fd.getBalance());			
		} else {
			System.out.println("Couldn't deposit amount");
		}
		
		System.out.println("Annual interest on savings account: " + Interest.FixedDepositInterestRate + "%");
		
		System.out.println("Balance before monthly interest: " + fd.getBalance());
		fd.addMonthlyInterest();
		System.out.println("Balance after monthly interest: " + fd.getBalance());
		
		System.out.println("Balance before half-yearly interest: " + fd.getBalance());
		fd.addHalfYearlyInterest();
		System.out.println("Balance after half-yearly interest: " + fd.getBalance());
		
		System.out.println("Balance before annual interest: " + fd.getBalance());
		fd.addAnnualInterest();
		System.out.println("Balance after annual interest: " + fd.getBalance());
		
		System.out.println("Balance before withdrawal: " + fd.getBalance());
		System.out.println("Withdraw amount: " + fd.getBalance());
		if(fd.withdraw(fd.getBalance())) {
			System.out.println("Balance after withdrawal: " + fd.getBalance());			
		} else {
			System.out.println("Couldn't withdraw amount");
		}
		
		
		
		System.out.println("------------------");
		
		
		
		PersonalLoanAccount pl = new PersonalLoanAccount(sa, 50000);
		pl.createAcc();
		
		System.out.println("Annual interest on personal loan account: " + Interest.PersonalLoanRate + "%");
		
		System.out.println("Balance before monthly interest: " + sa.getBalance());
		pl.deductMonthlyInterest();
		System.out.println("Balance after monthly interest: " + sa.getBalance());
		
		System.out.println("Balance before half-yearly interest: " + sa.getBalance());
		pl.deductHalfYearlyInterest();
		System.out.println("Balance after half-yearly interest: " + sa.getBalance());
		
		System.out.println("Balance before annual interest: " + sa.getBalance());
		pl.deductAnnualInterest();
		System.out.println("Balance after annual interest: " + sa.getBalance());
		
		pl.payInterest();
		System.out.println("Balance before partial repayment of principal: " + sa.getBalance());
		System.out.println("Partial principal amount: " + 5000);
		if(pl.payPartialPrincipal(5000)) {
			System.out.println("Balance after partial repayment of principal: " + sa.getBalance());			
		} else {
			System.out.println("Couldn't process payment");
		}
		
		System.out.println("Balance before full repayment of principal: " + sa.getBalance());
		System.out.println("Full principal amount: " + pl.getPrincipal());
		if(pl.repayPrincipal()) {
			System.out.println("Balance after full repayment of principal: " + sa.getBalance());			
		} else {
			System.out.println("Couldn't process payment");
		}
		
		
		
		System.out.println("------------------");
		
		
		
		HousingLoanAccount hl = new HousingLoanAccount(sa, 50000);
		hl.createAcc();
		
		System.out.println("Annual interest on personal loan account: " + Interest.HousingLoanRate + "%");
		
		System.out.println("Balance before monthly interest: " + sa.getBalance());
		hl.deductMonthlyInterest();
		System.out.println("Balance after monthly interest: " + sa.getBalance());
		
		System.out.println("Balance before half-yearly interest: " + sa.getBalance());
		hl.deductHalfYearlyInterest();
		System.out.println("Balance after half-yearly interest: " + sa.getBalance());
		
		System.out.println("Balance before annual interest: " + sa.getBalance());
		hl.deductAnnualInterest();
		System.out.println("Balance after annual interest: " + sa.getBalance());
		
		hl.payInterest();
		System.out.println("Balance before partial repayment of principal: " + sa.getBalance());
		System.out.println("Partial principal amount: " + 5000);
		if(hl.payPartialPrincipal(5000)) {
			System.out.println("Balance after partial repayment of principal: " + sa.getBalance());			
		} else {
			System.out.println("Couldn't process payment");
		}
		
		System.out.println("Balance before full repayment of principal: " + sa.getBalance());
		System.out.println("Full principal amount: " + pl.getPrincipal());
		if(hl.repayPrincipal()) {
			System.out.println("Balance after full repayment of principal: " + sa.getBalance());			
		} else {
			System.out.println("Couldn't process payment");
		}
	}
}
