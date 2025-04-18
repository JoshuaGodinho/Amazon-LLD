public class IPadDevice extends SmartDevice {
    public IPadDevice(PowerMode powerMode) {
        super(powerMode);
    }

    public void showBatteryStatus() {
        System.out.println("Screen display: " + getStatusMessage());
    }
}