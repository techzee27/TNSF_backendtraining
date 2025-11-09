// Main class to demonstrate Polymorphism
public class polymorphism_main {
    public static void main(String[] args) {

        System.out.println("\nCOMPILE-TIME POLYMORPHISM (Method Overloading)");
        Calculator calc = new Calculator();

        // Calling overloaded methods
        System.out.println("Sum of 2 integers: " + calc.add(5, 10));
        System.out.println("Sum of 2 doubles: " + calc.add(5.5, 3.2));
        System.out.println("Sum of 3 integers: " + calc.add(2, 3, 4));

        System.out.println("\nRUNTIME POLYMORPHISM (Method Overriding)");
        
        // Parent class reference holding child class objects
        Vehicle v;  // Reference of parent type

        v = new Vehicle();     // Vehicle object
        v.start();             // Calls Vehicle's start()

        v = new Car();         // Car object assigned to Vehicle reference
        v.start();             // Calls Car's start() → overridden version

        v = new ElectricCar(); // ElectricCar object assigned to Vehicle reference
        v.start();             // Calls ElectricCar's start() → overridden version

        System.out.println("\nProgram execution completed successfully!");
    }
}
