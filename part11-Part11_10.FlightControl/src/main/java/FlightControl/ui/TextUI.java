/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import java.util.Scanner;
import FlightControl.logic.*;
import java.util.Objects;

/**
 *
 * @author prima
 */
public class TextUI {

    private Scanner scanner;
    private FlightControl flightControl;

    public TextUI(Scanner scanner, FlightControl flightControl) {
        this.scanner = scanner;
        this.flightControl = flightControl;
    }

    public void start() {
        startAssetControl();
        System.out.println();
        startFlightControl();
        System.out.println();
    }

    private void startAssetControl() {
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();

        loop:
        do {
            System.out.println("Choose an action:\n"
                    + "[1] Add an airplane\n"
                    + "[2] Add a flight\n"
                    + "[x] Exit Airport Asset Control");

            System.out.print("> ");
            String userInput = scanner.nextLine();

            switch (userInput) {
                case "1":
                    addAirplane();
                    break;
                case "2":
                    addFlight();
                    break;
                case "x":
                    break loop;
            }
        } while (true);
    }

    private void startFlightControl() {
        System.out.println("Flight Control");
        System.out.println("------------");
        System.out.println();

        loop:
        do {
            System.out.println("Choose an action:\n"
                    + "[1] Print airplanes\n"
                    + "[2] Print flights\n"
                    + "[3] Print airplane details\n"
                    + "[x] Quit");

            System.out.print("> ");
            String userInput = scanner.nextLine();

            switch (userInput) {
                case "1":
                    printAriplanes();
                    System.out.println();
                    break;
                case "2":
                    printFlights();
                    System.out.println();
                    break;
                case "3":
                    printPlaneDetails();
                    System.out.println();
                    break;
                case "x":
                    break loop;
            }
        } while (true);
    }

    private void addAirplane() {
        System.out.print("Give the airplane id: ");
        String airplaneID = scanner.nextLine();
        System.out.print("Give the airplane capacity: ");
        int airplaneCapacity = Integer.valueOf(scanner.nextLine());
        this.flightControl.addPlane(airplaneID, airplaneCapacity);

    }

    private void addFlight() {
        System.out.print("Give the airplane id: ");
        String airplaneID = scanner.nextLine();
        System.out.print("Give the departure airport id: ");
        String departureID = scanner.nextLine();
        System.out.print("Give the target airport id: ");
        String targetID = scanner.nextLine();

        Airplane airplane = flightControl.getAirplane(airplaneID);

        flightControl.addFlight(airplane, departureID, targetID);
    }

    private void printAriplanes() {
        for (Airplane airplane : flightControl.getAirplanes().values()) {
            System.out.println(airplane);
        }
    }

    private void printFlights() {
        for (Flight flight : flightControl.getFlights()) {
            System.out.println(flight);
            System.out.println("");
        }
    }

    private void printPlaneDetails() {
        System.out.print("Give the airplane id: ");
        String airplaneID = scanner.nextLine();

        Airplane searchedPlane = flightControl.getAirplanes().containsKey(airplaneID)
                ? flightControl.getAirplanes().get(airplaneID)
                : null;

        if (!Objects.isNull(searchedPlane)) {
            System.out.println(searchedPlane);
        } else {
            System.out.println("No airplane with the id " + airplaneID + ".");
        }

    }

}
