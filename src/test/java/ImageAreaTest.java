import locators.MainPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
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
        mainPage.burkePainting();
        action.moveToElement(mainPage.imgArea).moveToElement(mainPage.buttonClickToEnlarge).click().build().perform();
        String styleImg=mainPage.imgBig.getAttribute("id");
        Assertions.assertEquals(styleImg,"lightbox");
        WebDriverWait wait = new WebDriverWait(driver, 40);

//        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"zoom-instructions\"]")));
        mainPage.wait.until(ExpectedConditions.elementToBeClickable(mainPage.buttonClickZoom));
        mainPage.buttonClickZoom.click();
        Assertions.assertEquals(styleImg,"lightbox");
        mainPage.wait.until(ExpectedConditions.elementToBeClickable(mainPage.buttonClose));
        mainPage.buttonClose.click();
        System.out.println("Test menuImageArea: The modal works according to the requirements.");


    }

}
