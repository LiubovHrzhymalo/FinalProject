package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MainPage {
    private WebDriver driver;

    public WebDriverWait wait;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        this.wait=new WebDriverWait(this.driver,20);
        PageFactory.initElements(driver,this);
    }

    public void burkecollection(){

        driver.get("http://burkecollection.org/");
    }

    public void burkePainting(){

        driver.get("http://burkecollection.org/catalogue/952-melon-flowers-and-insects");
    }

    @FindBy(xpath=" //*[@id=\"top\"]/ul/li[2]/a")
    public WebElement buttonArtworks;

    @FindBy(xpath="//*[@id=\"top\"]/ul/li[2]/ul/li[1]/a")
    public WebElement buttonCollectingAreas;

    @FindBy(xpath="//*[@id=\"top\"]/ul/li[2]/ul/li[2]/a")
    public WebElement buttonArtists;

    @FindBy(xpath="//*[@id=\"top\"]/ul/li[2]/ul/li[3]/a")
    public WebElement buttonPeriods;

    @FindBy(xpath="/html/body/div[3]/nav[1]/ul/li[2]/ul/li[4]/a")
    public WebElement buttonFormats;

    @FindBy(xpath="/html/body/div[3]/nav[1]/ul/li[3]/a")
    public WebElement buttonAbout;

    @FindBy(xpath="//*[@id=\"top\"]/ul/li[3]/ul/li[1]/a")
    public WebElement buttonCollection;

    @FindBy(xpath="/html/body/div[3]/nav[1]/ul/li[3]/ul/li[2]/a")
    public WebElement buttonMaryGriggsBurke;

    @FindBy(xpath="/html/body/div[3]/nav[1]/ul/li[3]/ul/li[3]/a")
    public WebElement buttonFoundation;

    @FindBy(xpath="/html/body/div[3]/nav[1]/ul/li[4]/a")
    public WebElement buttonBook;

    @FindBy(xpath="/html/body/div[3]/nav[1]/ul/li[1]/a")
    public WebElement buttonGeneralPage;

    @FindBy(xpath="/html/body/div[3]/nav[1]/ul/li[5]/form/input")
    public WebElement buttonSearchFlield;

    @FindBy(xpath="/html/body/div[3]/div[2]/div/nav/div[2]/ul/li/a")
    public WebElement collectionJapaneseWorks;

    @FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div[2]/a/div/div[2]")
    public WebElement paintingName;

    @FindBy(xpath="/html/body/div[3]/div[2]/div/p")
    public WebElement errorMessage;

    @FindBy(xpath="/html/body/div[3]/div[2]/div/h1")
    public WebElement artworksInTheCollection;

    @FindBy(xpath="/html/body/div[3]/div[2]/div/h1")
    public WebElement artistsInTheCollection;

    @FindBy(xpath="/html/body/div[3]/div[2]/div/h1")
    public WebElement historicalPeriods;

    @FindBy(xpath="/html/body/div[3]/div[2]/div/h1")
    public WebElement formatsAndObjectTypes;

    @FindBy(xpath="/html/body/div[3]/div[2]/div/h1")
    public WebElement historyOfTheCollection;

    @FindBy(xpath="/html/body/div[3]/div[2]/div/h1")
    public WebElement aboutMaryGriggsBurke;

    @FindBy(xpath="/html/body/div[3]/div[2]/div/h1")
    public WebElement maryAndJacksonBurkeFoundation;

    @FindBy(xpath="//*[@id=\"page\"]/h1")
    public WebElement aboutTheBook;

    @FindBy(xpath="//*[@id=\"page\"]/h1")
    public WebElement generalPage;

    @FindBy(xpath="/html/body/div[3]/div[2]/div/div[3]/div[1]/div")
    public WebElement buttonClickToEnlarge;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div/div[3]/div[1]/img")
    public WebElement imgArea;

    @FindBy(id="lightbox")
    public WebElement imgBig;

//    @FindBy(xpath = "//*[@id=\"zoom-instructions\"]")
//    public WebElement buttonClickZoom;

    @FindBy(xpath = "//*[@id=\"lightbox\"]")
    public WebElement buttonClickZoom;
//    @FindBy(xpath = "/html/body")
//    public WebElement buttonClickZoom;

    @FindBy(xpath = "/html/body/div[5]/div[1]")
    public WebElement buttonClose;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div/div[2]/div[2]/a/div/div[2]")
    public WebElement titlePainting;



}

