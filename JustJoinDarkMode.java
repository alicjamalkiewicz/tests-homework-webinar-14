import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JustJoinDarkMode extends BaseTest{

    @Test
    public void darkModeColorTest(){

        driver.get("https://justjoin.it/");

        WebElement background = driver.findElement(By.xpath("/html/body"));

        String lightModeColor = background.getCssValue("background-color");
        String lightModeColorRGB = Color.fromString(lightModeColor).asRgb();

        Assert.assertEquals(lightModeColorRGB, "rgb(255, 255, 255)");

        WebElement colorModeToggle = driver.findElement(By.cssSelector("input[type='checkbox']"));
        colorModeToggle.click();

        String darkModeColor = background.getCssValue("background-color");
        String darkModeColorRGB = Color.fromString(darkModeColor).asRgb();

        Assert.assertEquals(darkModeColorRGB, "rgb(33, 33, 33)");
    }
}
