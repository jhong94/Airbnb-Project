package AirbnbPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.TestBase;
import util.TestUtil;

import java.util.List;

public class AirbnbSearchPage extends TestBase {
    TestUtil ut = new TestUtil();
    String baseURL = "https://www.airbnb.com";

    By searchBarLocator = By.className("_1xq16jy");
    By dropDownLocator = By.id("bigsearch-query-location-suggestion-0");
    By searchButton = By.xpath("//div[@class='_w64aej']//button");
    By priceRange = By.xpath("//div[@data-testid='menuItemButton-price_range']");
    By minPrice = By.id("price_filter_min");
    By maxPrice = By.id("price_filter_max");
    By savePrice = By.xpath("//button[@class='_yy7zf84']");

    By checkInLocator = By.className("_wtz1co");
    By nextButtonLocator = By.xpath("//div[@class='_13tn83am']//button");
    By verifyMonth = By.xpath("//h2[@class='_116xafi']");


    public void goToAirbnb(){
        ut.goTo(baseURL);
    }

    public void searchForFlorida() throws InterruptedException {
        ut.enterText(searchBarLocator, "florida");
        ut.clickElement(searchButton);
        ut.clickElement(priceRange);




        Thread.sleep(4000);
    }
}
