public abstract class Vehicle {
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

    public int getId() {
        return id;
    }

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getDailyRentalPrice() {
        return dailyRentalPrice;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public abstract void displayDetails(); ///abstract, okaayyyy
}

//Teach me about abstract
