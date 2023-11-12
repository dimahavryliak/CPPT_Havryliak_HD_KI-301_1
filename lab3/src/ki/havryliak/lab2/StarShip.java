
package ki.havryliak.lab2;

import java.io.*;

public abstract class StarShip {
    //Data fields
    protected String starShipName;
    protected StarShipColor starShipColor;
    protected EngineStatus engineStatus;
    protected static int starShipNumber = 1;
    protected PrintWriter outputStream = new PrintWriter(String.format("StarShipLogger%s.txt", starShipNumber));

    //Constructors
    public StarShip() throws FileNotFoundException {
        starShipName = String.format("#%s StarShip", starShipNumber);
        starShipColor = StarShipColor.RED;
        engineStatus = EngineStatus.TURNED_OFF;
        outputStream.println("Creating a StarShip");
        ++starShipNumber;
    }

    public StarShip(String starShipName) throws FileNotFoundException {
        this.starShipName = starShipName;
        starShipColor = StarShipColor.RED;
        engineStatus = EngineStatus.TURNED_OFF;
        outputStream.println("Creating a StarShip");
        ++starShipNumber;
    }

    public StarShip(String starShipName, StarShipColor starShipColor) throws FileNotFoundException {
        this.starShipName = starShipName;
        this.starShipColor = starShipColor;
        engineStatus = EngineStatus.TURNED_OFF;
        outputStream.println("Creating a StarShip");
        ++starShipNumber;
    }

    public StarShip(String starShipName, StarShipColor starShipColor, EngineStatus engineStatus) throws FileNotFoundException {
        this.starShipName = starShipName;
        this.starShipColor = starShipColor;
        this.engineStatus = engineStatus;
        outputStream.println("Creating a StarShip");
        ++starShipNumber;
    }

    //Enum
    public enum EngineStatus {
        TURNED_OFF, LOW, MEDIUM, HIGH
    }

    public enum StarShipColor {
        WHITE, BLACK, RED, PINK, YELLOW, GREEN, BLUE
    }

    //Getter methods
    public String getStarShipName() {
        outputStream.println("getStarShipName: " + starShipName);
        return starShipName;
    }

    public EngineStatus getEngineStatus() {
        outputStream.println("getEngineStatus: " + engineStatus);
        return engineStatus;
    }

    public StarShipColor getStarShipColor() {
        outputStream.println("getStarShipColor: " + starShipColor);
        return starShipColor;
    }

    //Set methods

    public abstract void turnOffEngine();

    public abstract void setLowEngine();

    public abstract void setMediumEngine();

    public abstract void setHighEngine();

    public void closeLoggerFile() {
        outputStream.println("Close logger file.");
        outputStream.close();
    }
}