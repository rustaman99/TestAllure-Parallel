package pages.trelloPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class WorkspacePage extends BasePage {
    @FindBy(xpath = "//*[@class='board-header u-clearfix js-board-header']//preceding-sibling::h1")
    public
    WebElement boardName;
    @FindBy(xpath = "//*[@aria-label='Меню дій для дощок']")
    public
    WebElement actionMenuForBoards;

    @FindBy(xpath = "//span[text()='Закрити дошку']")
    public
    WebElement closeTheBoard;

    @FindBy(xpath = "//*[@class='Ts+YceGnvTbKoG cqImzCika1Gnom ZP+x7L4IomBdCS JIXQq8gDYY04N6']")
    public
    WebElement boardСlosingСonfirmation;

    //*[@class='Ts+YceGnvTbKoG cqImzCika1Gnom ZP+x7L4IomBdCS JIXQq8gDYY04N6']
//
    @FindBy(xpath = "//div[@class='board-canvas']//preceding-sibling::div[3]//*[@class='list-header js-list-header u-clearfix is-menu-shown ui-sortable-handle']")
    public
    WebElement columnName;
    @FindBy(xpath = "//div[@class='board-canvas']//preceding-sibling::div[3]//*[@class='list-header js-list-header u-clearfix is-menu-shown ui-sortable-handle']//following-sibling::div[2]")
    public
    WebElement addCard;

    @FindBy(xpath = "//*[@class='list-card-composer-textarea js-card-title']")
    public
    WebElement creatingСardName;

    @FindBy(xpath = " //input[@value='Додати картку']")
    public
    WebElement addNewCard;

    @FindBy(xpath = "//span[text()='Выучить']")
    public
    WebElement newCardName;


    @FindBy(xpath = "//span[text()='New']")
    public
    WebElement cardNew;

    @FindBy(xpath = "//*[text()='Додати до картки']//following-sibling::*//*[@title='Учасники']")
    public
    WebElement members;

    @FindBy(xpath = "//span[@class='full-name']")
    public
    WebElement fullName;

    @FindBy(xpath = "//h3[@class='card-detail-item-header mod-no-top-margin']")
    public
    WebElement numberMembers;

    @FindBy(xpath = "//a[@aria-label='New board (наразі активна)']")
    public
    WebElement newBoardButton;

    @FindBy(xpath = "//a[@aria-label='Позначити дошку як важливу або зняти позначку'] ")
    public
    WebElement addToFavorite;

    @FindBy(xpath = " //a[@title='Мітки']")
    public
    WebElement label;

    @FindBy(xpath = "//h3[@class='GkwjohMGPGhOSh']")
    public
    WebElement IsDisplayedLabel;


    public WorkspacePage(WebDriver driver) {
        super(driver);
    }
}
