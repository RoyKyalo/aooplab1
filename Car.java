// Car.java
public class Car extends Vehicle
{
    private int numberOfSeats;
    private String transmissionType;

    // Constructor
    public Car(String make, String model, String type, int numberOfSeats, String transmissionType)
    {
        super(make, model, type);
        this.numberOfSeats = numberOfSeats;
        this.transmissionType = transmissionType;
    }

    // Getters and setters for the properties
    public int getNumberOfSeats()
    {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats)
    {
        this.numberOfSeats = numberOfSeats;
    }

    public String getTransmissionType()
    {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType)
    {
        this.transmissionType = transmissionType;
    }

    // specific behaviors of cars
    public void isConvertible()
    {
        System.out.println("The vehicle type " + getType() + " with make " + getMake() + " and model " + getModel() + " has " + getNumberOfSeats() + " seats and a " + getTransmissionType() + " transmission. It is convertible.");
    }

    public void drive()
    {
        System.out.println("The vehicle type " + getType() + " with make " + getMake() + " and model " + getModel() + " has " + getNumberOfSeats() + " seats and a " + getTransmissionType() + " transmission. It is fun to drive.");
    }

    // Additional car info
    public void displayCarInfo()
    {
        System.out.println("Vehicle type: " + getType() + ", Make: " + getMake() + ", Model: " + getModel() + ", Number of Seats: " + getNumberOfSeats() + ", Transmission Type: " + getTransmissionType());
    }
}
