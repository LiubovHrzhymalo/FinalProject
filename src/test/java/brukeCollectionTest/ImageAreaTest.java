package brukeCollectionTest;

import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ImageAreaTest extends BaseTest {

    @Test
    public void menuImageArea() {
        cataloguePage.burkePainting();
        action.moveToElement(cataloguePage.imgArea).moveToElement(cataloguePage.buttonClickToEnlarge).click().build().perform();
        cataloguePage.chekingPage();
        cataloguePage.wait.until(ExpectedConditions.elementToBeClickable(cataloguePage.buttonClickZoom));
        cataloguePage.buttonClickZoom.click();
        cataloguePage.chekingPage();
        cataloguePage.wait.until(ExpectedConditions.elementToBeClickable(cataloguePage.buttonClose));
        cataloguePage.buttonClose.click();
        System.out.println("Test menuImageArea: The modal works according to the requirements.");
    }
}
