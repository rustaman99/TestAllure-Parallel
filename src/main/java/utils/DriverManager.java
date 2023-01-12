package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {
    private final static ThreadLocal<WebDriver> dr = new ThreadLocal<>();
  static   PropertiesReader reader;
    public static void createBrowserInstance(String browser) throws MalformedURLException {
        if(reader.getProperty("Remote").equals("true")) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setCapability("browserVersion", "100");
            chromeOptions.setCapability("platformName", "Windows");
        setDriver(new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions));
        } else if (browser.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            setDriver(new ChromeDriver());
        }
    }
    public static WebDriver getDriver(){
        return dr.get();
    }
    public static void  setDriver(WebDriver driverref){
        dr.set(driverref);
    }
    public static void closeBrowser(){
        new ThreadLocal<>();
        dr.get().quit();
        dr.remove();
    }
}