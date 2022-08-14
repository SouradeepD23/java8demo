package interfaces;

public class VehicleImpl implements Vehicle{
    @Override
    public String product() {
        return "Porsche Cayman by " + Vehicle.producer();
    }
}
