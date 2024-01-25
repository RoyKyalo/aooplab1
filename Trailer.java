// Trailer.java
public class Trailer extends Vehicle {
    private String towingMechanism;
    private String cargoType;

    // Constructor
    public Trailer(String make, String model, String towingMechanism, String cargoType) {
        super(make, model, "Trailer");
        this.towingMechanism = towingMechanism;
        this.cargoType = cargoType;
    }

    // Getters and setters for Trailers properties
    public String getTowingMechanism() {
        return towingMechanism;
    }

    public void setTowingMechanism(String towingMechanism) {
        this.towingMechanism = towingMechanism;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    // Trailer-specific behaviors
    public void loadCargo() {
        System.out.println("The vehicle type Trailer with make " + getMake() + " and model " + getModel() +
                " with " + getTowingMechanism() + " loads " + getCargoType() + " cargo...");
    }

    public void unloadCargo() {
        System.out.println("The vehicle type Trailer with make " + getMake() + " and model " + getModel() +
                " with " + getTowingMechanism() + " unloads " + getCargoType() + " cargo...");
    }

    // Additional info
    public void displayTrailerInfo() {
        System.out.println("Vehicle type: " + getType() + ", Make: " + getMake() +
                ", Model: " + getModel() + ", Towing Mechanism: " + getTowingMechanism() +
                ", Cargo Type: " + getCargoType());
    }
}
