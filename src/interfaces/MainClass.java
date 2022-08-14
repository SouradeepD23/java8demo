package interfaces;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("main class");
        Vehicle vehicle = new VehicleImpl();
        System.out.println(vehicle.product());
        System.out.println(Vehicle.producer());
    }
}
