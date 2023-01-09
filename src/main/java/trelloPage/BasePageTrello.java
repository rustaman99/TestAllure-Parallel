package trelloPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePageTrello {
    public WebDriver driver;

    public BasePageTrello(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}

