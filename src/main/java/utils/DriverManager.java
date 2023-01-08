package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    private final static ThreadLocal<WebDriver> dr = new ThreadLocal<>();
    public static void createBrowserInstance(String browser){
        if(browser.equalsIgnoreCase("Chrome")){
            WebDriverManager.chromedriver().setup();
            setDriver(new ChromeDriver());
        }else  if(browser.equalsIgnoreCase("firefox")){
   WebDriverManager.firefoxdriver().setup();
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
