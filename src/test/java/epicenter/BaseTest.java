package epicenter;

import org.apache.log4j.*;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.AllureListener;

import java.time.Duration;

import static utils.DriverManager.createBrowserInstance;
import static utils.DriverManager.getDriver;


public  class BaseTest {
    protected static final Logger log = Logger.getLogger(EpicenterTest.class);
    protected ThreadLocal<Pages> pages = new ThreadLocal<>();


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

