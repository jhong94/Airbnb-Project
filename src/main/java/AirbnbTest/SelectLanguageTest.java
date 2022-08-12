package AirbnbTest;

import AirbnbPage.AirbnbSearchPage;
import AirbnbPage.SelectLanguagePage;
import org.testng.annotations.Test;
import util.TestBase;

public class SelectLanguageTest extends TestBase {

    AirbnbSearchPage search = new AirbnbSearchPage();
    SelectLanguagePage lang = new SelectLanguagePage();

    @Test
    public void newLanguage(){
        search.goToAirbnb();
        lang.switchToFrench();
    }
}
