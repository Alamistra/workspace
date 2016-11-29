package com.mybank.domain;

public class SavingsAccount extends Account{
	public double interestRate;
	
	public SavingsAccount(double initBalance, double intRate){
		super(initBalance);
		interestRate = intRate;
	}
	public void accumulateInterest(){
		balance += (balance * (interestRate/12)); 
	}
	String area(){
		return typeBalance("Savings Account");
	}

}
