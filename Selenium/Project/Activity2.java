package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.time.Duration;

public class Activity2 {
    public static void main(String[] args) {
        // Set up Firefox driver
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Navigate to the the page
        driver.get("https://alchemy.hguy.co/jobs/");
        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(5));

        //to get the heading of the page
        String Heading= System.out.println(driver.findElement(By.xpath("//h1[@class='entry-title']")).getText());
        Assert.assertEquals("Welcome to Alchemy Jobs", Heading);
        driver.close();
    }
