package Fundamentals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import util.TestBase;
import util.TestUtil;

public class Navigation extends TestBase {
    TestUtil ut = new TestUtil();
    By clickAlert = By.id("m-documentationwebdriverbrowseralerts");
    @Test()
    public void navigateTest() throws InterruptedException {
        driver.navigate().to("https://www.selenium.dev/documentation/webdriver/browser/navigation/");
        Thread.sleep(1000);
        ut.clickElement(clickAlert);
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
    }
}
