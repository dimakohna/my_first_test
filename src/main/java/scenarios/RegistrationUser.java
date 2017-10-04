package scenarios;


import model.SignInPage;
import model.SignUpPage;
import utilities.Utilities;

public class RegistrationUser {
    public void registerValidUser(){
        SignInPage signInPage = new SignInPage();
        signInPage.openSignUp();
        SignUpPage signUpPage = new SignUpPage();
        String validEmail = Utilities.generateValidEmail();
        signUpPage.setEmail(validEmail);


    }
}
