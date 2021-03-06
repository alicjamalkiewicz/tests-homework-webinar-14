import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JustJoinDarkModeNicer extends BaseTest {

    private static WebElement background;
    private static WebElement colorModeButton;

    @Test
    public void lightModeColorTest() {

        driver.get("https://justjoin.it/");

        //WebElement background = driver.findElement(By.xpath("/html/body")); - first solution
        background = driver.findElement(By.xpath("/html/body")); //->correction

        String lightModeColor = background.getCssValue("background-color");
        String lightModeColorRGB = Color.fromString(lightModeColor).asRgb();

        Assert.assertEquals(lightModeColorRGB, "rgb(255, 255, 255)");

        // WebElement colorModeButton = driver.findElement(By.xpath("//span[normalize-space()='Brand Stories']")); first solution
        colorModeButton = driver.findElement(By.xpath("//span[normalize-space()='Brand Stories']")); //->correction
        String lightModeButtonsColor = colorModeButton.getCssValue("color");
        String lightModeButtonsColorHex = Color.fromString(lightModeButtonsColor).asHex();

        Assert.assertEquals(lightModeButtonsColorHex, "#99a1ab");
    }


    @Test(dependsOnMethods = {"lightModeColorTest"})
    public void darkModeColorTest() {

        WebElement colorModeToggle = driver.findElement(By.cssSelector("input[type='checkbox']"));
        colorModeToggle.click();

        String darkModeColor = background.getCssValue("background-color");
        String darkModeColorRGB = Color.fromString(darkModeColor).asRgb();

        Assert.assertEquals(darkModeColorRGB, "rgb(33, 33, 33)");

        String darkModeButtonsColor = colorModeButton.getCssValue("color");
        String darkModeButtonsColorRGBA = Color.fromString(darkModeButtonsColor).asRgba();

        Assert.assertEquals(darkModeButtonsColorRGBA, "rgba(255, 255, 255, 0.8)");

    }
}
