package scenarios;


import config.AndroidConfig;
import model.MakePost;
import model.SeshWallPage;
import utilities.Utilities;

public class SomeCase {
    public void someCase() {
        RegistrationUser registrationUser = new RegistrationUser();
        registrationUser.registerValidUser();
        //AndroidConfig.swipeLeft();
        SeshWallPage seshWallPage = new SeshWallPage();
        seshWallPage.clickAddButton();
        seshWallPage.putMakePostBtn();
        MakePost makePost = new MakePost();
        makePost.setTextField();
        Utilities.hideKeyboard();
        makePost.putApproveMakePost();
        seshWallPage.waitLoadedPage();


    }
}
