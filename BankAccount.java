package Assigment1;

public class BankAccount 
{
    private long accountNo;
    private double accountBalance;
    private String accountPassword;
    private static String bankName;
    
    public BankAccount() 
    {
    	
    }
    public BankAccount(String bankName,long accountNo,String accountPassword,double accountBalance) 
    {
    	BankAccount.bankName=bankName;
    	
    	this.accountNo=accountNo;
    	this.accountPassword=accountPassword;
    	this.accountBalance=accountBalance;
    	
    	System.out.println("Bank Name : "+bankName);
    	System.out.println("Account Number : "+accountNo);
    	System.out.println("Account Password : "+accountPassword);
    	System.out.println("Account Balance : "+accountBalance);
    }
	public static String getBankName()
	{
		return bankName;
	}
	public static void setBankName(String bankName) 
	{
		BankAccount.bankName = bankName;
	}
	public String getAccountPassword() 
	{
		return accountPassword;
	}
	public void setAccountPassword(String accountPassword)
	{
		this.accountPassword = accountPassword;
	}
	public double getAccountBalance() 
	{
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance)
	{
		this.accountBalance = accountBalance;
	}
	public long getAccountNo() 
	{
		return accountNo;
	}
	public void setAccountNo(long accountNo) 
	{
		this.accountNo = accountNo;
	}
	public void displayAccount() 
	{
		System.out.println("Bank Name : "+getBankName());
		System.out.println("Account Number : "+getAccountNo());
		System.out.println("Account Password : "+getAccountPassword());
		System.out.println("Account Balance : "+getAccountBalance());
	}
	public static void main(String[] args) 
	{
		BankAccount ac=new BankAccount();
		System.out.println("Bank Account Details Are:\n");
		
		BankAccount.setBankName("HDFC Bank");
		ac.setAccountNo(223345715);
		ac.setAccountPassword("Abc@45*hu#");
		ac.setAccountBalance(10000);
		ac.displayAccount();
	}

}