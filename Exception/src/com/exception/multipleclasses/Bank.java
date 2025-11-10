package com.exception.multipleclasses;

public interface Bank 
{
	void deposit(double amount) throws InvalidAmountException;
	void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException;
	void transfer(BankAccount toAccount, double amount) throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException;
	void applyForLoan(double amount) throws InvalidAmountException, LoanNotAllowedException;
	double getBalance();
}
