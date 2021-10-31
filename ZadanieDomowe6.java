import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ZadanieDomowe6 extends BaseTest{

   @Test
    public void dragAndDrop(){
       driver.get("http://demo.guru99.com/test/drag_drop.html");

       Actions moveElement = new Actions(driver);
       WebElement grabbedElement = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
       WebElement putItHere = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
       WebElement amountInTable = driver.findElement(By.xpath("//div[@id='t7']"));

       moveElement.dragAndDrop(grabbedElement, putItHere).build().perform();

      Assert.assertEquals(amountInTable.getText(), "5000");

   }

}
