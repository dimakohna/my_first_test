package scenarios;


import config.AndroidConfig;

public class SomeCase {
    public void someCase(){
        RegistrationUser registrationUser = new RegistrationUser();
        registrationUser.registerValidUser();
        AndroidConfig.swipeLeft();

    }
}
