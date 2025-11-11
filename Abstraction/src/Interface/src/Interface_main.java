package Abstraction.src.Interface.src;

// Main class to execute and test the ATM interface implementation
public class Interface_main {
    
    public static void main(String[] args) {
        
        // Creating an object of Interface_Impl using Interface reference
        Interface i = new Interface_Impl();

        // Calling static method from interface (no object needed)
        Interface.msg();

        // Calling default method from interface
        i.msg1();

        // Performing various deposit and withdrawal operations
        i.deposit(25000);   // Exceeds limit -> should trigger error message
        i.withdraw(9000);   // Reduces balance, should show remaining balance
        i.deposit(15000);   // Valid deposit
        i.withdraw(2000);   // Valid withdrawal
    }
}
