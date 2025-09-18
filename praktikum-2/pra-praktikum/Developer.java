public class Developer {
    public String namaDev;
    public double rating;

    public Developer(String namaDev, double rating) {
        this.namaDev = namaDev;
        this.rating = rating;
    }

    public void infoDev() {
        System.out.println("Developer: " + this.namaDev + " | Rating: " + this.rating + ".");
    }
}