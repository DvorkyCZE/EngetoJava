package com.engeto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    Guest mainGuest;
    List<Guest> otherGuest = new ArrayList<>();
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


}
