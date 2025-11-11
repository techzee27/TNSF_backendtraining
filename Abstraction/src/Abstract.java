package Abstraction.src;

// This is an abstract class that acts as a blueprint for future classes.
// It defines abstract and non-abstract methods that subclasses can use or override.
// it is an combination of Abstract class and Concrete methods
public abstract class Abstract {

    // Abstract method: must be implemented by the subclass
    abstract void iphone18();

    // Non-abstract (concrete) method: provides default functionality
    void iphone17()
    {
        System.out.println("Extended back camera glass");  // Prints details of iPhone 17
    }
    
}
