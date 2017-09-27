package pl.teamjava.hotel.models;

public class OptionModel {
    private boolean isThereWiFi;
    private boolean isThereSwimmingPool;
    private boolean isThereSpa;
    private boolean canIHaveAPet;

    public OptionModel(boolean isThereWiFi, boolean isThereSwimmingPool, boolean isThereSpa, boolean canIHaveAPet) {
        this.isThereWiFi = isThereWiFi;
        this.isThereSwimmingPool = isThereSwimmingPool;
        this.isThereSpa = isThereSpa;
        this.canIHaveAPet = canIHaveAPet;
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

    public boolean isCanIHaveAPet() {
        return canIHaveAPet;
    }
    public void setCanIHaveAPet(boolean canIHaveAPet) {
        this.canIHaveAPet = canIHaveAPet;
    }
}
