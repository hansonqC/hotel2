package pl.teamjava.hotel.models;

public class PlaceModel {
    private String name;
    private String city;
    private String region;
    private int availableNumberOfPeople; // TODO: metoda zliczająca ilość miejsc po ilości w pokojach (Paweł)
    private String accessCode;
    private String kindOfPlace; // określa czy hotel, pole namiotowe czy domki kempingowe (Paweł)

    private boolean isThereWiFi;
    private boolean isThereSwimmingPool;
    private boolean isThereSpa; // coś jeszcze? (Paweł)

}
