package interfaces;

public interface Vehicle {
    static String producer() {
        return "Das Motors";
    }

    default String product() {
        return "Aventador manufactured by " + producer();
    }
}
