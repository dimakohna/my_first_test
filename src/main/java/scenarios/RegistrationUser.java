package scenarios;


import config.AndroidConfig;
import io.appium.java_client.android.AndroidDriver;
import model.SignInPage;
import model.SignUpPage;
import utilities.Utilities;
import model.SeshWallPage;

import java.net.MalformedURLException;

public class RegistrationUser {
    public void registerValidUser(){
        SignInPage signInPage = new SignInPage();
        signInPage.openSignUp();
        SignUpPage signUpPage = new SignUpPage();
        String validEmail = Utilities.generateValidEmail();
        signUpPage.setEmail(validEmail);
        Utilities.hideKeyboard();
        String validPassword = Utilities.generateValidPassword();
        signUpPage.setPassword(validPassword);
        Utilities.hideKeyboard();
        signUpPage.setConfirmPassword(validPassword);
        Utilities.hideKeyboard();
        String validName = Utilities.generateValidName();
        signUpPage.setName(validName);
        Utilities.hideKeyboard();
        signUpPage.scrollTo();
        signUpPage.setCheckBox();
        signUpPage.setDateOfBirth();
        signUpPage.nextStepBtn();
        signUpPage.selectTag();
        signUpPage.setCreateAccount();
        SeshWallPage seshWallPage = new SeshWallPage();
        seshWallPage.waitLoadedPage();




    }
}
