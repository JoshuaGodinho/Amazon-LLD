abstract class AlexaDevice {
    protected InputMode inputMode;
    protected OutputMode outputMode;
    protected PowerMode powerMode;

    public AlexaDevice(InputMode inputMode, OutputMode outputMode, PowerMode powerMode) {
        this.inputMode = inputMode;
        this.outputMode = outputMode;
        this.powerMode = powerMode;
    }

    public void askBatteryStatus() {
        String status = powerMode.getPowerStatus();
        outputMode.respond("Battery status: " + status);
    }

    public void receiveInput() {
        inputMode.receiveInput();
    }
}