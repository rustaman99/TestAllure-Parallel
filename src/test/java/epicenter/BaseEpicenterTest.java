package epicenter;

import epicenterPage.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.AllureListener;
import utils.WaitingUtils;
import java.time.Duration;


public class  BaseEpicenterTest {
    protected static final Logger log = Logger.getLogger(EpicenterTest.class);

    protected static WebDriver driver;
    HomePage homePage;
    WaitingUtils waitingUtils;
    ChromeStartPage chromeStartPage;
    MobilPhonePage mobilPhonePage;
    MacbookAirPage macbookAirPage;


    @BeforeMethod
    public void before() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5000));
        initPages();


    }

    public void initPages() {
        homePage = new HomePage(driver);
        waitingUtils = new WaitingUtils(driver);
        chromeStartPage = new ChromeStartPage(driver);
        mobilPhonePage = new MobilPhonePage(driver);
        macbookAirPage = new MacbookAirPage(driver);
    }


    @AfterMethod(description = "Browser is closed", alwaysRun = true)
    public void quitBrowser(ITestResult result) {

        if (ITestResult.FAILURE == result.getStatus()) {
            AllureListener.saveScreenshotPNG(driver);

        }
        driver.quit();
    }
}

