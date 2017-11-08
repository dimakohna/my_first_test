package model;


import config.AndroidConfig;
import org.openqa.selenium.By;

import static config.MyListener.getDriver;

public class SignUpPage extends AndroidConfig {

    final private By email = By.id(APP_PACKAGE_NAME + "welcome_sign_up_email");
    final private By password = By.id(APP_PACKAGE_NAME + "welcome_sign_up_password");
    final private By confirmPassword = By.id(APP_PACKAGE_NAME + "welcome_sign_up_confirm_password");
    final private By name = By.id(APP_PACKAGE_NAME + "welcome_sign_up_name");
    final private By checkBox = By.id(APP_PACKAGE_NAME + "welcome_sign_up_terms_and_conditions_checkbox");
    final private By nextStepBtn = By.id(APP_PACKAGE_NAME + "welcome_sign_up_next_button");
    final private By someText = By.name("User agrees with terms of service");
    final private By dateOfBirth = By.id(APP_PACKAGE_NAME + "welcome_sign_up_age");
    final private By dateOfBirthSet = By.id(APP_PACKAGE_NAME + "ok");
    final private By dateOfBirthField = By.id(APP_PACKAGE_NAME + "welcome_sign_up_age");
    final private By soneTag = By.id(APP_PACKAGE_NAME + "welcome_sign_up_games_tag");
    final private By createAccount = By.id(APP_PACKAGE_NAME + "welcome_sign_up_create_account");

    public void clickNextStep() {waitAndTap(nextStepBtn);}

    public void setEmail(String text) {waitAndSetText(email, text);}

    public void setPassword(String text) {waitAndSetText(password, text);}

    public void setConfirmPassword(String text) {
        waitAndSetText(confirmPassword, text);
    }

    public void setName(String text) {
        waitAndSetText(name, text);
    }

    public void setCheckBox() {waitAndTap(checkBox);}

    public void scrollTo(){getDriver().scrollTo("User agrees with terms of service");}


    public void setDateOfBirth() {
        waitAndTap(dateOfBirth);
        waitAndTap(dateOfBirthSet);
    }


    public void waitLoadedPage() {waitElement(someText);}
    public void nextStepBtn(){waitAndTap(nextStepBtn);}
    public void selectTag(){waitAndTap(soneTag);}
    public void setCreateAccount(){waitAndTap(createAccount);}

}
