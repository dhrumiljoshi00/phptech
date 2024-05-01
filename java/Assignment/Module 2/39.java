// Custom exception class
class InsufficientBalanceException extends Exception {
    private double requiredAmount;

    // Constructor
    public InsufficientBalanceException(String message, double requiredAmount) {
        super(message);
        this.requiredAmount = requiredAmount;
    }

    // Method to get the required amount
    public double getRequiredAmount() {
        return requiredAmount;
    }
}

// Bank account class
class Account {
    private double balance;

    // Constructor
    public Account(double balance) {
        this.balance = balance;
    }

    // Withdraw method
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            double requiredAmount = amount - balance;
            throw new InsufficientBalanceException("Sorry, insufficient balance, you need more " + requiredAmount + " Rs. To perform this transaction.", requiredAmount);
        }
        balance -= amount;
        System.out.println("Amount withdrawn: " + amount);
        System.out.println("Remaining balance: " + balance);
    }
}

// Main class
public class Bank {
    public static void main(String[] args) {
        double initialBalance = 2000;
        Account account = new Account(initialBalance);

        // User input
        double withdrawAmount = 2500;

        try {
            account.withdraw(withdrawAmount);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Required additional amount: " + e.getRequiredAmount() + " Rs.");
        }
    }
}
