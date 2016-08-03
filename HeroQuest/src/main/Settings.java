package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Settings class that stores local settings.
 * @author Matthew
 */
public class Settings {
    // The SETTINGS HashMap stores all settings based on a predetermined hash.
    private static final Map<String, Integer> SETTINGS = new HashMap();
    
    // Store file names for local settings files.
    private static final String PSETTINGS = "PlayerSettings.txt", GSETTINGS = "GameSettings.txt";
    
    // Create constants for interpreted settings.
    
    /**
     * Collect the settings from the local files and store them to the HashMap.
     */
    public static void initializeSettings() {
        readSettings(PSETTINGS);
        readSettings(GSETTINGS);
    }
    
    /**
     * Reads through a given text file and applies the contents to the SETTINGS HashMap.
     * @param s file path
     * @throws IOException 
     */
    private static void readSettings(String s) {
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(s)))) {
            String line = reader.readLine();
            while (line != null) {
                String[] setting = line.split("=");
                SETTINGS.put(setting[0], Integer.valueOf(setting[1]));
                line = reader.readLine();
            }
        } catch (IOException io) {}
    }
    
    /**
     * Takes a hash and returns the given setting.
     * @param s hash
     * @return setting
     */
    public static int getSetting(String s) {
        checkSettings();
        return SETTINGS.get(s);
    }
    
    /**
     * Takes a hash and a default value. If the setting aligned with that hash
     * returns null then it returns the default value.
     * @param s hash
     * @param i default value
     * @return setting
     */
    public static int getSettingOrDefault(String s, int i) {
        checkSettings();
        return SETTINGS.getOrDefault(s, i);
    }
    
    public static void checkSettings() {
        if (SETTINGS.isEmpty()) {
            initializeSettings();
        }
    }
}
