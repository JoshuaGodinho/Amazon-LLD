abstract class SmartDevice implements Device {
   protected PowerMode powerMode;

    public SmartDevice(PowerMode powerMode) {
        this.powerMode = powerMode;
    }

    protected String getStatusMessage() {
        return "Power Status: " + powerMode.getPowerStatus();
    }
}
