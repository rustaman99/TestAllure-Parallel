package trelloPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChromePage  extends BasePageTrello{
    @FindBy(xpath = "//input[@class='gLFyf']")
    public
    WebElement searchBoxCH;

    @FindBy(xpath = "//h3[text()='Управление проектами команды с любого устройства - Trello']")
    public
    WebElement socketSelectionInResult;

    public ChromePage(WebDriver driver) {
        super(driver);
    }
}
