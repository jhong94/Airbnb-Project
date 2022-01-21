package Homework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import util.TestBase;
import util.TestUtil;

import java.time.Instant;

public class AlertAutomation extends TestBase {
    TestUtil ut = new TestUtil();

    String urlBase = "https://the-internet.herokuapp.com/javascript_alerts";
    By clickAlert = By.xpath("//ul/li[1]/button");
    By clickConfirm = By.xpath("//ul/li[2]/button");
    By clickPrompt = By.xpath("//ul/li[3]/button");
    By actualText = By.xpath("//div/h3");
    String getText = "javascript alerts";

    @Test(priority = 1)
    public void testClickAlert() throws InterruptedException {
       ut.goTo(urlBase);
       ut.clickElement(clickAlert);
       ut.waitForAlert(clickAlert);
       ut.validateText(actualText, getText);
       Thread.sleep(2000);
   }
   @Test(priority = 2)
    public void testClickConfirm() throws InterruptedException {
       ut.goTo(urlBase);
       ut.clickElement(clickConfirm);
       ut.waitForConfirm(clickConfirm);
       ut.validateText(actualText, getText);
       Thread.sleep(3000);
   }
   @Test(priority = 3)
    public void testClickPrompt() throws InterruptedException {
       ut.goTo(urlBase);
       ut.clickElement(clickPrompt);
       ut.waitForPrompt(clickPrompt);
       ut.validateText(actualText, getText);
       Thread.sleep(3000);
   }
}
