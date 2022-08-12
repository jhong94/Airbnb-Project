package AirbnbPage;

import org.openqa.selenium.By;
import util.TestBase;
import util.TestUtil;

public class SelectLanguagePage extends TestBase {
    TestUtil ut = new TestUtil();

    By changeLanguage = By.xpath("//button[@class='_q730rga']");
    By pickFrench = By.xpath("//div[contains(text(), 'France')]");
    By actualText = By.xpath("//div[@class='_36rlri']");

    public void switchToFrench(){
        String expectedText = "Expériences en ligne";

        ut.clickElement(changeLanguage);
        ut.clickElement(pickFrench);
        ut.validateText(actualText, expectedText);
    }
}
