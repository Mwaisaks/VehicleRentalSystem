public class Car extends Vehicle{
    private int seatingCapacity;

    public Car(int id, String make, String model, double dailyRentalPrice, int seatingCapacity){
        super(id, make, model, dailyRentalPrice);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void displayDetails(){
        System.out.print("Car ID: " + getId() + ", Make: " + getMake() + ", Model: " + getModel() +
                ", Price/Day: $" + getDailyRentalPrice() + ", Seats: " + seatingCapacity +
                ", Available: " + isAvailable());
    }
}//talk about super keyword
