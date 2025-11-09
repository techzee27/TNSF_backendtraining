package Tns_Package.src;

// Program to demonstrate all types of inheritance in Java using Car example

// 1️. Single Inheritance
class Vehicle {
    void start() {
        System.out.println("Vehicle starts using ignition system.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is being driven on the road.");
    }
}

// 2. Multilevel Inheritance
class SportsCar extends Car {
    void turboBoost() {
        System.out.println("SportsCar activates turbo boost!");
    }
}

// 3️. Hierarchical Inheritance
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

// 4️. Multiple Inheritance using Interfaces
interface MusicSystem {
    void playMusic();
}

interface Navigation {
    void showDirections();
}

class LuxuryCar extends Car implements MusicSystem, Navigation {
    public void playMusic() {
        System.out.println("LuxuryCar is playing relaxing music.");
    }

    public void showDirections() {
        System.out.println("LuxuryCar is showing navigation directions.");
    }
}