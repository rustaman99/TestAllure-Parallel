package utils;

import epicenterPage.BasePage;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

//import static epicenter.BaseEpicenterTest.driver;

public class AllureListener extends BasePage implements ITestListener {

    public AllureListener(WebDriver driver) {
        super(driver);
    }

    // Text attachments for Allure
    @Attachment(value = "{0}", type = "text/plain")
    public static String saveTextLog(String message) {
        return message;
    }

    // Text attachments for Allure
    @Attachment(value = "Page screenshot", type = "image/png")
    public static byte[] saveScreenshotPNG(WebDriver driver) {
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }

    @Override
    public void onTestFailure(ITestResult Result) {
        saveScreenshotPNG(driver);
        saveTextLog(Result.getMethod().getConstructorOrMethod().getName() + "Screenshot Saved.");
    }




}