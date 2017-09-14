package config;

import io.appium.java_client.android.AndroidDriver;
import org.testng.TestListenerAdapter;

public class MyListener extends TestListenerAdapter {
    private static AndroidDriver driver;

    public static AndroidDriver getDriver() {
        return driver;
    }

    public static void setDriver(AndroidDriver driver) {
        MyListener.driver = driver;
    }
}
