package bank;

public interface LoanAccount extends Account {
	public boolean repayPrincipal();
	
	public void payInterest();
	
	public boolean payPartialPrincipal(double amount);
}
