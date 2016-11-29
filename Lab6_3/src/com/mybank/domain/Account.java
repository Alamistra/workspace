package com.mybank.domain;

public class Account {
    protected double balance;
    
    /** Creates a new instance of Account */
    protected Account(double initBalance) {
        balance = initBalance;
    }
    
    public double getBalance() {
        return balance;
    }
    public String typeBalance(String tpb) {
    	tpb = "Unknown Type Account";
    	return tpb;
    }
    
    public boolean deposit(double amt) {
        balance = balance + amt;
        return true;
    }
    
    public boolean withdraw(double amt) {
        boolean result = false;  // assume operation failure
        if ( amt <= balance ) {
            balance = balance - amt;
            result = true;  // operation succeeds
        }
        return result;
    }

	
}
