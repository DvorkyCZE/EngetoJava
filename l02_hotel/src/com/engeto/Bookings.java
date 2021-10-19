package com.engeto;

import java.util.ArrayList;
import java.util.List;

/**
 * Class represent list of guests bookings
 *
 * @return  a string representation of the objects
 */

public class Bookings {
    List<Booking> bookings = new ArrayList<>();

    public void setBooking(Booking newBooking) {
        bookings.add(newBooking);
    }
//    public void printBookings(){
//        for (Booking booking : bookings){
//            System.out.println(booking.getDescription());
//        }
//    }

}
