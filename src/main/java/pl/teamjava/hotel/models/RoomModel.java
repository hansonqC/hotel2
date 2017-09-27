package pl.teamjava.hotel.models;

public class RoomModel {
    private String name;
    private String kindOfRoom;
    private int amountOfPeopleIn;
    private String placeName; // (powiązanie do hotelu/domku/pola (Paweł)
    private double price;
    private boolean isBooked;


    public RoomModel(String name, String kindOfRoom, int amountOfPeopleIn, String placeName, double price, boolean isBooked) {
        this.name = name;
        this.kindOfRoom = kindOfRoom;
        this.amountOfPeopleIn = amountOfPeopleIn;
        this.placeName = placeName;
        this.price = price;
        this.isBooked = isBooked;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getKindOfRoom() {
        return kindOfRoom;
    }
    public void setKindOfRoom(String kinfOfRoom) {
        this.kindOfRoom = kinfOfRoom;
    }

    public int getAmountOfPeopleIn() {
        return amountOfPeopleIn;
    }
    public void setAmountOfPeopleIn(int amountOfPeopleIn) {
        this.amountOfPeopleIn = amountOfPeopleIn;
    }

    public String getPlaceName() {
        return placeName;
    }
    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isBooked() {
        return isBooked;
    }
    public void setBooked(boolean booked) {
        isBooked = booked;
    }
}
