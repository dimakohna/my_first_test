package model;

import config.AndroidConfig;
import org.openqa.selenium.By;


public class SignInPage extends AndroidConfig {
    private final By SIGN_UP_BUTTON = By.id("signUpButton");

    public void openSignUp() {
        waitAndTap(SIGN_UP_BUTTON);
    }
    public void waitLoadedPage(){
        waitElement(SIGN_UP_BUTTON);
    }
}
