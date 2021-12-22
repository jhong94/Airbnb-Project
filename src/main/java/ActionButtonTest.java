import org.openqa.selenium.By;
import org.testng.annotations.Test;
import util.TestBase;
import util.TestUtil;

public class ActionButtonTest extends TestBase {
    TestUtil ut = new TestUtil();
    String baseURL = "http://demo.guru99.com/test/radio.html";
    String actionButton = "//input[@type='radio']";
    By actionOptionOne = By.xpath(actionButton + "[1]");
    By actionOptionTwo = By.xpath(actionButton + "[2]");
    By actionOptionThree = By.xpath(actionButton + "[3]");

    String checkBox = "//input[@type='checkbox']";
    By checkBoxOne = By.xpath(checkBox + "[1]");
    By checkBoxTwo = By.xpath(checkBox + "[2]");
    By checkBoxThree = By.xpath(checkBox + "[3]");

    @Test(priority = 1)
    public void actionButton() throws InterruptedException {
        ut.goTo(baseURL);
        for(int i = 0; i <=3; i++);
        ut.clickElement(actionOptionOne);
        ut.clickElement(actionOptionTwo);
        ut.clickElement(actionOptionThree);
        Thread.sleep(3000);
    }
    @Test(priority = 2)
    public void checkBox() throws InterruptedException {
        ut.goTo(baseURL);
        for(int i = 0; i <=3; i++);
        ut.clickElement(checkBoxOne);
        ut.clickElement(checkBoxTwo);
        ut.clickElement(checkBoxThree);
        Thread.sleep(3000);
    }
}
