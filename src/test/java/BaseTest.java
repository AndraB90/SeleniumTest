import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver= new ChromeDriver();
    }

    @AfterMethod
    public void closeDriver(){
        driver.quit();
    }

    @Test
    public void goToWebsite() throws InterruptedException {
        driver.get("https://tutorialsninja.com/demo/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Apple");
        driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
    }


}
