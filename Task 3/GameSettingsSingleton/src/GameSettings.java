public class GameSettings {
    /**
     * @author Abdul Moiz Meer
     */
    private static GameSettings instance;
    private int volume;

    // Private constructor to prevent instantiation
    private GameSettings() {
        this.volume = 50; // Default volume level
    }

    // Public method to provide global access
    public static GameSettings getInstance() {
        if (instance == null) {
            instance = new GameSettings();
        }
        return instance;
    }

    // Method to set volume
    public void setVolume(int level) {
        this.volume = level;
        System.out.println("Volume set to: " + volume);
    }

    // Method to get volume
    public int getVolume() {
        return volume;
    }
}
