package bank;

public interface DepositAccount extends Account {
	public boolean withdraw(double amount);
	
	public boolean deposit(double amount);
	
	public double getBalance();
}
