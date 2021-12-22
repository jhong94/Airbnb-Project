import org.openqa.selenium.By;
import org.testng.annotations.Test;
import util.TestBase;
import util.TestUtil;

public class DropDownAutomation extends TestBase {
    TestUtil ut = new TestUtil();

    String baseURL = "https://the-internet.herokuapp.com/dropdown";
    By clickDropDown = By.xpath("//select[@id='dropdown']");
    By clickOptionOne = By.xpath("//select/option[2]");
    By clickOptionTwo = By.xpath("//select/option[3]");

    @Test
    public void testDropDown() throws InterruptedException {
        ut.goTo(baseURL);
        ut.clickElement(clickDropDown);
        ut.clickElement(clickOptionOne);
        Thread.sleep(3000);
        ut.clickElement(clickDropDown);
        ut.clickElement(clickOptionTwo);
        Thread.sleep(3000);
    }
}
