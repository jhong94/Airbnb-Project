package AirbnbTest;

import AirbnbPage.AirbnbSearchPage;
import AirbnbPage.FlexibleSearchPage;
import org.testng.annotations.Test;
import util.TestBase;

public class FlexibleSearchTest extends TestBase {

    AirbnbSearchPage page = new AirbnbSearchPage();
    FlexibleSearchPage flex = new FlexibleSearchPage();

    @Test
    public void validFlexibleSearch() throws InterruptedException {
        page.goToAirbnb();
        flex.flexSearch();
    }

    @Test
    public void invalidFlexibleSearch(){
        page.goToAirbnb();
        flex.flexSearchFake();
    }
}
