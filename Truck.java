public class Truck extends Vehicle{
    private double cargoCapacity;

    public Truck(int id, String make, String model, double dailyRentalPrice, double cargoCapacity){
        super(id, make, model, dailyRentalPrice);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void displayDetails(){
        System.out.print("Truck ID: " + getId() + ", Make: " + getMake() + ", Model: " + getModel() +
                ", Price/Day: $" + getDailyRentalPrice() + ", Cargo capacity: " + cargoCapacity + " tons" +
                ", Available: " + isAvailable());
    }
}
