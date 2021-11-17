import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class GeneralMenuTest extends BaseTest {
//    WebDriver driver;
//    MainPage mainPage;
//    Actions action;


    @Before
    public void burkecollection(){
            mainPage.burkecollection();}
//    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//        mainPage = new MainPage(driver);
//         action = new Actions(driver);
//    }
//
//    @After
//    public void tearDown() {
//        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
//        driver.close();
//    }

    @Test
    public void menuButtonArtworks() {
//        mainPage.burkecollection();
        mainPage.moveToButtonArtworks(action).moveToElement(mainPage.buttonCollectingAreas).click().build().perform();
//        action.moveToElement(mainPage.buttonArtworks).moveToElement(mainPage.buttonCollectingAreas).click().build().perform();
        String pageArtworksInTheCollection=mainPage.artworksInTheCollection.getText();
        Assertions.assertEquals(pageArtworksInTheCollection,"Artworks in the collection");

        mainPage.moveToButtonArtworks(action).moveToElement(mainPage.buttonArtists).click().build().perform();
//        action.moveToElement(mainPage.buttonArtworks).moveToElement(mainPage.buttonArtists).click().build().perform();
        String pageArtists=mainPage.artistsInTheCollection.getText();
        Assertions.assertEquals(pageArtists,"Artists in the collection");

        mainPage.moveToButtonArtworks(action).moveToElement(mainPage.buttonPeriods).click().build().perform();
//        action.moveToElement(mainPage.buttonArtworks).moveToElement(mainPage.buttonPeriods).click().build().perform();
        String pageHistoricalPeriods=mainPage.historicalPeriods.getText();
        Assertions.assertEquals(pageHistoricalPeriods,"Historical Periods");

        mainPage.moveToButtonArtworks(action).moveToElement(mainPage.buttonFormats).click().build().perform();
//        action.moveToElement(mainPage.buttonArtworks).moveToElement(mainPage.buttonFormats).click().build().perform();
        String pageFormatsAndObjectTypes=mainPage.formatsAndObjectTypes.getText();
        Assertions.assertEquals(pageFormatsAndObjectTypes,"Formats and object types");

        System.out.println("Test menuButtonArtworks: Pressing the Artwork button opens" +
                " the list of buttons:Collecting Areas, Artists, Periods, Formats . " +
                "When you click on the selected button, the corresponding page opens.");
    }
    @Test
    public void menuButtonAbout() {
//        mainPage.burkecollection();

        action.moveToElement(mainPage.buttonAbout).moveToElement(mainPage.buttonCollection).click().build().perform();
        String pageHistoryOfTheCollection=mainPage.historyOfTheCollection.getText();
        Assertions.assertEquals(pageHistoryOfTheCollection,"History of the Collection");

        action.moveToElement(mainPage.buttonAbout).moveToElement(mainPage.buttonMaryGriggsBurke).click().build().perform();
        String pageAboutMaryGriggsBurke=mainPage.aboutMaryGriggsBurke.getText();
        Assertions.assertEquals(pageAboutMaryGriggsBurke,"About Mary Griggs Burke");

        action.moveToElement(mainPage.buttonAbout).moveToElement(mainPage.buttonFoundation).click().build().perform();
        String pageMaryAndJacksonBurkeFoundation=mainPage.generalPage.getText();
        Assertions.assertEquals(pageMaryAndJacksonBurkeFoundation,"Mary and Jackson Burke Foundation");

        System.out.println("Test menuButtonAbout: Pressing the About button opens" +
                " the list of buttons:Collecting Areas, Artists, Periods, Formats . " +
                "When you click on the selected button, the corresponding page opens.");
    }
    @Test
    public void menuButtonBookAndGeneralPage() {
//        mainPage.burkecollection();
        mainPage.wait.until(ExpectedConditions.elementToBeClickable(mainPage.buttonBook));
        mainPage.buttonBook.click();
        String pageAboutTheBook=mainPage.aboutTheBook.getText();
        Assertions.assertEquals(pageAboutTheBook,"About the book: Art through a Lifetime");

        mainPage.wait.until(ExpectedConditions.elementToBeClickable(mainPage.buttonGeneralPage));
        mainPage.buttonGeneralPage.click();
        String pageGeneralPage=mainPage.generalPage.getText();
        Assertions.assertEquals(pageGeneralPage,"The Mary Griggs Burke Collection");
        System.out.println("Test menuButtonBookAndGeneralPage: Pressing the Book button " +
                "and buttonGeneralPage corresponding page opens");
    }

}
