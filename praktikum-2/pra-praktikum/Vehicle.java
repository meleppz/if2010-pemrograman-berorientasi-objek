public class Vehicle {
    private String plateNumber;
    private String type;
    private int capacity;   
    private int currentLoad; 
    private Driver driver;
    private Route route;

    public Vehicle(String plateNumber, String type, int capacity, Driver driver, Route route) {
        this.plateNumber = plateNumber;
        this.type = type;
        this.capacity = capacity;
        this.currentLoad = 0;
        this.driver = driver;
        this.route = route;
    }

    public void showInfo() {
        System.out.println("Kendaraan: " + this.type + " (" + this.plateNumber + ")");
        this.driver.introduce();
        System.out.printf("Rute: ");
        this.route.showRoute();
        System.out.printf("Penumpang: %d/%d\n", this.currentLoad, this.capacity);
    }

    public void changeDriver(Driver newDriver) {
    	this.driver = newDriver;
    }

    public void assignRoute(Route newRoute) {
      	this.route = newRoute;
    }

    public void boardPassenger(int count) {
        if (count > 0 && (this.currentLoad + count) <= this.capacity){
            this.currentLoad += count;
        }
      	else{
            System.out.println("Gagal: kapasitas kendaraan tidak cukup!");
        }
    }

    public void alightPassenger(int count) {
      	if (count > 0 && (this.currentLoad - count) >= 0){
            this.currentLoad -= count;
        }
        else{
            System.out.println("Gagal: jumlah penumpang turun melebihi yang ada!");
        }
    }

    public Driver getDriver(){
	return this.driver;
    }

    public int getCapacity(){
    	return this.capacity;
    }
    public void setDriver(Driver driver){
    	this.driver = driver;
    }
}
