package AirbnbTest;

import AirbnbPage.AirbnbLoginPage;
import org.testng.annotations.Test;
import util.TestBase;

import java.io.IOException;

public class AirbnbLoginTest extends TestBase {

    AirbnbLoginPage login = new AirbnbLoginPage();

    @Test
    public void validLoginTest() throws InterruptedException, IOException {
        login.goToAirbnb();
        login.validLogin();
    }

    @Test
    public void invalidLoginTest() throws IOException, InterruptedException {
        login.goToAirbnb();
        login.invalidLogin();
    }
}
