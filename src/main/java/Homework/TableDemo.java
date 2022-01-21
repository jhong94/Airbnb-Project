package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import util.TestBase;
import util.TestUtil;

import java.io.IOException;
import java.util.List;

public class TableDemo extends TestBase {
    TestUtil ut = new TestUtil();
    String baseURL = "http://demo.guru99.com/test/web-table-element.php";

    @Test()
    public void getTable() throws IOException {
      ut.goTo(baseURL);
      ut.screenShot();

      List<WebElement> rowData = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));

      List<WebElement> colData = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));

      String firstPart = "//table[@class='dataTable']/tbody/tr[";
      String secondPart = "]/td[";
      String thirdPart = "]";

      System.out.println("The number of rows are: " + rowData.size());
      System.out.println("The number of columns are: " + colData.size());

      for(int i = 1; i <= rowData.size(); i++){
          for(int j = 1; j <= colData.size(); j++){
              String finalPart = firstPart+i+secondPart+j+thirdPart;
              String text = driver.findElement(By.xpath(finalPart)).getText();
              System.out.print(text+ " | ");
          }
          System.out.println();
      }
    }
}
