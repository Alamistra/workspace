package com.mybank.test;
import com.mybank.domain.Account;

public class TestAccount {
	public static void main(String[] args) {
		Account account = new Account(100.0);
		account.deposit(50.0);
		account.withdraw(147.0);
		System.out.println("You balance is: " + account.getBalance());
	    
	  }
}
