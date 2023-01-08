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
import utils.DriverManager;
import utils.WaitingUtils;
import java.time.Duration;

import static utils.DriverManager.createBrowserInstance;
import static utils.DriverManager.getDriver;


public class  BaseEpicenterTest {
    protected static final Logger log = Logger.getLogger(EpicenterTest.class);
    ThreadLocal<Pages> pages = new ThreadLocal<>();


    @BeforeMethod
    public void before() {
        createBrowserInstance("chrome");
        pages.set(new Pages());
        getDriver().get("https://www.google.com.ua/");
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5000));
    }




    @AfterMethod(description = "Browser is closed", alwaysRun = true)
    public void quitBrowser(ITestResult result) {

        if (ITestResult.FAILURE == result.getStatus()) {
            AllureListener.saveScreenshotPNG(getDriver());

        }
        getDriver().quit();
    }
}

