class SoundOutput implements OutputMode {
    public void respond(String message) {
        System.out.println("Speaking: " + message);
    }
}