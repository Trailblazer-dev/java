public class Bank {
    // In a bank, you can either deposit, withdraw, or check balance
    double balance;

    public Bank(double amountInTheBank) {
        balance = amountInTheBank;
        System.out.println("Your current balance is " + balance);
    }

    public void deposit(int depositAmount) {
        // Add the depositAmount to the balance
        balance += depositAmount;
        System.out.println("Deposited: " + depositAmount);
    }

    public void withdraw(int withdrawAmount) {
        // Check if there's enough balance to withdraw
        if (balance >= withdrawAmount) {
            // Subtract the withdrawAmount from the balance
            balance -= withdrawAmount;
            System.out.println("Withdrawn: " + withdrawAmount);
        } else {
            System.out.println("Insufficient balance to withdraw " + withdrawAmount);
        }
    }

    public static void main(String[] args) {
        // Create an instance of the Bank class with an initial balance
        Bank myBank = new Bank(5000);

        // Deposit some money
        myBank.deposit(2000);

        // Withdraw some money
        myBank.withdraw(1000);

        // Check the updated balance
        System.out.println("Your updated balance is " + myBank.balance);
    }
}
