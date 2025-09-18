import java.util.ArrayList;

public class TransportSystem {
    private String name;
    private ArrayList<Vehicle> vehicles;

    public TransportSystem(String name) {
        this.name = name;
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
       	this.vehicles.add(vehicle);
    }

    public Vehicle findVehicleByDriver(String driverName) {
        for (Vehicle vehicle : vehicles){
            if (vehicle.getDriver() != null && driverName.equalsIgnoreCase(vehicle.getDriver().getName())){
                return vehicle;
            }
        }
        
        return null;
    }

    public int totalPassengerCapacity() {
        int total = 0;
        for (Vehicle vehicle : vehicles){
            total += vehicle.getCapacity();
        }
        return total;
    }

    public void showAllVehicles() {
        System.out.println("=== Transport System: " + this.name + " ===");
        if (this.vehicles.isEmpty()){
            System.out.println("No vehicles in the system");
        }
        else{
            for(Vehicle vehicle : vehicles){
                if (vehicle != null){
                    vehicle.showInfo();
                    System.out.println("-------------------");
                }
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }
}
