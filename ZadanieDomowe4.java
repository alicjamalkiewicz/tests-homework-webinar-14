import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ZadanieDomowe4 extends BaseTest {

    @Test
    public void incorrectCredentials() {

        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("WrongUsername");

        WebElement userPassword = driver.findElement(By.id("txtPassword"));
        userPassword.sendKeys("WrongPassword");

        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();

        WebElement incorrectCredentialsMessage = driver.findElement(By.id("spanMessage"));
        Assert.assertEquals(incorrectCredentialsMessage.getText(), "Invalid credentials");

    }

}