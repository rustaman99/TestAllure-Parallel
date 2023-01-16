package sites.trello;

import org.testng.annotations.BeforeMethod;
import sites.BaseTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utils.AllureListener.saveScreenshotPNG;
import static utils.DriverManager.getDriver;

public class TrelloTest  extends BaseTest {
  @BeforeMethod
  public void login() throws InterruptedException {
//      getDriver().get("https://trello.com");
//      pages.get().loginPage.buttonLogin.click();
//      pages.get().loginPage.userEmailForm.sendKeys("rsauto2019@gmail.com");
//      pages.get().loginPage.userEmailForm.sendKeys(Keys.ENTER);
//      pages.get().waitingUtils.waitElementToBeClickable(pages.get().loginPage.userPasswordForm).sendKeys("rustaman99");
//      pages.get().loginPage.userPasswordForm.sendKeys(Keys.ENTER);
      getDriver().get("https://trello.com");
      pages.get().loginPage.buttonLogin.click();
      pages.get().loginPage.userEmailForm.sendKeys("nazarenko.ruslan@ukr.net");
      pages.get().loginPage.userEmailForm.sendKeys(Keys.ENTER);
      pages.get().waitingUtils.waitElementToBeClickable(pages.get().loginPage.userPasswordForm).sendKeys("rustaman99");
      pages.get().loginPage.userPasswordForm.sendKeys(Keys.ENTER);
  }
//    @Test
//    public void checkUserName() {
//        Assert.assertEquals(pages.get().startPageTrello.userName.getText(), "RSauto");
//    }
//
//    @Test
//    public void checkTheCreateButtonIsDisplayed() {
//        Assert.assertTrue(pages.get().startPageTrello.buttonCreatedBoard.isDisplayed());
//    }
//    @Test
//    public void checkSearchFieldIsEnabled()  {
//        Assert.assertTrue(pages.get().startPageTrello.searchField.isEnabled());
//    }

    @Test
    public void checkBoardName() {
        pages.get().startPageTrello.JavaButton.click();
        Assert.assertEquals(pages.get().workspacePage.boardName.getText(), "Java");
    }

    @Test
    public void boardCreationCheck() {
        pages.get().startPageTrello.buttonCreatedBoard.click();
        pages.get().startPageTrello.buttonCreated.click();
        pages.get().startPageTrello.boardTitle.sendKeys("New board");
        pages.get().startPageTrello.createBoardSubmitButton.click();
        Assert.assertEquals(pages.get().workspacePage.boardName.getText(), "New board");
        pages.get().workspacePage.newBoardButton.click();
        pages.get().workspacePage.actionMenuForBoards.click();
        pages.get().workspacePage.closeTheBoard.click();
        pages.get().workspacePage.boardСlosingСonfirmation.click();


    }

    @Test
    public void checkAddToFavoriteIsDisplayed() throws InterruptedException {
        pages.get().startPageTrello.buttonCreatedBoard.click();
        pages.get().startPageTrello.buttonCreated.click();
        pages.get().startPageTrello.boardTitle.sendKeys("New board");
        pages.get().startPageTrello.createBoardSubmitButton.click();
        pages.get().waitingUtils.waitElementToBeClickable((pages.get().workspacePage.addToFavorite)).click();
        Assert.assertTrue(pages.get().workspacePage.addToFavorite.isDisplayed());
        pages.get().workspacePage.actionMenuForBoards.click();
        pages.get().workspacePage.closeTheBoard.click();
        pages.get().workspacePage.boardСlosingСonfirmation.click();


    }

    @Test
    public void checkCreatingANewCard()  {

        pages.get().startPageTrello.boardName.click();
        pages.get().workspacePage.addCard.click();
        pages.get().workspacePage.creatingСardName.sendKeys("Выучить");
        pages.get().workspacePage.addNewCard.click();
        Assert.assertEquals(pages.get().workspacePage.newCardName.getText(), "Выучить");
    }

    @Test
    public void checkForAddInMemberInTheCard()  {
        pages.get().startPageTrello.boardName.click();
        pages.get().workspacePage.cardNew.click();
        pages.get().workspacePage.members.click();
        pages.get().workspacePage.fullName.click();
        Assert.assertTrue(pages.get().workspacePage.numberMembers.isDisplayed());
        pages.get().workspacePage.members.click();
        pages.get().workspacePage.members.click();
        pages.get().workspacePage.fullName.click();
    }

    @Test
    public void checkCardWithIndex2IsDisplayed() {

        pages.get().startPageTrello.boardName.click();
        pages.get().workspacePage.addCard.click();
        pages.get().listElementsOfWorkspacePage.listOfHeadTable.get(1).click();
        Assert.assertTrue(pages.get().listElementsOfWorkspacePage.listOfHeadTable.get(1).isDisplayed());
        saveScreenshotPNG(getDriver());
    }

    @Test
    public void dragСardToAnotherBoard()  {
        Actions actions = new Actions(getDriver());
        pages.get().startPageTrello.boardName.click();
        pages.get().workspacePage.addCard.click();
//        actions.doubleClick(pages.get().listElementsOfWorkspacePage.listCards.get(1)).build().perform();
        actions.dragAndDrop(pages.get().listElementsOfWorkspacePage.listCards.get(1), pages.get().listElementsOfWorkspacePage.listCards.get(2)).build().perform();

    }

    @Test
    public void addALabelInTheBoardAndCheckIfItIsDisplayed() throws InterruptedException {
        pages.get().startPageTrello.boardName.click();
        pages.get().workspacePage.cardNew.click();
        pages.get().workspacePage.label.click();
        pages.get().listElementsOfWorkspacePage.labelColorsList.get(0).click();
        Assert.assertTrue(pages.get().workspacePage.IsDisplayedLabel.isDisplayed());
        pages.get().waitingUtils.waitElementToBeClickable(pages.get().listElementsOfWorkspacePage.labelColorsList.get(0)).click();
    }
    @Test
    public void  checkTheAdditionOfTheDeadlineForCompletingTheTaskInTheCard()  {
//        getDriver().get("https://trello.com");
//        pages.get().loginPage.buttonLogin.click();
//        pages.get().loginPage.userEmailForm.sendKeys("nazarenko.ruslan@ukr.net");
//        pages.get().loginPage.userEmailForm.sendKeys(Keys.ENTER);
//        pages.get().waitingUtils.waitElementToBeClickable(pages.get().loginPage.userPasswordForm).sendKeys("rustaman99");
//        pages.get().loginPage.userPasswordForm.sendKeys(Keys.ENTER);
        pages.get().startPageTrello.boardName.click();
        pages.get().workspacePage.cardNew.click();


 }
}