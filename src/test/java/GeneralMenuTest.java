import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class GeneralMenuTest extends BaseTest {

    @Before
    public void burkecollection(){
            mainPage.burkecollection();
    }

    @Test
    public void menuButtonArtworks() {

        mainPage.moveToButtonArtworks(action).moveToElement(mainPage.buttonCollectingAreas).click().build().perform();
        String pageArtworksInTheCollection=mainPage.artworksInTheCollection.getText();
        Assertions.assertEquals(pageArtworksInTheCollection,"Artworks in the collection");

        mainPage.moveToButtonArtworks(action).moveToElement(mainPage.buttonArtists).click().build().perform();
        String pageArtists=mainPage.artistsInTheCollection.getText();
        Assertions.assertEquals(pageArtists,"Artists in the collection");

        mainPage.moveToButtonArtworks(action).moveToElement(mainPage.buttonPeriods).click().build().perform();
        String pageHistoricalPeriods=mainPage.historicalPeriods.getText();
        Assertions.assertEquals(pageHistoricalPeriods,"Historical Periods");

        mainPage.moveToButtonArtworks(action).moveToElement(mainPage.buttonFormats).click().build().perform();
        String pageFormatsAndObjectTypes=mainPage.formatsAndObjectTypes.getText();
        Assertions.assertEquals(pageFormatsAndObjectTypes,"Formats and object types");

        System.out.println("Test menuButtonArtworks: Pressing the Artwork button opens" +
                " the list of buttons:Collecting Areas, Artists, Periods, Formats . " +
                "When you click on the selected button, the corresponding page opens.");
    }
    @Test
    public void menuButtonAbout() {

        mainPage.moveToButtonAbout(action).moveToElement(mainPage.buttonCollection).click().build().perform();
        String pageHistoryOfTheCollection=mainPage.historyOfTheCollection.getText();
        Assertions.assertEquals(pageHistoryOfTheCollection,"History of the Collection");

        mainPage.moveToButtonAbout(action).moveToElement(mainPage.buttonMaryGriggsBurke).click().build().perform();
        String pageAboutMaryGriggsBurke=mainPage.aboutMaryGriggsBurke.getText();
        Assertions.assertEquals(pageAboutMaryGriggsBurke,"About Mary Griggs Burke");

        mainPage.moveToButtonAbout(action).moveToElement(mainPage.buttonFoundation).click().build().perform();
        String pageMaryAndJacksonBurkeFoundation=mainPage.generalPage.getText();
        Assertions.assertEquals(pageMaryAndJacksonBurkeFoundation,"Mary and Jackson Burke Foundation");

        System.out.println("Test menuButtonAbout: Pressing the About button opens" +
                " the list of buttons:Collecting Areas, Artists, Periods, Formats . " +
                "When you click on the selected button, the corresponding page opens.");
    }
    @Test
    public void menuButtonBookAndGeneralPage() {

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
