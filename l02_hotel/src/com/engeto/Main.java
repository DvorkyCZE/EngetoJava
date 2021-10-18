package com.engeto;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// Create clients
    Guest adela = new Guest("Adéla","Malíková", LocalDate.of(1993,3,13));
    Guest jan = new Guest("Jan", "Dvořáček", LocalDate.of(1995,5,5));
    // Print description of clients
        System.out.println(adela.getDescription());
        System.out.println(jan.getDescription());
        System.out.println(adela.getFullName());
        System.out.println(jan.getFullName());
    // Create rooms
    Room room1 = new Room(1,1,true,true,1000);
    Room room2 = new Room(2,1,true,true,1000);
    Room room3 = new Room(3,3,false,true,2400);
    // Print description of rooms
        System.out.println(room1);
        System.out.println(room2);
        System.out.println(room3);


    }
}
