package AirbnbTest;

import AirbnbPage.AirbnbSearchPage;
import org.testng.annotations.Test;
import util.TestBase;

public class AirbnbSearchTest extends TestBase {

    @Test
    public void validSearchLocation() throws InterruptedException {
        AirbnbSearchPage search = new AirbnbSearchPage();
        search.goToAirbnb();
        search.searchForFlorida();
        Thread.sleep(3000);
    }
}
