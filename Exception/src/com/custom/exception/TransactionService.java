package com.custom.exception;

public class TransactionService
{
		public void transferFunds(BankAccount fromAccount, BankAccount toAccount, double amount) throws InsufficientFundsException
		{
			if(amount < 1 )
			{
				throw new IllegalArgumentException("Amount Must be Grater Than zero...");
			}
			
			if(fromAccount.getBalance() < amount)
			{
				throw new InsufficientFundsException("Transaction failed: Insufficient funds in account "+fromAccount.getAccountNumber());
			}
			fromAccount.debit(amount);
			toAccount.credit(amount);
			System.out.println("-------------------------------");
			System.out.println("Transfer successful: ₹" + amount + " from " + fromAccount.getAccountNumber() +
                    " to " + toAccount.getAccountNumber());
		}
}
