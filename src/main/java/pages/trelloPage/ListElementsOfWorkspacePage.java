package pages.trelloPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class ListElementsOfWorkspacePage extends BasePage {
    @FindBy(xpath = "//*[@class='list-header-target js-editing-target']")
    public List<WebElement> listOfHeadTable;
   // @FindBy(xpath = "//*[@class='list-cards u-fancy-scrollbar u-clearfix js-list-cards js-sortable ui-sortable']")
    @FindBy(xpath = "//*[@class='list js-list-content']")
    public List<WebElement> listCards;

    @FindBy(xpath = "//*[@class='zGP9qNQ3r+Nwlw']")
    public List<WebElement> labelColorsList;


    @FindBy(xpath = "//h3[text()='Додати до картки']//following-sibling::*  ")
    public List<WebElement> adddToCardList;

    public ListElementsOfWorkspacePage(WebDriver driver) {
        super(driver);
    }
}

