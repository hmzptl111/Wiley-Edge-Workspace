package bank;

public interface CreditInterest extends Interest {
	public void addMonthlyInterest();
	
	public void addHalfYearlyInterest();
	
	public void addAnnualInterest();
}
