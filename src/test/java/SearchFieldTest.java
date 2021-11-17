import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SearchFieldTest extends BaseTest{
    @Before
    public void burkecollection(){
        mainPage.burkecollection();
    }

    @Test
    public void searchCollection()  {

        mainPage.buttonSearchFlield.sendKeys("japanese works");
        mainPage.enterButton();
        String collection=mainPage.collectionJapaneseWorks.getText();
        Assertions.assertEquals(collection,"Japanese");
        System.out.println("Test searchCollection :The test finds the required collection");
    }
    @Test
    public void searchPainting()  {

        mainPage.buttonSearchFlield.sendKeys("Courtesan and Attendant in Early Spring");
        mainPage.enterButton();
        String painting=mainPage.paintingName.getText();
        Assertions.assertEquals(painting,"Courtesan and Attendant in Early Spring");
        System.out.println("Test searchCollection :The test finds the required painting");
    }
    @Test
    public void searchError()  {

        mainPage.buttonSearchFlield.sendKeys("12345Test");
        mainPage.enterButton();
        String messageAboutError=mainPage.errorMessage.getText();
        Assertions.assertEquals(messageAboutError,"No entries were found for 12345Test");
        System.out.println("Test searchCollection :The test finds the required painting");
    }
    @Test
    public void searchDifferentRegister()  {

        mainPage.buttonSearchFlield.sendKeys("JaPanEse WorKs");
        mainPage.enterButton();
        String collection=mainPage.collectionJapaneseWorks.getText();
        Assertions.assertEquals(collection,"Japanese");
        System.out.println("Test searchDifferentRegister :The test finds the required collection");
    }
    @Test
    public void searchByArtists()  {

        mainPage.buttonSearchFlield.sendKeys("Chin Sen");
        mainPage.enterButton();
        String painting=mainPage.titlePainting.getText();
        Assertions.assertEquals(painting,"Cats by Bamboo and Chrysanthemums");
        System.out.println("Test searchByHieroglyphs :The test finds the required painting using hieroglyphs");
    }
}
