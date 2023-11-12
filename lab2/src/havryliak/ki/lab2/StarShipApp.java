package havryliak.ki.lab2;

import java.io.FileNotFoundException;


public class StarShipApp {

    public static void main(String[] args) throws FileNotFoundException {
        StarShip starShip = new StarShip();
        starShip.setHighEngine();
        System.out.println(starShip.getStarShipName());
        System.out.println(starShip.getStarShipColor());
        System.out.println(starShip.getEngineStatus());

        StarShip starShip1 = new StarShip("#2 Kosmo 300", StarShip.StarShipColor.BLACK);
        System.out.println(starShip1.getStarShipName());
        System.out.println(starShip1.getStarShipColor());
        starShip1.setLowEngine();
        System.out.println(starShip1.getEngineStatus());


        starShip.closeLoggerFile();
        starShip1.closeLoggerFile();
    }
}
