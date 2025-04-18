class BatteryPower implements PowerMode{
    private int batteryPercentage;

    public BatteryPower(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }

    public String getPowerStatus() {
        return "Battery power: " + batteryPercentage + "%";
    }
}