// Motorcycle.java
public class Motorcycle extends Vehicle
{
    private String bodyType;
    private String timePeriod;

    // Constructor
    public Motorcycle(String make, String model, String bodyType, String timePeriod)
    {
        super(make, model, "Motorcycle");
        this.bodyType = bodyType;
        this.timePeriod = timePeriod;
    }

    // Getters and setters for Motorcycle-specific properties
    public String getBodyType()
    {
        return bodyType;
    }

    public void setBodyType(String bodyType)
    {
        this.bodyType = bodyType;
    }

    public String getTimePeriod()
    {
        return timePeriod;
    }

    public void setTimePeriod(String timePeriod)
    {
        this.timePeriod = timePeriod;
    }

    // Motorcycle-specific behaviors
    public void doWheelie()
    {
        System.out.println("The vehicle type Motorcycle with make " + getMake() + " and model " + getModel() +
                " with a " + bodyType + " body type from the " + timePeriod + " can do wheelies");
    }

    public void doLeaning()
    {
        System.out.println("The vehicle type Motorcycle with make " + getMake() + " and model " + getModel() +
                " with a " + bodyType + " body type from the " + timePeriod + " can lean while riding");
    }

    // Override displayVehicleInfo() for better formatting
    @Override
    public void displayVehicleInfo()
    {
        System.out.println("Vehicle make: " + getMake() + ", Model: " + getModel() +
                ", Type: " + getType());
    }
}
