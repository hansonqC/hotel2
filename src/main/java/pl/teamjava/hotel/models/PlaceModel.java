package pl.teamjava.hotel.models;

public class PlaceModel {
    private String name;
    private String city;
    private String region;
    private String accessCode;
    private String kindOfPlace;

    private boolean isThereWiFi;
    private boolean isThereSwimmingPool;
    private boolean isThereSpa;

    public PlaceModel(String name, String city, String region, String accessCode, String kindOfPlace, boolean isThereWiFi, boolean isThereSwimmingPool, boolean isThereSpa) {
        this.name = name;
        this.city = city;
        this.region = region;
        this.accessCode = accessCode;
        this.kindOfPlace = kindOfPlace;
        this.isThereWiFi = isThereWiFi;
        this.isThereSwimmingPool = isThereSwimmingPool;
        this.isThereSpa = isThereSpa;
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

    public String getKindOfPlace() {
        return kindOfPlace;
    }
    public void setKindOfPlace(String kindOfPlace) {
        this.kindOfPlace = kindOfPlace;
    }

    public boolean isThereWiFi() {
        return isThereWiFi;
    }
    public void setThereWiFi(boolean thereWiFi) {
        isThereWiFi = thereWiFi;
    }

    public boolean isThereSwimmingPool() {
        return isThereSwimmingPool;
    }
    public void setThereSwimmingPool(boolean thereSwimmingPool) {
        isThereSwimmingPool = thereSwimmingPool;
    }

    public boolean isThereSpa() {
        return isThereSpa;
    }
    public void setThereSpa(boolean thereSpa) {
        isThereSpa = thereSpa;
    }
}
