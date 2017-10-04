import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Utilities;

public class TestingUtilities {

    @Test(invocationCount = 1000)
    public void generationEmail(){
        String validEmail = Utilities.generateValidEmail();
        Assert.assertTrue(validEmail.length()>=3 && validEmail.length()<=150);
        Assert.assertNotNull(validEmail);
        Assert.assertTrue(validEmail.contains("@"));
        Assert.assertTrue(validEmail.contains("."));


    }
}
