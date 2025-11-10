package com.exception.multipleclasses;

public class BankAccount implements Bank
{

	 private long accountNumber;
	 private double balance;
	 
	 public BankAccount()
	 {	 
	 }
	 
	 public BankAccount(long accountNumber,double balance) throws AccountNotFoundException, InvalidAmountException
	 {
		 if(accountNumber<0)
		 {
			 throw new AccountNotFoundException("Account Not valid...");
		 }
		 if(balance <=0 )
		 {
			 throw new InvalidAmountException("Amount is Invalid...");
		 }
		 this.accountNumber = accountNumber;
		 this.balance = balance;
	 }

	@Override
	public void deposit(double amount) throws InvalidAmountException 
	{
		if(amount <= 0)
		{
			throw new InvalidAmountException("Amount is Must be Greater than Zero...");
		}
		System.out.println("-------------------------------------------------------");
		System.out.println("Balance Before Deposite to Acc no "+getAccountNumber()+" :"+balance);
		balance +=amount;
		System.out.println("Balance After Deposite :"+balance);
		System.out.println("Deposite Amount:"+amount);
	}

	@Override
	public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException 
	{
		if(amount <= 0)
		{
			throw new InvalidAmountException("Amount is Must be Greater than Zero...");
		}
		else if(balance < amount)
		{
			throw new InsufficientFundsException("Insufficient Balance...");
		}
		System.out.println("-------------------------------------------------------");
		System.out.println("Balance Before Withdraw to Acc No "+getAccountNumber()+" :"+balance);
		balance -=amount;
		System.out.println("Balance After Withdraw :"+balance);
		System.out.println("Withdraw Amount:"+amount);
	}

	@Override
	public void transfer(BankAccount toAccount, double amount) throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException 
	{
		if(amount > balance)
		{
			throw new InsufficientFundsException("Insufficient Balance...");
		}
		if(toAccount == null)
		{
			throw new AccountNotFoundException("Account Is not Valid...");
		}
		if(amount <= 0)
		{
			throw new InvalidAmountException("Amount is Zero Or Negetive...");
		}
		toAccount.setBalance(toAccount.getBalance()+amount);
		setBalance(getBalance()-amount);
		System.out.println("-------------------------------------------------------");
		System.out.println("Amount Debited :"+amount);
		System.out.println("Acc No "+getAccountNumber()+" & Balance is :"+getBalance());
		System.out.println("Deposit successful to "+toAccount.getAccountNumber()+".\nNew balance: "+toAccount.getBalance());
		System.out.println("Transfer successful.");
	}
	
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBalance(double balance) throws InvalidAmountException 
	{
		if(balance > 0)
		{
			this.balance = balance;
		}
		else 
		{
			throw new InvalidAmountException("Amount must be Greater than current Balance...");
		}
	}

	@Override
	public void applyForLoan(double amount) throws InvalidAmountException, LoanNotAllowedException
	{
		if(amount <=0)
		{
			throw new InvalidAmountException("Amount is Must be Greater than Zero...");
		}
		if(amount > 50000)
		{
			throw new LoanNotAllowedException("Loan not allowed. Either amount exceeds limit or balance is too low");
		}
		double loanAmt = getBalance()+amount;
		setBalance(loanAmt);
		System.out.println("-------------------------------------------------------");
		System.out.println("Loan Amount is Credited in Your Account :"+amount);
		System.out.println("Balance is :"+getBalance());
	}

	
	public long getAccountNumber() {
		return accountNumber;
	}

	@Override
	public double getBalance() 
	{
		return this.balance;
	}
	 
}
