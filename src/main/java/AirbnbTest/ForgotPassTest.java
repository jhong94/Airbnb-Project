package AirbnbTest;

import AirbnbPage.AirbnbLoginPage;
import AirbnbPage.ForgotPasswordPage;
import org.testng.annotations.Test;
import util.TestBase;

public class ForgotPassTest extends TestBase {

    ForgotPasswordPage page = new ForgotPasswordPage();
    AirbnbLoginPage login = new AirbnbLoginPage();

    @Test
    public void validPasswordReset(){

        login.goToAirbnb();
        page.enterEmail();
        page.resetPassword();
    }

    @Test
    public void invalidPasswordReset(){

        login.goToAirbnb();
        page.enterEmail();
        page.invalidResetPassword();
    }
}
