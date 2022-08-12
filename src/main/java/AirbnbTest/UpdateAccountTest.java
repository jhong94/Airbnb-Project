package AirbnbTest;

import AirbnbPage.AirbnbLoginPage;
import AirbnbPage.UpdateAccountPage;
import org.testng.annotations.Test;
import util.TestBase;

import java.io.IOException;

public class UpdateAccountTest extends TestBase {

    AirbnbLoginPage login = new AirbnbLoginPage();
    UpdateAccountPage update = new UpdateAccountPage();

    @Test
    public void updatePersonal() throws InterruptedException, IOException {
        login.goToAirbnb();
        login.validLogin();
        update.updateInvalidInfo();
    }
}
