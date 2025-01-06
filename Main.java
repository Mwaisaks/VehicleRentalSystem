import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> fleet = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        fleet.add(new Car(1, "Toyota", "Corolla", 50.0, 5));
        fleet.add(new Truck(2, "Ford" , "F-150" , 100.0, 2.0));
        fleet.add(new Bike(3, "Yamaha", "YZF-R3", 30.0, true));

        do {
            System.out.println("\n--- Vehicle Rental System ---");
            System.out.println("1. View Vehicles");
            System.out.println("2. Rent Vehicle");
            System.out.println("3. Return Vehicles");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("\n--- Available Fleet ---");
                    for (Vehicle vehicle : fleet){
                        vehicle.displayDetails();
                    }
                    break;

                case 2:
                    System.out.print("Enter Vehicle ID to Rent: ");
                    int idToRent = scanner.nextInt();
                    boolean rented = false;

                    for (Vehicle vehicle : fleet){
                        if (vehicle.getId() == idToRent && vehicle.isAvailable()){
                            vehicle.setAvailable(false);
                            System.out.println("You rented: " + vehicle.getMake() + " " + vehicle.getModel());
                            rented = true;
                            break;
                        }
                    }
                    if (!rented){
                        System.out.println("Vehicle not available or invalid ID.");
                    }
                    break;

                case 3:
                    System.out.println("Enter Vehicle ID to return: ");
                    int idToReturn = scanner.nextInt();
                    System.out.println("Enter days rented: "); //the system should be able to count and display the
                    //number of days when the user returns a vehicle
                    int days = scanner.nextInt();
                    boolean returned = false;

                    for (Vehicle vehicle : fleet){
                        if (vehicle.getId() == idToReturn && !vehicle.isAvailable()){
                            vehicle.setAvailable(true);
                            double totalCost = days * vehicle.getDailyRentalPrice();
                            System.out.println("Vehicle returned. Total cost: $" + totalCost);
                            returned = true;
                            break;
                        }
                    }
                    if (!returned){
                        System.out.println("Vehicle not rented or invalid ID.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }while (choice != 4);
        scanner.close();
    }
}
