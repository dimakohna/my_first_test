package utilities;


import config.MyListener;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriverException;

import java.io.File;

import static config.MyListener.getDriver;

public class Utilities {

    public File getFileFromResources(String fileName) {
        ClassLoader classLoader = getClass().getClassLoader();
        return new File(classLoader.getResource(fileName).getFile());
    }

    public static void swipingToTop() {
        sleep(2000);
        AppiumDriver driver = MyListener.getDriver();
        Dimension size = driver.manage().window().getSize();
        int starty = (int) (size.height * 0.80);
        int endy = (int) (size.height * 0.20);
        int startx = (int) (size.width * 0.3);
        driver.swipe(startx, starty, startx, endy, 3000);
        sleep(2000);
    }

    public static void swipingToDown() {
        AppiumDriver driver = MyListener.getDriver();
        Dimension size = driver.manage().window().getSize();
        int starty = (int) (size.height * 0.80);
        int endy = (int) (size.height * 0.20);
        int startx = (int) (size.width * 0.3);
        driver.swipe(startx, endy, startx, starty, 3000);
        sleep(2000);
    }

    public static void hideKeyboard() {
        try {
            getDriver();
            Thread.sleep(2000);
            getDriver().hideKeyboard();
            Thread.sleep(2000);
        } catch (WebDriverException | InterruptedException e) {
        }
    }

    public static void sleep(int amount) {
        try {
            Thread.sleep(amount);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
