package model;

import config.AndroidConfig;
import org.openqa.selenium.By;


public class SeshWallPage extends AndroidConfig {
    final private By namePage = By.id(APP_PACKAGE_NAME + "main_screen_events_text_view_title");
    final private By addContent = By.id(APP_PACKAGE_NAME + "add_btn_photo_feed");
    final private By takePhotoCamera = By.id(APP_PACKAGE_NAME + "select_dialog_from_camera"); //choose in list
    final private By takePhotoCamera2 = By.id(APP_PACKAGE_NAME + "preview_surface");  //take photo on camera screen
    final private By approvePhoto = By.id(APP_PACKAGE_NAME + "review_approve");  //approve took photo



    public void waitLoadedPage(){
        waitElement(namePage);
        System.out.println("ACCOUNT WAS CREATE");}
    public void clickAddButton(){waitAndTap(addContent);}
    public void clickTakePhotoCamera(){waitAndTap(takePhotoCamera);}
    public void clickTakePhotoCamera2(){waitAndTap(takePhotoCamera2);}
    public void setApprovePhoto(){waitAndTap(approvePhoto);}


}
