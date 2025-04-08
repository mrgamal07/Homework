// BankAccount.java
public class BankAccount {
    private double balance;  // private variable - can't be accessed directly

    // constructor
    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            balance = initialBalance;
        }
    }

    // public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // public method to check balance
    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(1000); // opening account with ₹1000

        myAccount.deposit(500);     // deposit ₹500
        myAccount.withdraw(200);    // withdraw ₹200

        System.out.println("Current Balance: " + myAccount.getBalance());
    }


}
