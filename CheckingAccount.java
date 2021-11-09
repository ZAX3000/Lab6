
public class CheckingAccount extends BankAccount 
{
	static final double FEE = .15;
	
	public CheckingAccount(String name, double initial)
	{
		super(name, initial);
		super.setAccountNumber(getAccountNumber() + "-10");
	}
	
	@Override
	public boolean withdraw(double amount)
	{
		double withdraw = amount;
		boolean completed = false;
		
		if (amount <= getBalance())
		{
			withdraw += FEE;
		
			super.withdraw(withdraw);
			completed = true;
		}
		else
		{
			completed = false;
		}
		return completed;
	}
}
