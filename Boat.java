// Boat.java
public class Boat extends Vehicle {
    private String propulsionType;
    private String primaryUse;

    // Constructor
    public Boat(String make, String model, String propulsionType, String primaryUse) {
        super(make, model, "Boat");
        this.propulsionType = propulsionType;
        this.primaryUse = primaryUse;
    }

    // Getters and setters for the boat properties
    public String getPropulsionType() {
        return propulsionType;
    }

    public void setPropulsionType(String propulsionType) {
        this.propulsionType = propulsionType;
    }

    public String getPrimaryUse() {
        return primaryUse;
    }

    public void setPrimaryUse(String primaryUse) {
        this.primaryUse = primaryUse;
    }

    // Boat-specific behaviors
    public void sails() {
        System.out.println("The vehicle type Boat with make " + getMake() + " and model " + getModel() +
                " with " + getPropulsionType() + " propulsion sails");
    }

    public void navigate() {
        System.out.println("The vehicle type Boat with make " + getMake() + " and model " + getModel() +
                " with " + getPropulsionType() + " propulsion navigates the sea");
    }

    // Additional boat information
    public void displayBoatInfo() {
        System.out.println("Vehicle type: " + getType() + ", Make: " + getMake() +
                ", Model: " + getModel() + ", Propulsion Type: " + getPropulsionType() +
                ", Primary Use: " + getPrimaryUse());
    }
}
