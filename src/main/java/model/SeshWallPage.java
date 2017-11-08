package model;

import config.AndroidConfig;
import org.openqa.selenium.By;


public class SeshWallPage extends AndroidConfig {
    final private By namePage = By.id(APP_PACKAGE_NAME + "main_screen_events_text_view_title");
    public void waitLoadedPage(){
        waitElement(namePage);
        System.out.println("Account was Create");}
}
