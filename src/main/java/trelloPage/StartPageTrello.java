package trelloPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPageTrello extends BasePageTrello{
    @FindBy(xpath = "//h3[text()='RSauto']")
    public
    WebElement userName;
    @FindBy(xpath = "//p[@class='uJFM1WfH-EGEiT']")
    public
    WebElement buttonCreated;
    @FindBy(xpath = "//input[@placeholder='Поиск']")
    public
    WebElement searchField;
    @FindBy(xpath = "//*[@class='boards-page-board-section-list']//div[@title='Java']")
    public
    WebElement JavaButton;

    public StartPageTrello(WebDriver driver) {
        super(driver);
    }
}
