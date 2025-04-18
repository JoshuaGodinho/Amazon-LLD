class EchoDotDevice extends SmartDevice {
    public EchoDotDevice(PowerMode powerMode) {
        super(powerMode);
    }
    public void showBatteryStatus() {
        System.out.println("Voice output: " + getStatusMessage());
    }
}

