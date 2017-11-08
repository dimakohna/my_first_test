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

    @Test(invocationCount = 1000)
    public void generationPassword(){
        String validPassword = Utilities.generateValidPassword();
        Assert.assertTrue(validPassword.length()>=8 && validPassword.length()<=30);
        Assert.assertNotNull(validPassword);
        Assert.assertFalse(validPassword.contains("!"));
        Assert.assertFalse(validPassword.contains("&"));
        Assert.assertFalse(validPassword.contains("*"));
        Assert.assertFalse(validPassword.contains("%"));
        Assert.assertFalse(validPassword.contains("р"));
    }

    @Test(invocationCount = 1000)
    public void generationName(){
        String validName = Utilities.generateValidName();
        Assert.assertTrue(validName.length()>=2 && validName.length()<=40);
        Assert.assertNotNull(validName);
        Assert.assertFalse(validName.contains("!"));
        Assert.assertFalse(validName.contains("&"));
        Assert.assertFalse(validName.contains("*"));
        Assert.assertFalse(validName.contains("%"));
        Assert.assertFalse(validName.contains("р"));
        Assert.assertFalse(validName.contains("1"));
    }
}
