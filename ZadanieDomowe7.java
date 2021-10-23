import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ZadanieDomowe7 extends BaseTest{

    @Test
    public void googleJavaSearch(){
        driver.get("https://www.google.com/");

        WebElement cookiesAllow = driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]")); //kiedy wpisuje xpath buttona 'customize' to udaje sie kliknąć ten burron, ale jak wpisuje xpath button 'agree' to mam blad 'element not interactable'
        cookiesAllow.click();

        WebElement searchFiled = driver.findElement(By.className("RNNXgb"));
        searchFiled.sendKeys("JAVA");

        WebElement searchButton = driver.findElement(By.className("gNO89b"));
        searchButton.click();
    }
}
