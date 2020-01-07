package bankacount;

public class Bank {

	public Account[] account= new Account[100];
	
	
	public void openAccount (int nrAccounts, String type)
	{
		nrAccounts++;
		if(type.equals("savings"))
		{
			account[nrAccounts] = (Account) new SavingsAccount(nrAccounts,4556);
		}
		else if (type.equals("current"))
		{
			account[nrAccounts] = new CurrentAccount(nrAccounts, 23);
		}
		else if (type.equals("justAccount"))
		{
			account[nrAccounts] = new Account(nrAccounts);
		}
	}
	
	public void closeAccount (Account account)
	{
		int nrAc = account.number;
		account=null;
		System.out.println("Account  " + nrAc + "deleted");
	}
	
	
}
