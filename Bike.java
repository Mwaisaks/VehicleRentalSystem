public class Bike extends Vehicle{
    private boolean hasGear;

    public Bike(int id, String make, String model, double dailyRentalPrice, boolean hasGear){
        super(id, make, model, dailyRentalPrice);
        this.hasGear = hasGear;
    }

    public void displayDetails(){
        System.out.print("Bike ID: " + getId() + ", Make: " + getMake() + ", Model: " + getModel() +
                ", Price/Day: $" + getDailyRentalPrice() + ", Has Gear: " + hasGear +
                ", Available: " + isAvailable());
    }
}
