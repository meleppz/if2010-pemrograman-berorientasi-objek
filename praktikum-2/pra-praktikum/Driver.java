public class Driver {
    private String name;
    private String licenseNumber;
    private double rating; // rating 0.0 - 5.0

    public Driver(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rating = 0.0;
    }

    public void introduce() {
        System.out.println("Supir: " + this.name + " - Lisensi: " + this.licenseNumber + " - Rating: " + this.rating);
    }

    public void updateRating(double newRating) {
        if (newRating >= 0 && newRating <= 5){
            this.rating = newRating;
        }
        else{
            System.out.println("Rating harus antara 0 sampai 5");
        }
    }

    public String getName() {
        return name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public double getRating() {
        return rating;
    }
}
