import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ZadanieDomowe3 extends BaseTest{

    @Test
    public void isUserLogged(){

        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");

        WebElement userPassword = driver.findElement(By.id("txtPassword"));
        userPassword.sendKeys("admin123");

        WebElement loginButton = driver.findElement(By.cssSelector(".button")); //pewnie lepiej byłoby By.id("btnLogin) ale chciałam spróbować innego selektora
        loginButton.click();

        WebElement loggedUser = driver.findElement(By.id("welcome"));
        Assert.assertEquals(loggedUser.getText(), "Welcome Aniket");


    }
}
