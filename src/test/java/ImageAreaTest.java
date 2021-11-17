
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImageAreaTest extends BaseTest {
//    WebDriver driver;
//    MainPage mainPage;
//    Actions action;
//
//
//    @Before
//    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//        mainPage = new MainPage(driver);
//        action = new Actions(driver);
//    }
//
//    @After
//    public void tearDown() {
//        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
//        driver.close();
//    }

    @Test
    public void menuImageArea() {
        cataloguePage.burkePainting();
        action.moveToElement(cataloguePage.imgArea).moveToElement(cataloguePage.buttonClickToEnlarge).click().build().perform();
        String styleImg=cataloguePage.imgBig.getAttribute("id");
        Assertions.assertEquals(styleImg,"lightbox");
        WebDriverWait wait = new WebDriverWait(driver, 40);
        cataloguePage.wait.until(ExpectedConditions.elementToBeClickable(cataloguePage.buttonClickZoom));
        cataloguePage.buttonClickZoom.click();
        Assertions.assertEquals(styleImg,"lightbox");
        cataloguePage.wait.until(ExpectedConditions.elementToBeClickable(cataloguePage.buttonClose));
        cataloguePage.buttonClose.click();
        System.out.println("Test menuImageArea: The modal works according to the requirements.");
    }
}
