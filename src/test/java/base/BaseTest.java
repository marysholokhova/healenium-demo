package base;

import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    static protected SelfHealingDriver driver;

    @BeforeSuite
    static public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        WebDriver delegate = new ChromeDriver(options);
        driver = SelfHealingDriver.create(delegate);
        driver.manage().window().maximize();
    }

    @AfterSuite
    static public void afterAll() {
        if (driver != null) {
            driver.quit();
        }
    }
}
