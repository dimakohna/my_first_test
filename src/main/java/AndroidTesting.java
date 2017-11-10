import config.AndroidConfig;
import config.MyListener;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import scenarios.RegistrationUser;
import scenarios.SomeCase;

@Listeners(MyListener.class)
public class AndroidTesting extends AndroidConfig {

    @org.testng.annotations.BeforeClass
    public void setUp() throws Exception {
        prepareAndroidDevice("Wyd-0.19-stageDebug-1.apk");
        System.out.println("Android is ready for testing!");
    }

    @Test
    public void mainTest(){
        RegistrationUser registrationUser = new RegistrationUser();
        registrationUser.registerValidUser();
    }

    @Test
    public void makePost(){
        SomeCase someCase = new SomeCase();
        someCase.someCase();
    }


    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(15000);
    }
}
