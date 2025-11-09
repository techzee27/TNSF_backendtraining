// Program to demonstrate all types of Inheritance in Java
// Example based on different types of Cars and Vehicles

// 1️. SINGLE INHERITANCE
// Vehicle → Car
// In this, a single subclass inherits from a single parent class.
class Vehicle {
    void start() {
        System.out.println("Vehicle starts using ignition system.");
    }
}

// Car inherits properties of Vehicle (Single Inheritance)
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is being driven on the road.");
    }
}


// 2️. MULTILEVEL INHERITANCE
// Vehicle → Car → SportsCar
// In this, a derived class becomes the base for another subclass.
class SportsCar extends Car {
    void turboBoost() {
        System.out.println("SportsCar activates turbo boost!");
    }
}


// 3️. HIERARCHICAL INHERITANCE
// Vehicle → ElectricCar
// Vehicle → Truck
// Multiple classes inherit from the same parent class (Vehicle).
class ElectricCar extends Vehicle {
    void chargeBattery() {
        System.out.println("ElectricCar battery is charging.");
    }
}

class Truck extends Vehicle {
    void loadGoods() {
        System.out.println("Truck is loading goods.");
    }
}


// 4️. MULTIPLE INHERITANCE (using Interfaces)
// Java does not support multiple inheritance with classes to avoid ambiguity.
// But we can achieve it using interfaces.

// Interface 1: MusicSystem
interface MusicSystem {
    void playMusic();
}

// Interface 2: Navigation
interface Navigation {
    void showDirections();
}

// Hybrid or Multiple Inheritance Example
// LuxuryCar inherits from Car and implements two interfaces.
class LuxuryCar extends Car implements MusicSystem, Navigation {
    // Implementing methods from MusicSystem interface
    public void playMusic() {
        System.out.println("LuxuryCar is playing relaxing music.");
    }

    // Implementing methods from Navigation interface
    public void showDirections() {
        System.out.println("LuxuryCar is showing navigation directions.");
    }
}
