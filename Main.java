public class Main
{
    public static void main(String[] args)
    {
        // Boat 1
        Boat boat1 = new Boat("Bayliner", "RY2020", "Sail", "Recreational");
        boat1.displayVehicleInfo();
        boat1.sails();
        boat1.navigate();
        System.out.println("Propulsion Type: " + boat1.getPropulsionType());
        System.out.println("Primary Use: " + boat1.getPrimaryUse());
        System.out.println();

        // Boat 2
        Boat boat2 = new Boat("Sea Ray", "RX2020", "Motor", "Fishing");
        boat2.displayVehicleInfo();
        boat2.sails();
        boat2.navigate();
        System.out.println("Propulsion Type: " + boat2.getPropulsionType());
        System.out.println("Primary Use: " + boat2.getPrimaryUse());
        System.out.println();

        // Trailer 1
        Trailer trailer1 = new Trailer("Volvo", "TRL21", "Hitch", "Goods");
        trailer1.displayVehicleInfo();
        trailer1.loadCargo();
        trailer1.unloadCargo();
        System.out.println("Towing Mechanism: " + trailer1.getTowingMechanism());
        System.out.println("Cargo Type: " + trailer1.getCargoType());
        System.out.println();

        // Trailer 2
        Trailer trailer2 = new Trailer("Mercedes", "TRLM22", "Fifth Wheel", "Construction Materials");
        trailer2.displayVehicleInfo();
        trailer2.loadCargo();
        trailer2.unloadCargo();
        System.out.println("Towing Mechanism: " + trailer2.getTowingMechanism());
        System.out.println("Cargo Type: " + trailer2.getCargoType());
        System.out.println();

        // Bus 1
        Bus bus1 = new Bus("Scania", "MBS12", "Double Decker", "Diesel");
        bus1.displayVehicleInfo();
        bus1.openDoors();
        bus1.ferryPassengers();
        System.out.println("Bus Type: " + bus1.getBusType());
        System.out.println("Fuel Type: " + bus1.getFuelType());
        System.out.println();

        // Bus 2
        Bus bus2 = new Bus("Rosa", "MBR13", "City Bus", "Electric");
        bus2.displayVehicleInfo();
        bus2.openDoors();
        bus2.ferryPassengers();
        System.out.println("Bus Type: " + bus2.getBusType());
        System.out.println("Fuel Type: " + bus2.getFuelType());
        System.out.println();

        // Car 1
        Car car1 = new Car("Toyota", "Mark", "Sedan", 5, "Automatic");
        car1.displayVehicleInfo();
        car1.isConvertible();
        car1.drive();
        System.out.println("Number of Seats: " + car1.getNumberOfSeats());
        System.out.println("Transmission Type: " + car1.getTransmissionType());
        System.out.println();

        // Car 2
        Car car2 = new Car("Mazda", "Axela", "SUV", 7, "Manual");
        car2.displayVehicleInfo();
        car2.isConvertible();
        car2.drive();
        System.out.println("Number of Seats: " + car2.getNumberOfSeats());
        System.out.println("Transmission Type: " + car2.getTransmissionType());
        System.out.println();

        // Motorcycle 1
        Motorcycle bike1 = new Motorcycle("Yamaha", "Tracer", "Cruiser", "Modern");
        bike1.displayVehicleInfo();
        bike1.doWheelie();
        bike1.doLeaning();
        System.out.println("Body Type: " + bike1.getBodyType());
        System.out.println("Time Period: " + bike1.getTimePeriod());
        System.out.println();

        // Motorcycle 2
        Motorcycle bike2 = new Motorcycle("Ducatti", "Monster", "Sport", "Vintage");
        bike2.displayVehicleInfo();
        bike2.doWheelie();
        bike2.doLeaning();
        System.out.println("Body Type: " + bike2.getBodyType());
        System.out.println("Time Period: " + bike2.getTimePeriod());
            }
        }




