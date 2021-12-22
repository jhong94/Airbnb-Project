import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutomation {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url = "https://www.google.com/";
        driver.get(url); //This navigates and waits for the entire page to load before proceeding
        //driver.navigate().to(url); This navigates but doesn't wait

        driver.findElement(By.name("q")).sendKeys("MzTech");

        Thread.sleep(2000);

        driver.quit(); //This closes the entire browser
        //driver.close(); This closes the active tab only
    }
}
