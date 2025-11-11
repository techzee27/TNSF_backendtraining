package Abstraction.src.Interface.src;

// This interface defines ATM-related operations like deposit and withdraw.
// It also includes static and default methods to demonstrate interface features.
public interface Interface {
    
    // Static variable: shared by all implementing classes
    static int bal = 3000;  // Initial balance in account

    // Abstract methods: must be implemented by any class that implements this interface
    public void deposit(int amount);  // Method for depositing money
    public void withdraw(int amount); // Method for withdrawing money

    // Static method: can be called without creating an object of the implementing class
    static void msg() {
        System.out.println("Welcome Customer"); // Message displayed when customer logs in
    }

    // Default method: can be overridden in implementing class (optional)
    default void msg1() {
        System.out.println("The receipt will not be provided"); // Default notice for receipt
    }
}
