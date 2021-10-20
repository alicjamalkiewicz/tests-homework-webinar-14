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
       WebElement grabbedElement = driver.findElement(By.cssSelector(".button.button-orange"));
       WebElement putItHere = driver.findElement(By.id("amt7"));
       WebElement amountInTable = driver.findElement(By.id("t7"));

       moveElement.dragAndDrop(grabbedElement, putItHere).build().perform();

      Assert.assertEquals(amountInTable.getText(), "5000");

   }

}
