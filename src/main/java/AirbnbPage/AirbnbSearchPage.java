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
    By nextButtonLocator = By.xpath("//div[@class='_13tn83am']//button");
    By checkInDate = By.xpath("//table//tbody//tr[3]//td[2]//div[contains(text(), '11')]");
    By checkOutDate = By.xpath("//table//tbody//tr[3]//td[7]//div[contains(text(), '16')]");
    By guestCount = By.xpath("//div[@class='_seuyf']//div[@class='_uh2dzp']");
    By increaseGuest = By.xpath("//button[@data-testid='stepper-adults-increase-button']");
    By searchButton = By.xpath("//div[@class='_w64aej']//button");
    By actualText = By.xpath("//h1[@class='_78tyg5']");

    By checkIn = By.xpath("//div[@class='_j8gg2a']//div//div[contains(text(), 'Check in')]");
    By checkInvalidDate = By.xpath("//table//tbody//tr[4]//td[7]//div[contains(text(), '22')]");
    By checkOutInvalid = By.xpath("//table//tbody//tr[5]//td[7]//div[contains(text(), '29')]");
    By invalidActualText = By.xpath("//h2[@class='_1mafdrow']");


    public void goToAirbnb(){
        ut.goTo(baseURL);
    }

    public void searchForSydney() throws InterruptedException {
        String expectedText = "300+ stays in Sydney";

        ut.enterText(searchBarLocator, "sydney");
        ut.clickElement(dropDownLocator);
        ut.multiClick(nextButtonLocator);
        ut.clickElement(checkInDate);
        ut.clickElement(checkOutDate);
        ut.clickElement(guestCount);
        ut.multiClick(increaseGuest);
        ut.clickElement(searchButton);
        ut.validateText(actualText, expectedText);
    }

    public void searchForFakePlace(){
        String expectedText = "No results";

        ut.enterText(searchBarLocator, "Gotham City, Gotham");
        ut.clickElement(checkIn);
        ut.clickElement(checkInvalidDate);
        ut.clickElement(checkOutInvalid);
        ut.clickElement(guestCount);
        ut.multiClick(increaseGuest);
        ut.clickElement(searchButton);
        ut.validateText(invalidActualText, expectedText);
    }
}
