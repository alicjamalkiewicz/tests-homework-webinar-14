import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;

public class ZadanieDomowe7 extends BaseTest{

    @Test
    public void googleJavaSearch(){
        driver.get("https://www.google.com/");

        WebElement cookiesAllow = driver.findElement(By.id("L2AGLb")); //kiedy wpisuje xpath buttona 'customize' to udaje sie kliknąć ten burron, ale jak wpisuje xpath button 'agree' to mam blad 'element not interactable'
        cookiesAllow.click();
        WebDriverWait wait = new WebDriverWait(driver, 1);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("lnXdpd")));

//        WebElement searchFiled = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
//        searchFiled.sendKeys("JAVA");
//        searchFiled.click();

        driver.findElement(By.name("q")).sendKeys("java", Keys.ENTER);

//        WebElement searchButton = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]"));       //(By.className("CcAdNb"));
//        searchButton.click();

//        List<WebElement> howManyLinks = driver.findElements(By.cssSelector(".LC20lb.DKV0Md"));
//        System.out.println(howManyLinks.size());
//
//        List<WebElement> howManyLinks2 = driver.findElements(By.cssSelector(".l"));
//        System.out.println(howManyLinks2.size());
//
//        int linksOnThePage = howManyLinks.size() + howManyLinks2.size();

//        System.out.println("On the 1st page, there are " + linksOnThePage + " links in total.");

        List<WebElement> results = driver.findElements(By.className("g"));
        System.out.println(results.size());

    }
}
