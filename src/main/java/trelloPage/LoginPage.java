package trelloPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePageTrello {
    @FindBy(xpath = "//a[@data-uuid='MJFtCCgVhXrVl7v9HA7EH_login']")
    public
    WebElement buttonLogin;
    @FindBy(xpath = "//input[@id='user']")
    public
    WebElement userEmailForm;
    @FindBy(xpath = "//input[@name='password']")
    public
    WebElement userPasswordForm;
    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
