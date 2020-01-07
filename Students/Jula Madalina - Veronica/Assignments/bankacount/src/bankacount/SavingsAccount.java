package bankacount;

public class SavingsAccount extends Account {

	public int interest; 
	
	public SavingsAccount(int number, int interest)
	{
		super(number);
		this.interest = interest;
	}


	public int getInterest() {
		return interest;
	}

	public void setInterest(int interest) {
		this.interest = interest;
	}
	
    @Override
	public String toString() {
		return "Account " + getAccountNumber() + ": " + "balance = " + getBalance() + ", " + "interest =" + getInterest();
	}
}
