package util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class TestUtil extends TestBase {
    public void goTo(String url) {
        driver.navigate().to(url);
    }

    public WebElement waitForElement(By element) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void clickElement(By element) {
        WebElement localElement = waitForElement(element);
        localElement.click();
    }

    public void dropDown(By element, int num) {
        WebElement dropDown = driver.findElement(element);
        Select objSelect = new Select(dropDown);
//        objSelect.selectByVisibleText(text.toLowerCase());
        objSelect.selectByIndex(num);
    }

    public void enterText(By element, String text) {
        WebElement localElement = waitForElement(element);
        localElement.sendKeys(text);
    }

    public void multiClick(By element){
        for (int i = 0; i < 3; i++){
            WebElement localElement = waitForElement(element);
            localElement.click();
        }
    }

    public void screenShot() throws IOException {
        Date currentDate = new Date();
        String screenshotFileName = currentDate.toString().replace(" ", "-").replace(":", "-");
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File(".//screenshot//" + screenshotFileName + ".png"));
    }

    public void validateText(By element, String getText){
        WebElement localElement = waitForElement(element);
        String actualText = localElement.getText();
        Assert.assertEquals(actualText.toLowerCase(), getText.toLowerCase());
    }

    //    public void waitForDropDown(By element){
//        WebDriverWait wait = new WebDriverWait(driver, 5);
//        Select drpList = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
//        drpList.selectByValue("1");
//        drpList.selectByValue("2");
//    }

    public void waitForAlert(By element){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//      String actualText = alert.getText();
        alert.accept();
    }

    public void waitForConfirm(By element){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public void waitForPrompt(By element){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.sendKeys("Hello");
        alert.accept();
    }
}
