package Tns_Package.src;

public class vehicle_main {
    public static void main(String[] args) {
        System.out.println("\nSingle Inheritance Example");
        Car c = new Car();
        c.start();
        c.drive();
        System.out.println("\nMultilevel Inheritance Example");
        SportsCar sc= new SportsCar();
        sc.drive();
        sc.turboBoost();
        System.out.println("\nHierarchical Inheritance Example");
        ElectricCar ec= new ElectricCar();
        ec.chargeBattery();
        ec.start();
        System.out.println("\nHierarchical Inheritance Example");
        Truck t= new Truck();
        t.loadGoods();
        t.start();
        System.out.println("\nHybrid Inheritance Example");
        LuxuryCar lc = new LuxuryCar();
        lc.drive();
        lc.playMusic();
        lc.showDirections();
        System.out.println("\n");
    }
}
