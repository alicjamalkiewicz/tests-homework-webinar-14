import org.testng.Assert;
import org.testng.annotations.Test;

public class ShopTests extends BaseTest{

    @Test
    public void checkTitle(){
        driver.get("http://sampleshop.inqa.pl/");
        Assert.assertEquals(driver.getTitle(), "Automation Sample Shop");
    }

    @Test
    public void checkHomePageUrl(){
        driver.get("http://sampleshop.inqa.pl/");
        Assert.assertEquals(driver.getCurrentUrl(), "http://sampleshop.inqa.pl/");

    }
}
