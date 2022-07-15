package bank;

public interface DebitInterest extends Interest {
	public void deductMonthlyInterest();
	
	public void deductHalfYearlyInterest();
	
	public void deductAnnualInterest();
}
