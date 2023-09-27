package Day8;

import java.util.ArrayList;
import java.util.List;

public class TestAccountOperation {

	public static void main(String[] args) {
		AccountOperation a1=new Account("satish",20186,5000.23,3000);
		AccountOperation a2=new Account("sai",20234,6000.23,5000);
		AccountOperation a3=new Account("lohith",20345,5000.23,2300);
		AccountOperation a4=new Account("chaithu",20122,7000.23,5500);
		AccountOperation a5=new Account("satish",20186,8000.23,4500);
       List <Object> obj= new ArrayList();
       obj.add(a1);
       obj.add(a2);
       obj.add(a3);
       obj.add(a4);
       obj.add(a5);
       for(Object  a : obj) {
    	   System.out.println(a);
       }

	}

}
interface AccountOperation{
	double deposit();
	double getBalance();
}
class Account implements AccountOperation{
	private String name;
	private int accountNum;
	private double accountBalance;
	private double depositAmount;
	public Account(String name,int accountNum,double accountBalance,double depositAmount)
	{
		this.name=name;
		this.accountNum=accountNum;
		this.accountBalance=accountBalance;
		this.depositAmount=depositAmount;
	}
	
	public double deposit()
	{
		return this.depositAmount;
	}
	public double getBalance()
	{
		return this.accountBalance-this.depositAmount;
	}
	@Override
	public String toString()
	{
		return "[ name : "+name+" accountNumber : "+accountNum+" accountBalance : "+accountBalance+" depositAmount : "+depositAmount;
	}
}