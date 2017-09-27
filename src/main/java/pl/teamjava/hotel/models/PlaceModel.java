package pl.teamjava.hotel.models;

public class PlaceModel {
    private String name;
    private String city;
    private String region;
    private String accessCode;
    private String category;

    public PlaceModel(String name, String city, String region, String accessCode, String category) {
        this.name = name;
        this.city = city;
        this.region = region;
        this.accessCode = accessCode;
        this.category = category;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }

    public String getAccessCode() {
        return accessCode;
    }
    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}
