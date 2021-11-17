package burkeCollection.common;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CataloguePage {
    private static WebDriver driver;

    public WebDriverWait wait;
    public CataloguePage(WebDriver driver) {
        this.driver = driver;
        this.wait=new WebDriverWait(this.driver,20);
        PageFactory.initElements(driver,this);
    }
    public void burkePainting(){

        driver.get("http://burkecollection.org/catalogue/952-melon-flowers-and-insects");
    }
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/div[3]/div[1]/img")
    public WebElement imgArea;

    @FindBy(id="lightbox")
    public WebElement imgBig;

    @FindBy(xpath = "//*[@id=\"lightbox\"]")
    public WebElement buttonClickZoom;

    @FindBy(xpath = "/html/body/div[5]/div[1]")
    public WebElement buttonClose;

    @FindBy(xpath="/html/body/div[3]/div[2]/div/div[3]/div[1]/div")
    public WebElement buttonClickToEnlarge;

    @Step("Checking page open")
    public void chekingPage(){
        String styleImg=this.imgBig.getAttribute("id");
        Assertions.assertEquals(styleImg,"lightbox");
    }

}
