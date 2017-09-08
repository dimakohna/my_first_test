package model;


import config.AndroidConfig;
import org.openqa.selenium.By;

public class SignUpPage extends AndroidConfig {
    private By email=By.id("emeil");
    private By password=By.id("password");
    private By confirmPassword=By.id("confirmPassword");
    private By name=By.id("name");
    private By age=By.id("age");
    private By checkBox=By.id("checkBox");
    private By nextStepBtn=By.id("nextStepBtn");
    private By someText=By.id("someText");


    public void clickNextStep(){
        waitAndTap(nextStepBtn);
    }
    public void setEmail(String text){
        waitAndSetText(email, text);
    }
    public void setPassword(String text){
        waitAndSetText(password, text);
    }
    public void setConfirmPassword(String text){
        waitAndSetText(confirmPassword, text);
    }
    public void setName(String text){
        waitAndSetText(name, text);
    }
    public void setCheckBox(){
        waitAndTap(checkBox);
    }
    public void setAge(){
       //TODO: define the method setAge;
    }
    public void waitLoadedPage(){
         waitElement(someText);
    }








}
