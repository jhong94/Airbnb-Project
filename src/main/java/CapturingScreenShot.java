import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import util.TestBase;
import util.TestUtil;

import java.io.File;
import java.io.IOException;

public class CapturingScreenShot extends TestBase {
    TestUtil ut = new TestUtil();
    String baseURL = "https://www.google.com/";
    @Test()
    public void testScreenShot() throws IOException {
        ut.goTo(baseURL);
        ut.screenShot();
    }
}
