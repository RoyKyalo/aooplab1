// Bus.java
public class Bus extends Vehicle
{
    private String busType;
    private String fuelType;

    // Constructor
    public Bus(String make, String model, String busType, String fuelType)
    {
        super(make, model, "Bus");
        this.busType = busType;
        this.fuelType = fuelType;
    }

    // Getters and setters for Bus properties
    public String getBusType()
    {
        return busType;
    }

    public void setBusType(String busType)
    {
        this.busType = busType;
    }

    public String getFuelType()
    {
        return fuelType;
    }

    public void setFuelType(String fuelType)
    {
        this.fuelType = fuelType;
    }

    // Bus-specific behaviors
    public void openDoors()
    {
        System.out.println("The vehicle type Bus with make " + getMake() + " and model " + getModel() + " fueled by " + getFuelType() + " opens its doors");
    }

    public void ferryPassengers()
    {
        System.out.println("The vehicle type Bus with make " + getMake() + " and model " + getModel() + " fueled by " + getFuelType() + " ferries passengers");
    }

    // Additional information for buses
    public void displayBusInfo()
    {
        System.out.println("Vehicle type: " + getType() + ", Make: " + getMake() + ", Model: " + getModel() + ", Bus Type: " + getBusType() + ", Fuel Type: " + getFuelType());
    }
}
