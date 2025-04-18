class EchoShow extends AlexaDevice {
    public EchoShow(boolean isPluggedIn) {
        super(new TypingInput(), new DisplayOutput(),
              isPluggedIn ? new PluggedInPower() : new BatteryPower(100));
    }
}
