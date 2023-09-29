package Day9;

public class TestInsufficientBalanceException {

	public static void main(String[] args) {
		Account account= new Account(123,9000);
		Account account1=new Account(234,9000);
		try {
		account.withdraw(5000);
		account1.withdraw(9500);
		}
		catch(InsufficientBalanceException e)
		{
			e.getStackTrace();
		}
     
	}
 
}
class InsufficientBalanceException extends  Exception{
	InsufficientBalanceException()
	{
		System.out.println("insuffient Balance X for withdraw of Y");
	}
}
class Account{
	private int accountNumber;
	private double balance;
	public Account(int accountNumber,double balance)
	{
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	public void withdraw(double amount) throws InsufficientBalanceException
	{
			if(balance<amount)
			{
				InsufficientBalanceException e= new InsufficientBalanceException();
				throw  e;
			}
			else {
				balance=balance-amount;
				System.out.println("congrats!amount is withdrawn\n  Account balance : "+ balance);
			}
	}
	
}