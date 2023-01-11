package trello;

import epicenter.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TrelloTest  extends BaseTest {
    @Test
    public void logginTrello() throws InterruptedException {
        pages.get().chromePage.searchBoxCH.sendKeys("Trello");
        pages.get().chromePage.searchBoxCH.sendKeys(Keys.ENTER);
        pages.get().chromePage.socketSelectionInResult.click();
        pages.get().loginPage.buttonLogin.click();
        pages.get().loginPage.userEmailForm.sendKeys("rsauto2019@gmail.com");
        pages.get().loginPage.userEmailForm.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        pages.get().loginPage.userPasswordForm.sendKeys("rustaman99");
        pages.get().loginPage.userPasswordForm.sendKeys(Keys.ENTER);
        Assert.assertEquals(pages.get().startPageTrello.userName.getText(), "RSauto");
    }
    @Test
    public void сheckingIfTheCreateButtonIsDisplayed() throws InterruptedException {
        pages.get().chromePage.searchBoxCH.sendKeys("Trello");
        pages.get().chromePage.searchBoxCH.sendKeys(Keys.ENTER);
        pages.get().chromePage.socketSelectionInResult.click();
        pages.get().loginPage.buttonLogin.click();
        pages.get().loginPage.userEmailForm.sendKeys("rsauto2019@gmail.com");
        pages.get().loginPage.userEmailForm.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        pages.get().loginPage.userPasswordForm.sendKeys("rustaman99");
        pages.get().loginPage.userPasswordForm.sendKeys(Keys.ENTER);
        Assert.assertTrue(pages.get().startPageTrello.buttonCreated.isDisplayed());
    }
    @Test
    public void checkSearchFieldIsEnabled() throws InterruptedException {
        pages.get().chromePage.searchBoxCH.sendKeys("Trello");
        pages.get().chromePage.searchBoxCH.sendKeys(Keys.ENTER);
        pages.get().chromePage.socketSelectionInResult.click();
        pages.get().loginPage.buttonLogin.click();
        pages.get().loginPage.userEmailForm.sendKeys("rsauto2019@gmail.com");
        pages.get().loginPage.userEmailForm.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        pages.get().loginPage.userPasswordForm.sendKeys("rustaman99");
        pages.get().loginPage.userPasswordForm.sendKeys(Keys.ENTER);
        Assert.assertTrue(    pages.get().startPageTrello.searchField.isEnabled());
    }
    @Test
    public void checkBoardName() throws InterruptedException {
        pages.get().chromePage.searchBoxCH.sendKeys("Trello");
        pages.get().chromePage.searchBoxCH.sendKeys(Keys.ENTER);
        pages.get().chromePage.socketSelectionInResult.click();
        pages.get().loginPage.buttonLogin.click();
        pages.get().loginPage.userEmailForm.sendKeys("rsauto2019@gmail.com");
        pages.get().loginPage.userEmailForm.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        pages.get().loginPage.userPasswordForm.sendKeys("rustaman99");
        pages.get().loginPage.userPasswordForm.sendKeys(Keys.ENTER);
        pages.get().startPageTrello.JavaButton.click();
        Assert.assertEquals(    pages.get().workspacePage.boardName.getText(),"Java");
    }
    @Test
    public void logginTrello1() throws InterruptedException {
        pages.get().chromePage.searchBoxCH.sendKeys("Trello");
        pages.get().chromePage.searchBoxCH.sendKeys(Keys.ENTER);
        pages.get().chromePage.socketSelectionInResult.click();
        pages.get().loginPage.buttonLogin.click();
        pages.get().loginPage.userEmailForm.sendKeys("rsauto2019@gmail.com");
        pages.get().loginPage.userEmailForm.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        pages.get().loginPage.userPasswordForm.sendKeys("rustaman99");
        pages.get().loginPage.userPasswordForm.sendKeys(Keys.ENTER);
        Assert.assertEquals(    pages.get().startPageTrello.userName.getText(), "RSauto");
    }
    @Test
    public void сheckingIfTheCreateButtonIsDisplayed1() throws InterruptedException {
        pages.get().chromePage.searchBoxCH.sendKeys("Trello");
        pages.get().chromePage.searchBoxCH.sendKeys(Keys.ENTER);
        pages.get().chromePage.socketSelectionInResult.click();
        pages.get().loginPage.buttonLogin.click();
        pages.get().loginPage.userEmailForm.sendKeys("rsauto2019@gmail.com");
        pages.get().loginPage.userEmailForm.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        pages.get().loginPage.userPasswordForm.sendKeys("rustaman99");
        pages.get().loginPage.userPasswordForm.sendKeys(Keys.ENTER);
        Assert.assertTrue(    pages.get().startPageTrello.buttonCreated.isDisplayed());
    }
    @Test
    public void checkSearchFieldIsEnabled1() throws InterruptedException {
        pages.get().chromePage.searchBoxCH.sendKeys("Trello");
        pages.get().chromePage.searchBoxCH.sendKeys(Keys.ENTER);
        pages.get().chromePage.socketSelectionInResult.click();
        pages.get().loginPage.buttonLogin.click();
        pages.get().loginPage.userEmailForm.sendKeys("rsauto2019@gmail.com");
        pages.get().loginPage.userEmailForm.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        pages.get().loginPage.userPasswordForm.sendKeys("rustaman99");
        pages.get().loginPage.userPasswordForm.sendKeys(Keys.ENTER);
        Assert.assertTrue(    pages.get().startPageTrello.searchField.isEnabled());
    }
    @Test
    public void checkBoardName1() throws InterruptedException {
        pages.get().chromePage.searchBoxCH.sendKeys("Trello");
        pages.get().chromePage.searchBoxCH.sendKeys(Keys.ENTER);
        pages.get().chromePage.socketSelectionInResult.click();
        pages.get().loginPage.buttonLogin.click();
        pages.get().loginPage.userEmailForm.sendKeys("rsauto2019@gmail.com");
        pages.get().loginPage.userEmailForm.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        pages.get().loginPage.userPasswordForm.sendKeys("rustaman99");
        pages.get().loginPage.userPasswordForm.sendKeys(Keys.ENTER);
        pages.get().startPageTrello.JavaButton.click();
        Assert.assertEquals(    pages.get().workspacePage.boardName.getText(),"Java");
    }
    @Test
    public void logginTrello2() throws InterruptedException {
        pages.get().chromePage.searchBoxCH.sendKeys("Trello");
        pages.get().chromePage.searchBoxCH.sendKeys(Keys.ENTER);
        pages.get().chromePage.socketSelectionInResult.click();
        pages.get().loginPage.buttonLogin.click();
        pages.get().loginPage.userEmailForm.sendKeys("rsauto2019@gmail.com");
        pages.get().loginPage.userEmailForm.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        pages.get().loginPage.userPasswordForm.sendKeys("rustaman99");
        pages.get().loginPage.userPasswordForm.sendKeys(Keys.ENTER);
        Assert.assertEquals(    pages.get().startPageTrello.userName.getText(), "RSauto");
    }
    @Test
    public void сheckingIfTheCreateButtonIsDisplayed2() throws InterruptedException {
        pages.get().chromePage.searchBoxCH.sendKeys("Trello");
        pages.get().chromePage.searchBoxCH.sendKeys(Keys.ENTER);
        pages.get().chromePage.socketSelectionInResult.click();
        pages.get().loginPage.buttonLogin.click();
        pages.get().loginPage.userEmailForm.sendKeys("rsauto2019@gmail.com");
        pages.get().loginPage.userEmailForm.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        pages.get().loginPage.userPasswordForm.sendKeys("rustaman99");
        pages.get().loginPage.userPasswordForm.sendKeys(Keys.ENTER);
        Assert.assertTrue(    pages.get().startPageTrello.buttonCreated.isDisplayed());
    }
    @Test
    public void checkSearchFieldIsEnabled2() throws InterruptedException {
        pages.get().chromePage.searchBoxCH.sendKeys("Trello");
        pages.get().chromePage.searchBoxCH.sendKeys(Keys.ENTER);
        pages.get().chromePage.socketSelectionInResult.click();
        pages.get().loginPage.buttonLogin.click();
        pages.get().loginPage.userEmailForm.sendKeys("rsauto2019@gmail.com");
        pages.get().loginPage.userEmailForm.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        pages.get().loginPage.userPasswordForm.sendKeys("rustaman99");
        pages.get().loginPage.userPasswordForm.sendKeys(Keys.ENTER);
        Assert.assertTrue(    pages.get().startPageTrello.searchField.isEnabled());
    }
    @Test
    public void checkBoardName2() throws InterruptedException {
        pages.get().chromePage.searchBoxCH.sendKeys("Trello");
        pages.get().chromePage.searchBoxCH.sendKeys(Keys.ENTER);
        pages.get().chromePage.socketSelectionInResult.click();
        pages.get().loginPage.buttonLogin.click();
        pages.get().loginPage.userEmailForm.sendKeys("rsauto2019@gmail.com");
        pages.get().loginPage.userEmailForm.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        pages.get().loginPage.userPasswordForm.sendKeys("rustaman99");
        pages.get().loginPage.userPasswordForm.sendKeys(Keys.ENTER);
        pages.get().startPageTrello.JavaButton.click();
        Assert.assertEquals(    pages.get().workspacePage.boardName.getText(),"Java");
    }
}

