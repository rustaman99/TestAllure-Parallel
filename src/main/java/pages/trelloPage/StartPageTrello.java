package pages.trelloPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class StartPageTrello extends BasePage {
    @FindBy(xpath = "//h3[text()='RSauto']")
    public
    WebElement userName;
    @FindBy(xpath = "//p[@class='uJFM1WfH-EGEiT']")
    public
    WebElement buttonCreatedBoard ;
    @FindBy(xpath = "//input[@placeholder='Пошук']")
    public
    WebElement searchField;
    @FindBy(xpath = "//*[@class='boards-page-board-section-list']//div[@title='Java']")
    public
    WebElement JavaButton;

    @FindBy(xpath = "//*[text()='Створити дошку']")
    public
    WebElement buttonCreated;

    @FindBy(xpath = "//input[@class='nch-textfield__input Hj0IB7nx8rs7UO Hj0IB7nx8rs7UO ysTE7s-UXRkpYP']")
    public
    WebElement boardTitle;

    @FindBy(xpath = "//button[@data-testid='create-board-submit-button']")
    public
    WebElement createBoardSubmitButton;

    @FindBy(xpath = "//*[@class='board-tile-details-name']//*[text()='Test']")
    public
    WebElement boardName;



    public StartPageTrello(WebDriver driver) {
        super(driver);
    }
}
