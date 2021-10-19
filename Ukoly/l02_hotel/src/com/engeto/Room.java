package com.engeto;
/**
 * Třída Room
 * slouží pro vytvoření pokojů(objektů) v hotelu
*/
public class Room {
    // Atributy:
    private int roomId;
    private int capacity;
    private int pricePerNight;
    private boolean hasBalcony;
    private boolean hasViewOfTheSea;

    /*
     * Konstruktory třídy Room
     * Pro vytvoření pokoje je nutné zadat ID,kapacita pokoje a cena za noc
     */
    public Room(int roomId, int capacity, int pricePerNight, boolean hasBalcony, boolean hasViewOfTheSea){
        this.roomId = roomId;
        this.capacity = capacity;
        this.pricePerNight = pricePerNight;
        this.hasBalcony = hasBalcony;
        this.hasViewOfTheSea = hasViewOfTheSea;
    }

    public Room(int roomId, int capacity, int pricePerNight, boolean hasBalcony){
        this(roomId, capacity, pricePerNight, hasBalcony, true);
    }

    public Room(int roomId, int capacity, int pricePerNight){
        this(roomId, capacity, pricePerNight, true, true);
    }

    public int getRoomId() {
        return roomId;
    }
    public void setRoomId(int roomId) {
        this.roomId = roomId;
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

    public String getDescription(){
        return "Pokoj č. "+roomId+", kapacita: "+capacity+" osoba/y , cena " +pricePerNight+" Kč/noc, balkón:"+hasBalcony+", výhled na moře:"+hasViewOfTheSea;
    }

}
