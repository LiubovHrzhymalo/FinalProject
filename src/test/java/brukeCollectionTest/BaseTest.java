package brukeCollectionTest;

import burkeCollection.common.CataloguePage;
import burkeCollection.common.MainPage;
import burkeCollection.utils.DriverProvider;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    MainPage mainPage;
    Actions action;
    CataloguePage cataloguePage;

    @Before
    public void setUp() {
        DriverProvider provider = new DriverProvider();
        driver=provider.getDriver();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

        mainPage = new MainPage(driver);
        action = new Actions(driver);

       cataloguePage = new CataloguePage(driver);
    }

    @After
    public void tearDown() {
        driver.close();
    }
}
