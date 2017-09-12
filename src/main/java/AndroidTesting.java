import config.AndroidConfig;
import org.testng.annotations.Test;

public class AndroidTesting extends AndroidConfig {

    @org.testng.annotations.BeforeClass
    public void setUp() throws Exception {
        prepareAndroidDevice("Wyd-0.18.61-stageDebug.apk");
        System.out.println("Android is ready for testing!");
    }

    @Test
    public void mainTest(){
        
    }
}
