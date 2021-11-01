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

        WebElement lightModeButton = driver.findElement(By.xpath("//span[normalize-space()='Brand Stories']"));
        String lightModeButtonsColor = lightModeButton.getCssValue("color");
        String lightModeButtonsColorHex = Color.fromString(lightModeButtonsColor).asHex();

        Assert.assertEquals(lightModeButtonsColorHex, "#99a1ab");

        WebElement lightModeLogo = driver.findElement(By.id("logo-justjoin.it"));
        String lightModeLogoFieldColor = lightModeLogo.getCssValue("fill");
        String lightModeLogoFieldColorHex = Color.fromString(lightModeLogoFieldColor).asHex();

        Assert.assertEquals(lightModeLogoFieldColorHex, "#37474f");



        WebElement colorModeToggle = driver.findElement(By.cssSelector("input[type='checkbox']"));
        colorModeToggle.click();

        String darkModeColor = background.getCssValue("background-color");
        String darkModeColorRGB = Color.fromString(darkModeColor).asRgb();

        Assert.assertEquals(darkModeColorRGB, "rgb(33, 33, 33)");

        WebElement darkModeButton = driver.findElement(By.xpath("//span[normalize-space()='Brand Stories']"));
        String darkModeButtonsColor = darkModeButton.getCssValue("color");
        String darkModeButtonsColorRGBA = Color.fromString(darkModeButtonsColor).asRgba();

        Assert.assertEquals(darkModeButtonsColorRGBA, "rgba(255, 255, 255, 0.8)");

        WebElement darkModeLogo = driver.findElement(By.id("logo-justjoin.it"));
        String darkModeLogoFieldColor = darkModeLogo.getCssValue("fill");
        String darkModeLogoFieldColorRGBA = Color.fromString(darkModeLogoFieldColor).asRgba();

        Assert.assertEquals(darkModeLogoFieldColorRGBA, "rgba(255, 255, 255, 0.8)");
    }
}
