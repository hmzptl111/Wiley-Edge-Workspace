package bank;

public interface Interest {
	double SavingsInterestRate = 6.0;
	double FixedDepositInterestRate = 3.0;
	double PersonalLoanRate = 10.0;
	double HousingLoanRate = 7.5;
	
	public double calculateInterest();
}
