package com.mybank.test;
import com.mybank.domain.Account;

public class TestAccount3 {
	public static void main(String[] args) {
		Account account = new Account(100.0);
		account.deposit(47.0);
		account.withdraw(150.0);
		System.out.println("You balance is: " + account.getBalance());
	    
	  }
}
