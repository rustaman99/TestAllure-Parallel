package trelloPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WorkspacePage extends  BasePageTrello{
    @FindBy(xpath = "//div[@class='board-header-btn mod-board-name inline-rename-board js-rename-board']")
    public
    WebElement boardName;
    public WorkspacePage(WebDriver driver) {
        super(driver);
    }
}
