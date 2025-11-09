// Program to demonstrate both types of Polymorphism in Java
// Example: Car and Vehicle scenario

//  POLYMORPHISM means 
// In Java, it allows methods to perform different tasks based on the object that invokes them.

// There are 2 types:
// 1️. Compile-time Polymorphism (Method Overloading)
// 2️. Runtime Polymorphism (Method Overriding)

// ----------------------------------------------------------------------
// 1. COMPILE-TIME POLYMORPHISM (Method Overloading)
// ----------------------------------------------------------------------
class Calculator {
    // Same method name, different parameter types or count
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// ----------------------------------------------------------------------
// 2. RUNTIME POLYMORPHISM (Method Overriding)
// ----------------------------------------------------------------------
class Vehicle {
    void start() {
        System.out.println("Vehicle starts using ignition system.");
    }
}

class Car extends Vehicle {
    @Override
    void start() {  // Overriding the parent class method
        System.out.println("Car starts using push-button ignition.");
    }
}

class ElectricCar extends Vehicle {
    @Override
    void start() {  // Overriding the parent class method
        System.out.println("ElectricCar starts silently with battery power.");
    }
}
