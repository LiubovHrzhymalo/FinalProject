import locators.MainPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    MainPage mainPage;
    Actions action;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        mainPage = new MainPage(driver);
        action = new Actions(driver);
    }

    @After
    public void tearDown() {
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.close();
    }
}
