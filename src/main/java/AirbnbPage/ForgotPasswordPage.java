package AirbnbPage;

import org.openqa.selenium.By;
import util.TestBase;
import util.TestUtil;

public class ForgotPasswordPage extends TestBase {
    TestUtil ut = new TestUtil();

    By contWithEmail = By.xpath("//main//div/div/div/div//div//button[@data-testid='social-auth-button-email']");
    By enterEmail = By.id("email-login-email");
    By pressCont = By.className("_k8bxoxz");
    By forgotButton = By.xpath("//a[@class='_1mvt6xpm']");
    By enterEmailForPw = By.xpath("//form[@data-testid='auth-form']//div//input");
    By resetLinkButton = By.xpath("//button[@class='_1932igt4']");
    By actualText = By.xpath("//span[@class='alert-message']");
    By invalidActual = By.xpath("//span[@class='alert-message']");

    public void enterEmail() {
        ut.clickElement(contWithEmail);
        ut.enterText(enterEmail, "archaic.undated-05@icloud.com");
        ut.clickElement(pressCont);
    }
    public void resetPassword(){
        String expectedText = "a link to reset your password has been sent to archaic.undated-05@icloud.com.";
        ut.clickElement(forgotButton);
        ut.waitForElement(enterEmailForPw);
        ut.enterText(enterEmailForPw, "archaic.undated-05@icloud.com");
        ut.clickElement(resetLinkButton);
        ut.validateText(actualText, expectedText);
    }
    public void invalidResetPassword(){
        String expectedText = "no account exists for johndoe123@11.com. Maybe you signed up using a different/incorrect e-mail address.";
        ut.clickElement(forgotButton);
        ut.waitForElement(enterEmailForPw);
        ut.enterText(enterEmailForPw, "johndoe123@gmail.com");
        ut.clickElement(resetLinkButton);
        ut.validateText(invalidActual, expectedText);
    }
}
