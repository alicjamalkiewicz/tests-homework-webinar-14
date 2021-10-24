import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ZadanieDomowe8 extends BaseTest{

    @Test
    public void jobSearch(){
        driver.get("https://www.pracuj.pl/");

        WebElement acceptCokies = driver.findElement(By.xpath("//*[@id=\"gp-cookie-agreements\"]/div/div/div[1]/div[3]/button"));
        acceptCokies.click();
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("recommendations--15VK5")));

        WebElement searchJob = driver.findElement(By.xpath("//*[@id=\"kw-1634898959708\"]"));
        searchJob.sendKeys("tester");

//        WebElement searchCity = driver.findElement(By.xpath("//*[@id=\"wp-1634898856687\"]"));
//        searchCity.sendKeys("Warszawa");

//        WebElement submitButton = driver.findElement(By.className("slider--1Afpe"));
//        submitButton.click();

    }
}
