package Abstraction.src.Interface.src;

// This class implements the Interface and provides logic for deposit and withdraw operations
public class Interface_Impl implements Interface {

    // Implementation of deposit method
    public void deposit(int amount) {
        int amt = bal + amount; // Calculating new balance after deposit
        
        // Checking if deposit exceeds the allowed limit
        if (amt >= 25000) {
            System.err.println("The deposit limit is 25000, hence the limit is exceeding");
        } else {
            System.out.println("The deposit has been done successfully and the current balance is: " + amt);
        }
    }

    // Implementation of withdraw method
    public void withdraw(int amount) {
        int balance = bal - amount; // Calculating new balance after withdrawal
        
        // Ensuring minimum balance requirement
        if (balance >= 1000) {
            System.out.println("Money has been withdrawn successfully and the remaining balance is: " + balance);
        } else {
            System.err.println("Minimum balance should be Rs.1000, so you can't withdraw");
        }
    }
}
