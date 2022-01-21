package AirbnbTest;

import AirbnbPage.AirbnbLoginPage;
import AirbnbPage.ForgotPasswordPage;
import org.testng.annotations.Test;
import util.TestBase;

public class ForgotPassTest extends TestBase {

    @Test
    public void validPasswordReset(){
        ForgotPasswordPage page = new ForgotPasswordPage();
        AirbnbLoginPage login = new AirbnbLoginPage();

        login.goToAirbnb();
        page.enterEmail();
        page.resetPassword();
    }

    @Test
    public void invalidPasswordReset(){
        ForgotPasswordPage page = new ForgotPasswordPage();
        AirbnbLoginPage login = new AirbnbLoginPage();

        login.goToAirbnb();
        page.enterEmail();
        page.invalidResetPassword();
    }
}
