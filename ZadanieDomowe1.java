import org.testng.Assert;
import org.testng.annotations.Test;

public class ZadanieDomowe1 extends BaseTest{

    @Test
    public void printPageTitle(){
        driver.get("https://testuj.pl/");
        Assert.assertEquals(driver.getTitle(), "Zostań certyfikowanym testerem. Szkolenia z testowania oprogramowania • testuj.pl");

        System.out.println(driver.getTitle());
    }
}
