package FlightControl;

import FlightControl.ui.TextUI;
import FlightControl.domain.*;
import FlightControl.logic.FlightControl;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        HashMap<String, Airplane> airplanes = new HashMap<>();
        HashMap<String, Place> places = new HashMap<>();
        HashMap<String, Flight> flights = new HashMap<>();
        
        FlightControl flightControl = new FlightControl(airplanes, places, flights);
        
        TextUI programm = new TextUI(new Scanner(System.in), flightControl);
        programm.start();
    }
}
