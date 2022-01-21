package AirbnbPage;

import org.openqa.selenium.By;
import util.TestBase;
import util.TestUtil;

import java.io.IOException;

public class AirbnbLoginPage extends TestBase {
    TestUtil ut = new TestUtil();
    String baseURL = "https://www.airbnb.com";

//    By accountButton = By.xpath("//button[@id='field-guide-toggle']");
    By contWithEmail = By.xpath("//main//div/div/div/div//div//button[@data-testid='social-auth-button-email']");
    By enterEmail = By.id("email-login-email");
    By pressCont = By.className("_k8bxoxz");
    By showPW = By.xpath("//button[@class='_wn3y1ru']");
    By enterPW = By.xpath("//input[@data-testid='email-signup-password']");
    By actualText = By.xpath("//div[@data-section-id='EXPLORE_HEADER_LOGO']//a");


    public void goToAirbnb(){
        ut.goTo(baseURL + "/login");
    }

    public void validLogin() throws InterruptedException, IOException {
        String expectedText = "airbnb homepage";
        ut.waitForElement(contWithEmail);
        ut.clickElement(contWithEmail);
        ut.enterText(enterEmail, "archaic.undated-05@icloud.com");
        ut.clickElement(pressCont);
        ut.clickElement(showPW);
        ut.enterText(enterPW, "Whatever99");
        ut.screenShot();
        ut.clickElement(pressCont);
        ut.validateText(actualText, expectedText);
        Thread.sleep(2000);
    }

    public void invalidLogin() throws IOException {
        ut.waitForElement(contWithEmail);
        ut.clickElement(contWithEmail);
        ut.enterText(enterEmail, "johndoe123@gmail.com");
        ut.clickElement(pressCont);
        ut.clickElement(showPW);
        ut.enterText(enterPW, "whocares123");
        ut.clickElement(pressCont);
        ut.screenShot();
    }
}
