import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ZadanieDomowe5 extends BaseTest{

    @Test
    public void buyProducts(){

        driver.get("http://demo.guru99.com/payment-gateway/index.php");

        WebElement productsList = driver.findElement(By.name("quantity"));
        Select selectQuantity = new Select(productsList);
        selectQuantity.selectByValue("3");

        WebElement buyNowButton = driver.findElement(By.cssSelector(".button.special"));
        buyNowButton.click();

        WebElement toBePaid = driver.findElement(By.name("prices"));
        Assert.assertEquals(toBePaid.getText(), "60");

    }
}
