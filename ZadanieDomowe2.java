import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ZadanieDomowe2 extends BaseTest{

    @Test
    public void elementOnPage(){

        driver.get("https://www.bbc.com/");

        List<WebElement> howManyLinks = driver.findElements(By.tagName("link"));
        System.out.println(howManyLinks.size());

        List<WebElement> howManyImages = driver.findElements(By.tagName("img"));
        System.out.println(howManyImages.size());


    }
}
