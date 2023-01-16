package utils;

import pages.BasePage;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import static utils.DriverManager.getDriver;


public class AllureListener extends BasePage implements ITestListener {

    public AllureListener(WebDriver driver) {
        super(driver);
    }

    @Attachment(value = "{0}", type = "text/plain")
    public static String saveTextLog(String message) {
        return message;
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public static byte[] saveScreenshotPNG(WebDriver driver) {
       return ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
    }
    @Override
    public void onTestFailure(ITestResult Result) {
        saveScreenshotPNG(getDriver());
        saveTextLog(Result.getMethod().getConstructorOrMethod().getName() + "Screenshot Saved.");
    }

}