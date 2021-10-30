import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

//4. Stworzyć klasę testującą checkboxy i wykonać test czy checkbox 'I have a bike' ma atrybut value równy bike

public class CheckBoxTests extends BaseTest{

    @Test
    public void checkBoxBikeAttribute(){
        driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");

        List<WebElement> checkBoxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

        WebElement bikeCheckbox = checkBoxes.get(0);

        String bikeCheckboxAttribute = bikeCheckbox.getAttribute("value");
        System.out.println(bikeCheckboxAttribute);

        Assert.assertEquals(bikeCheckboxAttribute, "Bike");




    }
}
