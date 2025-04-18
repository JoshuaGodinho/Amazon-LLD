public class Main {
    public static void main(String[] args) {
        Device echo = new EchoDotDevice(new BatteryPower(40));
        Device ipad = new IPadDevice(new PluggedInPower());

        echo.showBatteryStatus(); // Voice output
        ipad.showBatteryStatus(); // Display output
    }
} 