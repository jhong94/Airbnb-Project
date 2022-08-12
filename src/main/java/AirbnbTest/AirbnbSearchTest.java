package AirbnbTest;

import AirbnbPage.AirbnbSearchPage;
import org.testng.annotations.Test;
import util.TestBase;

public class AirbnbSearchTest extends TestBase {

    AirbnbSearchPage search = new AirbnbSearchPage();

    @Test
    public void validSearchLocation() throws InterruptedException {
        search.goToAirbnb();
        search.searchForSydney();
        Thread.sleep(3000);
    }

    @Test
    public void invalidSearchLocation(){
        search.goToAirbnb();
        search.searchForFakePlace();
    }
}
