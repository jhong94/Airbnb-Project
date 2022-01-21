package AirbnbPage;

import org.openqa.selenium.By;
import util.TestBase;
import util.TestUtil;

public class FlexibleSearchPage extends TestBase {
    TestUtil ut = new TestUtil();

    By searchBarLocator = By.className("_1xq16jy");
    By dropDownLocator = By.id("bigsearch-query-location-suggestion-1");
    By flexibleLocator = By.id("tab--tabs--1");
    By weekBtn = By.id("flexible_trip_lengths-one_week");
    By selectJan = By.id("flexible_trip_dates-january");
    By selectFeb = By.id("flexible_trip_dates-february");
    By selectJune = By.id("flexible_trip_dates-june");
    By addGuests = By.xpath("//div[@class='_seuyf']//div[@class='_uh2dzp']");
    By increaseGuests = By.xpath("//button[@data-testid='stepper-adults-increase-button']");
    By searchButton = By.xpath("//div[@class='_w64aej']//button");
    By actualText = By.xpath("//h1[@class='_78tyg5']");
    By actualTextFake = By.xpath("//div[contains(text(), 'Travel the world with Airbnb')]");

    public void flexSearch() throws InterruptedException {
        String expectedText = "300+ stays in Paris";
        ut.enterText(searchBarLocator, "Paris, France");
        ut.clickElement(dropDownLocator);
        ut.clickElement(flexibleLocator);
        ut.clickElement(weekBtn);
        ut.clickElement(selectJan);
        ut.clickElement(selectFeb);
        ut.clickElement(selectJune);
        ut.clickElement(addGuests);
        ut.multiClick(increaseGuests);
        ut.clickElement(searchButton);
        ut.validateText(actualText, expectedText);
        Thread.sleep(3000);
    }

    public void flexSearchFake(){
        String expectedText = "Travel the world with Airbnb";
        ut.enterText(searchBarLocator, "Gotham City, Gotham");
        ut.clickElement(searchButton);
        ut.validateText(actualTextFake, expectedText);
    }

}
