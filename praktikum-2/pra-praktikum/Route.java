public class Route {
    private String startPoint;
    private String destination;
    private int distance; 
    private int averageSpeed;

    public Route(String startPoint, String destination, int distance, int averageSpeed) {
        this.startPoint = startPoint;
        this.destination = destination;
        this.distance = distance;
        this.averageSpeed = averageSpeed;
    }

    public void showRoute() {
        System.out.println(this.startPoint + " >> " + this.destination + " (" + this.distance + " km)");
        System.out.printf("Estimasi waktu tempuh: %.1f jam\n", this.estimateTravelTime());
    }

    public double estimateTravelTime() {
	    return (double) this.distance / this.averageSpeed;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public String getDestination() {
        return destination;
    }

    public int getDistance() {
        return distance;
    }

    public int getAverageSpeed() {
        return averageSpeed;
    }
}
