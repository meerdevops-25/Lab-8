public class Main {
    /**
     * @author Abdul Moiz Meer
     */
    public static void main(String[] args) {
        // Get the singleton instance
        GameSettings settings = GameSettings.getInstance();

        // Set and get volume
        settings.setVolume(75);
        System.out.println("Current Volume: " + settings.getVolume());

        // Verify singleton behavior
        GameSettings anotherInstance = GameSettings.getInstance();
        System.out.println("Is same instance? " + (settings == anotherInstance));
    }
}
