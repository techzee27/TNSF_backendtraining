package Abstraction.src;

// Main class to execute and test the abstraction concept
public class Abstract_main {
    public static void main(String[] args) {
        // Creating an object of subclass (Abstract_Impl) using parent reference (Abstract)
        Abstract ip = new Abstract_Impl();
        
        // Calling the concrete method from Abstract class
        ip.iphone17();
        
        // Calling the implemented abstract method from Abstract_Impl class
        ip.iphone18();
    }
}
