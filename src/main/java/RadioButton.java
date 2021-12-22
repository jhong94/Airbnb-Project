import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import util.TestBase;
import util.TestUtil;

public class RadioButton extends TestBase {
    TestUtil ut = new TestUtil();
    String baseURL = "http://demo.guru99.com/test/radio.html";

    @Test()
    public void radioButtonTest() throws InterruptedException {
        ut.goTo(baseURL);
        for (int i = 1; i <= 3; i++){
            WebElement radioButton = driver.findElement(By.id("vfb-7-" + i));
            radioButton.click();
            Thread.sleep(1000);
        }
        for (int i = 0; 1 <= 2; i++){
            WebElement checkBox = driver.findElement(By.id("vfb-6-" + i));
            checkBox.click();
            Thread.sleep(1000);
        }
    }

}
