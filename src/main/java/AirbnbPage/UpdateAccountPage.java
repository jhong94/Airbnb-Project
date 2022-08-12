package AirbnbPage;

import org.openqa.selenium.By;
import util.TestBase;
import util.TestUtil;

public class UpdateAccountPage extends TestBase {
    TestUtil ut = new TestUtil();

    By dropDownMenu = By.id("field-guide-toggle");
    By accBtn = By.linkText("Account");
    By paymentBtn = By.xpath("//div[contains(text(), 'Payments & payouts')]");
    By addPayment = By.xpath("//span[contains(text(), 'Add payment method')]");

    public void updateInvalidInfo() throws InterruptedException {
        ut.clickElement(dropDownMenu);
        ut.clickElement(accBtn);
        ut.clickElement(paymentBtn);
        ut.clickElement(addPayment);
        Thread.sleep(3000);
    }

}
