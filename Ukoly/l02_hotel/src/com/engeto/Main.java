package com.engeto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String separator = System.getProperty("line.separator");

	    // Create list of guests
        List<Guest> listOfGuests =  new ArrayList<>();
        listOfGuests.add(new Guest("Adéla","Malíková", LocalDate.of(1993,3,13)));
        listOfGuests.add(new Guest("Jan", "Dvořáček", LocalDate.of(1995,5,5)));
        listOfGuests.add(new Guest("Petr", "Králíček", LocalDate.of(1995,5,5)));
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
        System.out.println(separator);
        System.out.println("Výpis všech pokojů:");

        // for (Trida pomocnaPromenna : nazevListu) { operace }
        for (Room room : listOfRooms){
            System.out.println(room.getDescription());
        }
        System.out.println(separator);
        System.out.println("Výpis POUZE konkrétních pokojů:");
        System.out.println(listOfRooms.get(0).getDescription());
        System.out.println(listOfRooms.get(1).getDescription());

        Bookings bookings = new Bookings();
        Booking booking = new Booking(listOfGuests.get(0), listOfRooms.get(0),LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26));
        bookings.addBooking(booking);

        Booking booking1 = new Booking(listOfGuests.get(0), listOfRooms.get(1),LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14));
        booking1.addGuest(listOfGuests.get(1));
        bookings.addBooking(booking1);

        Booking booking2 = new Booking(listOfGuests.get(1), listOfRooms.get(2),LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14));
        booking2.addGuest(listOfGuests.get(0));
        booking1.addGuest(listOfGuests.get(2));
        bookings.addBooking(booking2);

//Výpis jednotlivých objektů s rezervací
        System.out.println(separator);
        System.out.println(booking.getDescription());
        System.out.println(booking1.getDescription());
        System.out.println(booking2.getDescription());
        System.out.println(separator);
//Výpis všech objektů s rezervací uložených do ArrayListu
        bookings.printBookings();
    }
}
