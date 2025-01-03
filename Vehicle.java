public class Vehicle {
    private int id;
    private String make;
    private String model;
    private double dailyRentalPrice;
    private boolean isAvailable;

    public Vehicle(int id, String make, String model, double dailyRentalPrice, boolean isAvailable) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.dailyRentalPrice = dailyRentalPrice;
        this.isAvailable = true;
    }
}
