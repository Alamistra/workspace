import com.mybank.domain.Account;

public class TestAccount2 {
	public static void main(String[] args) {
		Account account = new Account(100.0);
		account.balance = account.balance + 47;
		account.balance = account.balance - 150;
		System.out.println("You balance is: " + account.getBalance());
}
}
