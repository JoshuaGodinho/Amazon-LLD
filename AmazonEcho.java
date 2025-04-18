class AmazonEcho extends AlexaDevice {
    public AmazonEcho() {
        super(new VoiceInput(), new SoundOutput(), new PluggedInPower());
    }
}
