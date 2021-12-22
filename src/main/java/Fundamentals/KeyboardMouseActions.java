package Fundamentals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import util.TestBase;
import util.TestUtil;

public class KeyboardMouseActions extends TestBase {
    TestUtil ut = new TestUtil();
    String baseURL = "https://www.amazon.com/";

    @Test()
    public void enterAllCaps(){
        ut.goTo(baseURL);
        WebElement searchInput = driver.findElement(By.id("twotabsearchtextbox"));
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        Actions act = new Actions(driver); //instantiate actions class in order to use actions methods, needs the webdriver object

        act.keyDown(searchInput, Keys.SHIFT); //holds down shift
        act.sendKeys(searchInput, "gifts for the holidays"); //sends in word(s)
        act.keyUp(searchInput, Keys.SHIFT); //releases shift button
        act.click(searchButton);

        Action action = act.build();
        //.build() needs to be used as the build method generates a composite action containing all actions so far which are ready to be
        // performed
        action.perform(); //runs it
    }
    @Test()
    public void dragAndDrop(){
        String url = "https://demoqa.com/droppable/";
        ut.goTo(url);

        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));
        Actions act = new Actions(driver); //Instantiate Actions class and passes driver as parameter

        act.dragAndDrop(drag, drop); //Uses draggable and droppable id names to drag and drop the element
        Action action = act.build(); //generates a composite action containing all actions, and they are ready to be performed
        action.perform(); //runs

        String actualText = driver.findElement(By.cssSelector("#droppable p")).getText();
        //validates that it was dragged and dropped after the item was dropped
        System.out.println(actualText);
    }
}
