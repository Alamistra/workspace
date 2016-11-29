package com.mybank.domain;

public class CheckingAccount extends Account{
	public double overdraftAmount;
	public CheckingAccount(double initBalance, double overdraft){
		super(initBalance);
		overdraftAmount = overdraft;
	}
	public CheckingAccount (double initBalance){
		this(initBalance, 0.0);
	}
	public boolean withdraw(double amt){
		boolean result = true;
		
		if (balance < amt){
			double overdraftNeeded = amt-balance;
			if (overdraftAmount< overdraftNeeded)
				result = false;
			else {
				balance = 0.0;
				overdraftAmount -= overdraftNeeded;
			}
			
		}
		else
			balance = balance - amt;
		return result;
	}

}
