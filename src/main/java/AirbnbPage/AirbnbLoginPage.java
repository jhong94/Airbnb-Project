package AirbnbPage;

import org.openqa.selenium.By;
import util.TestBase;
import util.TestUtil;

import java.io.IOException;

public class AirbnbLoginPage extends TestBase {
    TestUtil ut = new TestUtil();
    String baseURL = "https://www.airbnb.com";

    By contWithEmail = By.xpath("//main//div/div/div/div//div//button[@data-testid='social-auth-button-email']");
    By enterEmail = By.id("email-login-email");
    By pressCont = By.className("_k8bxoxz");
    By showPW = By.xpath("//button[@class='_wn3y1ru']");
    By enterPW = By.xpath("//input[@data-testid='email-signup-password']");
    By actualText = By.xpath("//div[@class='_1gwzhbum']");
    By actualTextFake = By.xpath("//h1[@class='_14i3z6h']");


    public void goToAirbnb(){
        ut.goTo(baseURL + "/login");
    }

    public void validLogin() throws InterruptedException, IOException {
        String expectedText = "Online Experiences";
        ut.waitForElement(contWithEmail);
        ut.clickElement(contWithEmail);
        ut.enterText(enterEmail, "archaic.undated-05@icloud.com");
        ut.clickElement(pressCont);
        ut.clickElement(showPW);
        ut.enterText(enterPW, "Whatever99");
        Thread.sleep(2000);
        ut.screenShot();
        ut.clickElement(pressCont);
        Thread.sleep(2000);
        ut.validateText(actualText, expectedText);
    }

    public void invalidLogin() throws IOException, InterruptedException {
        String expectedText = "Let's try that again";
        ut.waitForElement(contWithEmail);
        ut.clickElement(contWithEmail);
        ut.enterText(enterEmail, "johndoe123@gmail.com");
        ut.clickElement(pressCont);
        ut.clickElement(showPW);
        ut.enterText(enterPW, "whocares123");
        ut.clickElement(pressCont);
        Thread.sleep(2000);
        ut.validateText(actualTextFake, expectedText);
        ut.screenShot();
    }
}
