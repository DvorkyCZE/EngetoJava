package com.engeto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

	    // Create list of guests
        List<Guest> listOfGuests =  new ArrayList<>();
        listOfGuests.add(new Guest("Adéla","Malíková", LocalDate.of(1993,3,13)));
        listOfGuests.add(new Guest("Jan", "Dvořáček", LocalDate.of(1995,5,5)));
        // Print description of clients
        System.out.println("Výpis hostů:");
        for (Guest guest : listOfGuests){
            System.out.println(guest.getDescription());
        }

        // List<Trida> nazevListu = new ArrayList<>();
        List<Room> listOfRooms = new ArrayList<>();
        // nazevListu.add(objekt);
        listOfRooms.add(new Room(1,1,1000));
        listOfRooms.add(new Room(2,1,1000, false));
        listOfRooms.add(new Room(3,3,2400, false, false));
        System.out.println("_________________________________");
        System.out.println("Výpis všech pokojů:");

        // for (Trida pomocnaPromenna : nazevListu) { operace }
        for (Room room : listOfRooms){
            System.out.println(room.getDescription());
        }
        System.out.println("_________________________________");
        System.out.println("Výpis POUZE konkrétních pokojů:");
        System.out.println(listOfRooms.get(0).getDescription());
        System.out.println(listOfRooms.get(1).getDescription());


    }
}
