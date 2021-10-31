import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ZadanieDomowe8 extends BaseTest{

    @Test
    public void jobSearch(){
        driver.get("https://www.pracuj.pl/");

        WebElement acceptCokies = driver.findElement(By.xpath("//*[@id=\"gp-cookie-agreements\"]/div/div/div[1]/div[3]/button"));
        acceptCokies.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);

//        WebElement descriptionField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div[1]/div/div/div[3]/form/div[1]/div[2]/div/div/input")));
//        descriptionField.sendKeys("Tester");
//
//        WebElement cityField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div[2]/div/div/form/div[1]/div[3]/div/div/input")));
//        cityField.sendKeys("Warszawa");

        WebElement descriptionField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='stanowisko, firma, słowo kluczowe']/../input")));
        descriptionField.sendKeys("tester");

        WebElement cityField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='miejscowość, województwo lub kraj']/../input")));
        cityField.sendKeys("Warszawa");
        cityField.sendKeys(Keys.ENTER);

        WebElement submitButton = driver.findElement(By.className("slider--1Afpe"));
        submitButton.click();

        WebElement understoodButton = driver.findElement(By.className("popover__button"));
        understoodButton.click();

        List<WebElement> jobName = driver.findElements(By.className("offer-details__title-link"));
        List<WebElement> companyName = driver.findElements(By.className("offer-details__title-link"));










        //offer-details__title-link


    }
}
