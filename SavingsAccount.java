
public class SavingsAccount extends BankAccount
{
	double rate = .025;
	
	int savingsNumber = 0;
	
	private String accountNumber;
	
	public SavingsAccount(String name, double initial)
	{
		super(name, initial);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	public void postInterest()
	{
		double balance = 0;
		
		balance += super.getBalance() * rate;
		
		balance += super.getBalance();
		
		super.setBalance(balance);
	}

	@Override
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	public SavingsAccount(SavingsAccount account, int initial)
	{
		super(account, initial);
		this.savingsNumber += 1;
		accountNumber += super.getAccountNumber() + "-" + savingsNumber;
	}
	
}