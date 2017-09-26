package pl.teamjava.hotel.models;

public class UserModel {
    private String name;
    private String lastname;
    private String username;
    private String email;
    private String phoneNumber;

    private boolean isAccessCodeEntered; // rozróżnia zwykłego gościa od landlorda (Paweł)
}
