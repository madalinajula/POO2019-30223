package bankacount;

public class CurrentAccount extends Account{

	public int overDraft;
	
	public CurrentAccount(int number, int overDraft) 
	{
		super(number);
		this.overDraft = overDraft;
	}

	public int getOverDraft() {
		return overDraft;
	}

	public void setOverDraft(int overDraft) {
		this.overDraft = overDraft;
	} 
	
@Override
	public String toString() {
		return "Account " + getAccountNumber() + ": " + "balance = " + getBalance() + ", " + "Overdraft Limit = " + getOverDraft();
	}
}
