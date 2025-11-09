// Main class to demonstrate different types of inheritance
public class vehicle_main {
    public static void main(String[] args) {

        // 1️. Single Inheritance Example
        System.out.println("\nSingle Inheritance Example");
        Car c = new Car();
        c.start();   // Inherited method from Vehicle
        c.drive();   // Method from Car

        // 2️. Multilevel Inheritance Example
        System.out.println("\nMultilevel Inheritance Example");
        SportsCar sc = new SportsCar();
        sc.drive();        // From Car
        sc.turboBoost();   // From SportsCar

        // 3️. Hierarchical Inheritance Example (ElectricCar)
        System.out.println("\nHierarchical Inheritance Example (ElectricCar)");
        ElectricCar ec = new ElectricCar();
        ec.chargeBattery(); // Method of ElectricCar
        ec.start();         // Inherited from Vehicle

        // 3️. Hierarchical Inheritance Example (Truck)
        System.out.println("\nHierarchical Inheritance Example (Truck)");
        Truck t = new Truck();
        t.loadGoods(); // Method of Truck
        t.start();     // Inherited from Vehicle

        // 4️. Hybrid / Multiple Inheritance Example
        System.out.println("\nHybrid Inheritance Example");
        LuxuryCar lc = new LuxuryCar();
        lc.drive();          // From Car
        lc.playMusic();      // From MusicSystem interface
        lc.showDirections(); // From Navigation interface
    }
}
