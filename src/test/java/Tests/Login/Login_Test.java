package Tests.Login;
import Pages.Login.LoginPage;
import Tests.TestBase;
import net.bytebuddy.implementation.bytecode.Throw;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_Test extends TestBase {

    LoginPage loginObject;

    @Test (enabled =  true)
    public void LOGIN () throws Exception
    {
        try
        {
            loginObject = new LoginPage(driver);
            loginObject.TabtoLogin();
            loginObject.UserLogin("01024793295", "66666666664444", "0000", "0000");
            loginObject.EnterOTP("4", "2", "2", "3");
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
   }