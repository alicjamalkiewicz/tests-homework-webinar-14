import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HansaSelect extends BaseTest {

    @Test
    public void checkingSize() {
        driver.get("https://www.hansawear.com/kategoria/nagore/bluza-hansa-wear-fladra");
        WebElement sizeList = driver.findElement(By.id("property1"));

        Select select = new Select(sizeList);
        select.selectByValue("XS");

        Assert.assertEquals(select.getFirstSelectedOption().getText(), "XS");

    }
}
