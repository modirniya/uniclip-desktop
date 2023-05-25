package xyz.uniclip.ucd.util;

import java.util.Locale;
import java.util.ResourceBundle;


public class ResourceHelper {
    // Single instance of ResourceHelper
    private static final String TAG = "ResourceHelper";
    private static ResourceHelper instance;
    private ResourceBundle res;

    // Private constructor prevents instantiation from other classes
    private ResourceHelper() {
        try {
            res = ResourceBundle.getBundle("xyz.uniclip.ucd.strings", Locale.getDefault());
        } catch (Exception e) {
            LogHelper.Companion.e(TAG, "Exception occurred while loading strings resources\n"
                    + e.getMessage());
        }
    }

    // Public method to get the single instance of ResourceHelper
    public static synchronized ResourceHelper getInstance() {
        if (instance == null) {
            instance = new ResourceHelper();
        }
        return instance;
    }

    public String getString(String key) {
        return res.getString(key);
    }

    // Your other methods go here
}
