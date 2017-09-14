package model;


import config.AndroidConfig;
import org.openqa.selenium.By;

public class SignUpPage extends AndroidConfig {

    final private By email = By.id(APP_PACKAGE_NAME + "welcome_sign_up_email");
    final private By password = By.id(APP_PACKAGE_NAME + "welcome_sign_up_password");
    final private By confirmPassword = By.id(APP_PACKAGE_NAME + "welcome_sign_up_confirm_password");
    final private By name = By.id(APP_PACKAGE_NAME + "welcome_sign_up_name");
    final private By checkBox = By.id("checkBox");
    final private By nextStepBtn = By.id("nextStepBtn");
    final private By someText = By.id("someText");
    final private By dateOfBirth = By.id(APP_PACKAGE_NAME + "welcome_sign_up_age");
    final private By dateOfBirthSet = By.id(APP_PACKAGE_NAME + "ok");
    final private By dateOfBirthField = By.id(APP_PACKAGE_NAME + "welcome_sign_up_age");


    public void clickNextStep() {
        waitAndTap(nextStepBtn);
    }

    public void setEmail(String text) {
        waitAndSetText(email, text);
    }

    public void setPassword(String text) {
        waitAndSetText(password, text);
    }

    public void setConfirmPassword(String text) {
        waitAndSetText(confirmPassword, text);
    }

    public void setName(String text) {
        waitAndSetText(name, text);
    }

    public void setCheckBox() {
        waitAndTap(checkBox);
    }

    public void setDateOfBirth() {
        waitAndTap(dateOfBirth);
        waitAndTap(dateOfBirthSet);
    }

    public void waitLoadedPage() {
        waitElement(someText);
    }


}
