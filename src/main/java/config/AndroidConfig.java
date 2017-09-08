package config;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AndroidConfig {
    private AndroidDriver androidDriver;

    public void tap(By element){
        getAndroidDriver().findElement(element).click();
    }
    public void waitAndTap(By element){
        WebDriverWait wait = new WebDriverWait(getAndroidDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        getAndroidDriver().findElement(element).click();
    }
    private void setText(By element, String text){
        getAndroidDriver().findElement(element).sendKeys(text);

    }
    public void waitAndSetText(By element, String text) {
        WebDriverWait wait = new WebDriverWait(getAndroidDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        getAndroidDriver().findElement(element).sendKeys(text);
    }
    public void waitElement(By element){
        WebDriverWait wait = new WebDriverWait(getAndroidDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }


    public AndroidDriver getAndroidDriver() {
        return androidDriver;
    }

    public void setAndroidDriver(AndroidDriver androidDriver) {
        this.androidDriver = androidDriver;
    }
}
