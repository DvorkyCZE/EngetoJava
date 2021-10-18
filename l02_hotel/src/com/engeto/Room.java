package com.engeto;

public class Room {
    int roomId;
    int capacity;
    boolean hasBalcony;
    boolean hasViewOfTheSea;
    int pricePerNight;

    public Room(int roomId, int capacity, boolean isBalcony, boolean isViewOfTheSea, int pricePerNight){
        this.roomId = roomId;
        this.capacity = capacity;
        this.hasBalcony = isBalcony;
        this.hasViewOfTheSea = isViewOfTheSea;
        this.pricePerNight = pricePerNight;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setHasBalcony(boolean balcony) {
        this.hasBalcony = balcony;
    }
    public boolean isBalcony(){
        return hasBalcony;
    }

    public void setHasViewOfTheSea(boolean viewOfTheSea) {
        this.hasViewOfTheSea = viewOfTheSea;
    }

    public boolean isViewOfTheSea() {
        return hasViewOfTheSea;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", capacity=" + capacity +
                ", hasBalcony=" + hasBalcony +
                ", hasViewOfTheSea=" + hasViewOfTheSea +
                ", pricePerNight=" + pricePerNight +
                '}';
    }
}
