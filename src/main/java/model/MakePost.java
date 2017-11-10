package model;


import config.AndroidConfig;
import org.openqa.selenium.By;
import scenarios.RegistrationUser;

public class MakePost extends AndroidConfig{
    final private By approveMakePost = By.id(APP_PACKAGE_NAME + "make_post_publish_btn");
    final private By textField = By.id(APP_PACKAGE_NAME + "start_text");
    final private By addPhoto = By.id(APP_PACKAGE_NAME + "photo_view");
    final private By addPhotoCamera = By.id(APP_PACKAGE_NAME + "select_dialog_from_camera");
    final private By addPhotoGalary = By.id(APP_PACKAGE_NAME + "select_dialog_from_gallery");

    public void putApproveMakePost (){waitAndTap(approveMakePost);}
    public void putAddPhoto(){waitAndTap(addPhoto);}
    public void putTakePhotoCamera (){waitAndTap(addPhotoCamera);}
    public void putTakePhotoGalary (){waitAndTap(addPhotoGalary);}
    public void setTextField (){waitAndSetText(textField, "My POST");}


}
