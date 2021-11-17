import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;

public class SearchFieldTest extends BaseTest{
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
    public void searchCollection()  {

        mainPage.burkecollection();
        mainPage.buttonSearchFlield.sendKeys("japanese works");
        mainPage.buttonSearchFlield.sendKeys(Keys.ENTER);
        String collection=mainPage.collectionJapaneseWorks.getText();
        Assertions.assertEquals(collection,"Japanese");
        System.out.println("Test searchCollection :The test finds the required collection");
    }
    @Test
    public void searchPainting()  {

        mainPage.burkecollection();
        mainPage.buttonSearchFlield.sendKeys("Courtesan and Attendant in Early Spring");
        mainPage.buttonSearchFlield.sendKeys(Keys.ENTER);
        String painting=mainPage.paintingName.getText();
        Assertions.assertEquals(painting,"Courtesan and Attendant in Early Spring");
        System.out.println("Test searchCollection :The test finds the required painting");
    }
    @Test
    public void searchError()  {

        mainPage.burkecollection();
        mainPage.buttonSearchFlield.sendKeys("12345Test");
        mainPage.buttonSearchFlield.sendKeys(Keys.ENTER);
        String messageAboutError=mainPage.errorMessage.getText();
        Assertions.assertEquals(messageAboutError,"No entries were found for 12345Test");
        System.out.println("Test searchCollection :The test finds the required painting");
    }
    @Test
    public void searchDifferentRegister()  {

        mainPage.burkecollection();
        mainPage.buttonSearchFlield.sendKeys("JaPanEse WorKs");
        mainPage.buttonSearchFlield.sendKeys(Keys.ENTER);
        String collection=mainPage.collectionJapaneseWorks.getText();
        Assertions.assertEquals(collection,"Japanese");
        System.out.println("Test searchDifferentRegister :The test finds the required collection");
    }
    @Test
    public void searchByArtists()  {

        mainPage.burkecollection();
        mainPage.buttonSearchFlield.sendKeys("Chin Sen");
        mainPage.buttonSearchFlield.sendKeys(Keys.ENTER);
        String painting=mainPage.titlePainting.getText();
        Assertions.assertEquals(painting,"Cats by Bamboo and Chrysanthemums");
        System.out.println("Test searchByHieroglyphs :The test finds the required painting using hieroglyphs");
    }


}
