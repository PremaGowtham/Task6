package task6;

public class Question4 {

	public static void main(String[] args) {


		 // Create an Account object using the no-argument constructor
        Account acc1 = new Account();
        System.out.println("Account 1 - Number: " + acc1.getAccountNumber() + ", Holder: " + acc1.getAccountHolderName());
        acc1.deposit(1000);
        acc1.withdraw(500);
        System.out.println("Account 1 Balance: " + acc1.checkBalance());

        // Create an Account object using the constructor with two arguments
        Account acc2 = new Account("123456789", "Hari");
        System.out.println("Account 2 - Number: " + acc2.getAccountNumber() + ", Holder: " + acc2.getAccountHolderName());
        acc2.deposit(1500);
        acc2.withdraw(700);
        System.out.println("Account 2 Balance: " + acc2.checkBalance());
    
	}

}
