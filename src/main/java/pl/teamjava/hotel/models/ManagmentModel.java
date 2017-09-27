package pl.teamjava.hotel.models;

public class ManagmentModel extends UserModel {
    private String accessCode;

    public ManagmentModel(String name, String lastname, String username, String email, String phoneNumber, String accessCode) {
        super(name, lastname, username, email, phoneNumber);
        this.accessCode = accessCode;
    }

    public String getAccessCode() {
        return accessCode;
    }
    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }
}
