package com.engeto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    Guest mainGuest;
    List<Guest> otherGuests = new ArrayList<>();
    Room room;
    LocalDate fromDate;
    LocalDate toDate;

    public Booking(Guest mainGuest, Room room, LocalDate fromDate, LocalDate toDate){
        this.mainGuest = mainGuest;
        this.room = room;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public void setMainGuest(Guest mainGuest) {
        this.mainGuest = mainGuest;
    }
    public Guest getMainGuest() {
        return mainGuest;
    }

    public void addGuest(Guest newGuest){
        otherGuests.add(newGuest);
    }
    public void deleteGuest(Guest guest){
        otherGuests.remove(guest);
    }

    public void setRoom(Room room) {
        this.room = room;
    }
    public Room getRoom() {
        return room;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }
    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }
    public LocalDate getToDate() {
        return toDate;
    }


    public String getDescription(){
        String result = "Rezervace pokoje:\n "+mainGuest+", pokoj číslo: "+room+", od data: "+fromDate+", do data: "+toDate;
        if (otherGuests.isEmpty()){
            result += ", bez dalších hostů";
        } else{
                result +="\nDalší hosté: ";
            for (Guest guest : otherGuests){
                result += guest.getFullName() + ", ";}
        }

        return result;
    }
}
