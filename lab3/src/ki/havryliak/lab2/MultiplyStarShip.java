
package ki.havryliak.lab2;

import java.io.FileNotFoundException;

public class MultiplyStarShip extends StarShip implements EngineWearConrolInterface, FuelControlInterface {
    //Data fields
    private double engineWear;
    private double fuel;

    //Constructors
    public MultiplyStarShip() throws FileNotFoundException {
        super();
        fuel = 234.0;
        engineWear = 145.0;
    }

    public MultiplyStarShip(String starShipName) throws FileNotFoundException {
        super();
        this.starShipName = starShipName;
        fuel = 1000.0;
        engineWear = 1000.0;
    }

    public MultiplyStarShip(String starShipName, StarShipColor starShipColor) throws FileNotFoundException {
        super();
        this.starShipName = starShipName;
        this.starShipColor = starShipColor;
        fuel = 1000.0;
        engineWear = 1000.0;
    }

    public MultiplyStarShip(String starShipName, StarShipColor starShipColor, double fuel) throws FileNotFoundException {
        super();
        this.starShipName = starShipName;
        this.starShipColor = starShipColor;
        this.fuel = fuel;
        engineWear = 1000.0;
    }

    public MultiplyStarShip(String starShipName, StarShipColor starShipColor, double fuel, double engineWear) throws FileNotFoundException {
        super();
        this.starShipName = starShipName;
        this.starShipColor = starShipColor;
        this.fuel = fuel;
        this.engineWear = engineWear;
    }


    //Getter methods
    public String getStarShipName() {
        return "#" + starShipNumber + " " + starShipName;
    }

    public double getFuel() {
        return fuel;
    }

    public double getEngineWear() {
        return engineWear;
    }

    //Overridden methods
    @Override
    public double checkFuel() {
        fuel -= 0.100;
        if (fuel - 0.100 < 0) {
            System.out.println("the starship has no fuel");
            return 0;
        }
        System.out.println("Engine wear: ");
        return fuel;
    }

    @Override
    public double checkEngineWear() {
        engineWear -= 0.100;
        if (engineWear - 0.100 < 0) {
            System.out.println("the starship has no fuel");
            return 0;
        }
        System.out.println("Fuel wear: ");

        return engineWear;
    }

    //refuel method
    public void refuel() {
        if (fuel == 1000.0)
            System.out.println("Is already full.");
        else {
            System.out.println("Fuel was reload ");
            fuel = 1000.0;
        }
    }

    public void repair() {
        if (engineWear == 1000.0)
            System.out.println("Is already full.");
        else {
            System.out.println("Engine was repair ");

            engineWear = 1000.0;
        }
    }

    @Override
    public void turnOffEngine() {
        if (engineStatus == EngineStatus.TURNED_OFF) {
            System.out.println("Engine is already turned off.");
            outputStream.println("Engine is already turned off.");
        } else {
            System.out.println("Engine is turned off.");
            outputStream.println("Engine is turned off.");
            engineStatus = EngineStatus.TURNED_OFF;
        }
    }

    @Override
    public void setLowEngine() {
        if (engineStatus == EngineStatus.LOW) {
            System.out.println("Engine is already in low mode.");
            outputStream.println("Engine is already in low mode.");
        } else {
            System.out.println("Engine is set in low mode.");
            outputStream.println("Engine is set in low mode.");
            engineStatus = EngineStatus.LOW;
        }
    }

    @Override
    public void setMediumEngine() {
        if (engineStatus == EngineStatus.MEDIUM) {
            System.out.println("Engine is already in medium mode.");
            outputStream.println("Engine is already in medium mode.");
        } else {
            System.out.println("Engine is set in medium mode.");
            outputStream.println("Engine is set in medium mode.");
            engineStatus = EngineStatus.MEDIUM;
        }
    }

    @Override
    public void setHighEngine() {
        if (engineStatus == EngineStatus.HIGH) {
            System.out.println("Engine is already in high mode.");
            outputStream.println("Engine is already in high mode.");
        } else {
            System.out.println("Engine is set in high mode.");
            outputStream.println("Engine is set in high mode.");
            engineStatus = EngineStatus.HIGH;
        }
    }
}



