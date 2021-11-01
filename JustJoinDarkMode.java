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

//        WebElement lightModeAllOffersField = driver.findElement(By.xpath("//a[@class='css-116ia3n']//div[@class='css-9ygpzv']"));
//        String lightModeAllOffersFieldColor = lightModeAllOffersField.getCssValue("background-color");
//        String lightModeAllOffersFieldColorRGB = Color.fromString(lightModeAllOffersFieldColor).asRgb();
//
//        Assert.assertEquals(lightModeAllOffersFieldColorRGB, "rgb(33, 33, 33)");



        WebElement colorModeToggle = driver.findElement(By.cssSelector("input[type='checkbox']"));
        colorModeToggle.click();

        String darkModeColor = background.getCssValue("background-color");
        String darkModeColorRGB = Color.fromString(darkModeColor).asRgb();

        Assert.assertEquals(darkModeColorRGB, "rgb(33, 33, 33)");

        WebElement darkModeButton = driver.findElement(By.xpath("//span[normalize-space()='Brand Stories']"));
        String darkModeButtonsColor = darkModeButton.getCssValue("color");
        String darkModeButtonsColorRGBA = Color.fromString(darkModeButtonsColor).asRgba();

        Assert.assertEquals(darkModeButtonsColorRGBA, "rgba(255, 255, 255, 0.8)");
//
//        WebElement darkModeAllOffersField = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div/div[1]/div[1]/a[2]/div"));
//        String darkModeAllOffersFieldColor = darkModeAllOffersField.getCssValue("color");
//        String darkModeAllOffersFieldColorRGB = Color.fromString(darkModeAllOffersFieldColor).asRgb();
//
//        Assert.assertEquals(darkModeAllOffersFieldColorRGB, "rgb(33, 33, 33)");
    }
}
