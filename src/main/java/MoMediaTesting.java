import org.openqa.selenium.By;
import org.testng.annotations.Test;
import util.TestBase;
import util.TestUtil;

public class MoMediaTesting extends TestBase {
    TestUtil ut = new TestUtil();
    String baseURL = "https://momedia.netlify.app";
    //Locators
    //By locatorName = By.locatorType("locator");
    By searchInput = By.xpath("//input[@id='search-input']");
    By firstMovieLocator = By.xpath("//a[@href='/movies/19995']");
    By movieTitleLocator = By.xpath("//header/section//h1");
    By secondMovieLocator = By.xpath("//a[@href=\"/movies/497698\"]");
    By actualSecondMovieName = By.xpath("//section/div/h1");
    By firstCastMemberLocator = By.xpath("(//button[@class=\"ButtonLink open-model-link\"])[2]");
    By inputNameLocator = By.xpath("//input[@id='validationCustom01']");
    By inputEmailLocator = By.xpath("//input[@id='validationCustom02']");
    By inputMessageLocator = By.xpath("//textarea[@id='validationCustom03']");
    By actualText = By.xpath("//h1[@class='actor-name']");


    @Test(priority = 1)
    public void searchAvatar(){
        ut.goTo(baseURL + "/movies");
        String movieName = "avatar"; //expected movie
        ut.enterText(searchInput, movieName);
        ut.clickElement(firstMovieLocator);
        ut.validateText(movieTitleLocator, movieName);

        //Assert is to validate test. .assertEquals provides two parameters: actual and expected.
        //.toLowerCase changes the name to lower case and validates it regardless of case sensitivity
    }

    @Test(priority = 2)
    public void searchFakeMovie(){
        ut.goTo(baseURL + "/movies");
        String fakeMovieName = "Premier";
        ut.enterText(searchInput, fakeMovieName);
    }

    @Test(priority = 3)
    public void castDetails(){
        ut.goTo(baseURL + "/movies");
        String movieNameTwo = "Black Widow";
        String expectedText = "Florence Pugh";
        ut.enterText(searchInput, movieNameTwo);
        ut.clickElement(secondMovieLocator);
        ut.clickElement(firstCastMemberLocator);
        ut.validateText(actualSecondMovieName, movieNameTwo);
        ut.validateText(actualText, expectedText);
    }

    @Test(priority = 4)
    public void contactUs(){
        ut.goTo(baseURL + "/contact");
        ut.enterText(inputNameLocator, "John Doe");
        ut.enterText(inputEmailLocator, "johndoe@gmail.com");
        ut.enterText(inputMessageLocator, "This is a cool website.");
    }
}
