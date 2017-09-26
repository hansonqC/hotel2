package pl.teamjava.hotel.models;

public class UserModel {
    private String name;
    private String lastname;
    private String username;
    private String email;
    private String phoneNumber;

    public UserModel(String name, String lastname, String username, String email, String phoneNumber) {
        this.name = name;
        this.lastname = lastname;
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
