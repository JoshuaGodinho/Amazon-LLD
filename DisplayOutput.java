
class DisplayOutput implements OutputMode {
    public void respond(String message) {
        System.out.println("Displaying: " + message);
    }
}