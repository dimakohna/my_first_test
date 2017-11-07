package utilities;


import config.MyListener;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriverException;

import java.io.File;
import java.util.Random;

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

    public static String generateValidEmail() {
        final short minLength = 3;
        final short maxLength = 30;
        final String allowedSymbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-._0123456789";
        String validEmail;
        do {
            validEmail = null;
            StringBuilder part1 = new StringBuilder();
            StringBuilder part2 = new StringBuilder();
            StringBuilder part3 = new StringBuilder();
            int part1Length = new Random().nextInt(25) + 1;
            int part2Length = new Random().nextInt(26 - part1Length) + 1;
            int part3Length = new Random().nextInt(52 - part1Length - part2Length) + 1;

            if (part1Length < 1 || part2Length < 1 || part3Length < 1) {
                System.out.println("error: part1Length = " + part1Length);
                System.out.println("error: part2Length = " + part2Length);
                System.out.println("error: part3Length = " + part3Length);
            }
            for (int x = 0; x < part1Length; x++) {
                int randomSymbol = new Random().nextInt(allowedSymbols.length() - 1);
                part1.append(allowedSymbols.charAt(randomSymbol));
            }
            for (int x = 0; x < part2Length; x++) {
                int randomSymbol = new Random().nextInt(allowedSymbols.length() - 1);
                part2.append(allowedSymbols.charAt(randomSymbol));
            }
            for (int x = 0; x < part3Length; x++) {
                int randomSymbol = new Random().nextInt(allowedSymbols.length() - 1);
                part3.append(allowedSymbols.charAt(randomSymbol));
            }


            validEmail = part1 + "@" + part2 + "." + part3;
        } while (validEmail.length() < minLength || validEmail.length() > maxLength);
        System.out.println("generateValidEmail: " + validEmail);
        return validEmail;

    }
    public static String generateValidPassword() {
        final short minLength = 8;
        final short maxLength = 25;
        final String allowedSymbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-._0123456789";
        StringBuilder validPassword;
        do {
            validPassword = null;
            StringBuilder part1 = new StringBuilder();
            int part1Length = new Random().nextInt(24) + 1;


            if (part1Length < 8 ) {
                System.out.println("error: part1Length = " + part1Length);

            }
            for (int x = 0; x < part1Length; x++) {
                int randomSymbol = new Random().nextInt(allowedSymbols.length() - 1);
                part1.append(allowedSymbols.charAt(randomSymbol));
            }

            validPassword = part1;
        } while (validPassword.length() < minLength || validPassword.length() > maxLength);
        System.out.println("generateValidPassword: " + validPassword);
        return validPassword.toString();

    }
    public static String generateValidName() {
        final short minLength = 2;
        final short maxLength = 40;
        final String allowedSymbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-._'";
        StringBuilder validName;
        do {
            //validName = null;
            StringBuilder part1 = new StringBuilder();
            int part1Length = new Random().nextInt(39) + 1;


            if (part1Length < 2 ) {
                System.out.println("error: part1Length = " + part1Length);

            }
            for (int x = 0; x < part1Length; x++) {
                int randomSymbol = new Random().nextInt(allowedSymbols.length() - 1);
                part1.append(allowedSymbols.charAt(randomSymbol));
            }

            validName = part1;
        } while (validName.length() < minLength || validName.length() > maxLength);
        System.out.println("generateValidName: " + validName);
        return validName.toString();

    }

}
