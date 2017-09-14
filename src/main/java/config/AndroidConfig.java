package config;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Utilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import static config.MyListener.getDriver;


public class AndroidConfig {
    protected final String APP_PACKAGE_NAME="com.erminesoft.ngc:id/";
    private AndroidDriver androidDriver;
    private final String UDID_MOTOROLA="ZX1B24GVX2";


    public void waitAndTap(By element){
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        getDriver().findElement(element).click();
    }

    private void setText(By element, String text){
        getDriver().findElement(element).sendKeys(text);

    }

    public void waitAndSetText(By element, String text) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        getDriver().findElement(element).sendKeys(text);
    }

    public void waitElement(By element){
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }


    /*public AndroidDriver getAndroidDriver() {
        return androidDriver;
    }

    public void setAndroidDriver(AndroidDriver androidDriver) {
        this.androidDriver = androidDriver;
    }  */

    public void prepareAndroidDevice(String buildName){
        String platform = "Android";
        String BUILD_PATH = "builds/android/";
        File APP = new Utilities().getFileFromResources(BUILD_PATH + buildName);
        System.out.println("Testing Android, build # " + buildName);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("udid", UDID_MOTOROLA);
        capabilities.setCapability("deviceName", "AndroidDevice");
        capabilities.setCapability("platformName", platform);
        capabilities.setCapability("app", APP);

        try {
            AndroidDriver androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            MyListener.setDriver(androidDriver);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


        System.out.println("driver is set");



    }
}
