package epicenter;

import io.qameta.allure.Allure;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.AllureListener;

public class EpicenterTest extends BaseTest {

    @Owner("Ruslan ")
    @Description("Проверка входа в личный кабинет")
    @Test(description = "Проверка входа в личный кабинет")
    public void accountLogin() throws InterruptedException {
        pages.get().chromeStartPage.searchBox.sendKeys("Epicenter");
        Allure.step("click searchBox button");
        pages.get().chromeStartPage.searchBox.sendKeys(Keys.ENTER);
        pages.get().chromeStartPage.socketSelectionInResults.click();
        pages.get().homePage.loginToPersonalAccount.click();

        pages.get().homePage.userLogin.sendKeys("+380506672722");
        pages.get().homePage.userPass.sendKeys("Rustaman99!");
        Allure.step("click loginButton");
        pages.get().homePage.loginButton.click();
        pages.get().waitingUtils.wait5Seconds(pages.get().homePage.nameUser).click();
        Assert.assertEquals(pages.get().homePage.inscriptionMyOffice.getText(), "Мій кабінет");


    }

    @Test(description = "Проверка входа в личный кабинет")
    public void accountLoginf() throws InterruptedException {
        pages.get().chromeStartPage.searchBox.sendKeys("Epicenter");
        pages.get().chromeStartPage.searchBox.sendKeys(Keys.ENTER);
        pages.get().chromeStartPage.socketSelectionInResults.click();
        pages.get().homePage.loginToPersonalAccount.click();
        pages.get().homePage.userLogin.sendKeys("+380506672722");
        pages.get().homePage.userPass.sendKeys("Rustaman99!");
        pages.get().homePage.loginButton.click();
        pages.get().waitingUtils.wait5Seconds(pages.get().homePage.nameUser).click();
        Assert.assertEquals(pages.get().homePage.inscriptionMyOffice.getText(), "Мій кабінет");
        AllureListener.saveTextLog("Error");

    }

    @Test(description = "Проверка входа в личный кабинет")
    public void accountLogin1() throws InterruptedException {
        pages.get().chromeStartPage.searchBox.sendKeys("Epicenter");
        pages.get().chromeStartPage.searchBox.sendKeys(Keys.ENTER);
        pages.get().chromeStartPage.socketSelectionInResults.click();
        pages.get().homePage.loginToPersonalAccount.click();
        pages.get().homePage.userLogin.sendKeys("+380506672722");
        pages.get().homePage.userPass.sendKeys("Rustaman99!");
        pages.get().homePage.loginButton.click();
        pages.get().waitingUtils.wait5Seconds(pages.get().homePage.nameUser).click();
        Assert.assertEquals(pages.get().homePage.inscriptionMyOffice.getText(), "Мій кабінет");
        AllureListener.saveTextLog("Error");
    }

    @Test(description = "Проверка входа в личный кабинет")
    public void accountLogin2() throws InterruptedException {
        pages.get().chromeStartPage.searchBox.sendKeys("Epicenter");
        pages.get().chromeStartPage.searchBox.sendKeys(Keys.ENTER);
        pages.get().chromeStartPage.socketSelectionInResults.click();
        pages.get().homePage.loginToPersonalAccount.click();
        pages.get().homePage.userLogin.sendKeys("+380506672722");
        pages.get().homePage.userPass.sendKeys("Rustaman99!");
        pages.get().homePage.loginButton.click();
        pages.get().waitingUtils.wait5Seconds(pages.get().homePage.nameUser).click();
        Assert.assertEquals(pages.get().homePage.inscriptionMyOffice.getText(), "Мій кабінет");
        AllureListener.saveTextLog("Error");
    }

    @Test(description = "Проверка входа в личный кабинет")
    public void accountLogin3() throws InterruptedException {
        pages.get().chromeStartPage.searchBox.sendKeys("Epicenter");
        pages.get().chromeStartPage.searchBox.sendKeys(Keys.ENTER);
        pages.get().chromeStartPage.socketSelectionInResults.click();
        pages.get().homePage.loginToPersonalAccount.click();
        pages.get().homePage.userLogin.sendKeys("+380506672722");
        pages.get().homePage.userPass.sendKeys("Rustaman99!");
        pages.get().homePage.loginButton.click();
        pages.get().waitingUtils.wait5Seconds(pages.get().homePage.nameUser).click();
        Assert.assertEquals(pages.get().homePage.inscriptionMyOffice.getText(), "Мій кабінет");
        AllureListener.saveTextLog("Error");
    }

    @Test(description = "Проверка входа в личный кабинет")
    public void accountLogin4() throws InterruptedException {
        pages.get().chromeStartPage.searchBox.sendKeys("Epicenter");
        pages.get().chromeStartPage.searchBox.sendKeys(Keys.ENTER);
        pages.get().chromeStartPage.socketSelectionInResults.click();
        pages.get().homePage.loginToPersonalAccount.click();
        pages.get().homePage.userLogin.sendKeys("+380506672722");
        pages.get().homePage.userPass.sendKeys("Rustaman99!");
        pages.get().homePage.loginButton.click();
        pages.get().waitingUtils.wait5Seconds(pages.get().homePage.nameUser).click();
        Assert.assertEquals(pages.get().homePage.inscriptionMyOffice.getText(), "Мій кабінет");
        AllureListener.saveTextLog("Error");
    }

    @Test(description = "Проверка входа в личный кабинет")
    public void accountLogin5() throws InterruptedException {
        pages.get().chromeStartPage.searchBox.sendKeys("Epicenter");
        pages.get().chromeStartPage.searchBox.sendKeys(Keys.ENTER);
        pages.get().chromeStartPage.socketSelectionInResults.click();
        pages.get().homePage.loginToPersonalAccount.click();
        pages.get().homePage.userLogin.sendKeys("+380506672722");
        pages.get().homePage.userPass.sendKeys("Rustaman99!");
        pages.get().homePage.loginButton.click();
        pages.get().waitingUtils.wait5Seconds(pages.get().homePage.nameUser).click();
        Assert.assertEquals(pages.get().homePage.inscriptionMyOffice.getText(), "Мій кабінет");
        AllureListener.saveTextLog("Error");
    }

    @Test(description = "Проверка входа в личный кабинет")
    public void accountLogin6() throws InterruptedException {
        pages.get().chromeStartPage.searchBox.sendKeys("Epicenter");
        pages.get().chromeStartPage.searchBox.sendKeys(Keys.ENTER);
        pages.get().chromeStartPage.socketSelectionInResults.click();
        pages.get().homePage.loginToPersonalAccount.click();
        pages.get().homePage.userLogin.sendKeys("+380506672722");
        pages.get().homePage.userPass.sendKeys("Rustaman99!");
        pages.get().homePage.loginButton.click();
        pages.get().waitingUtils.wait5Seconds(pages.get().homePage.nameUser).click();
        Assert.assertEquals(pages.get().homePage.inscriptionMyOffice.getText(), "Мій кабінет");
        AllureListener.saveTextLog("Error");
    }

    @Test(description = "Проверка входа в личный кабинет")
    public void accountLogin7() throws InterruptedException {
        pages.get().chromeStartPage.searchBox.sendKeys("Epicenter");
        pages.get().chromeStartPage.searchBox.sendKeys(Keys.ENTER);
        pages.get().chromeStartPage.socketSelectionInResults.click();
        pages.get().homePage.loginToPersonalAccount.click();
        pages.get().homePage.userLogin.sendKeys("+380506672722");
        pages.get().homePage.userPass.sendKeys("Rustaman99!");
        pages.get().homePage.loginButton.click();
        pages.get().waitingUtils.wait5Seconds(pages.get().homePage.nameUser).click();
        Assert.assertEquals(pages.get().homePage.inscriptionMyOffice.getText(), "Мій кабінет");
        AllureListener.saveTextLog("Error");
    }

    @Test(description = "Проверка входа в личный кабинет")
    public void accountLogin8() throws InterruptedException {
        pages.get().chromeStartPage.searchBox.sendKeys("Epicenter");
        pages.get().chromeStartPage.searchBox.sendKeys(Keys.ENTER);
        pages.get().chromeStartPage.socketSelectionInResults.click();
        pages.get().homePage.loginToPersonalAccount.click();
        pages.get().homePage.userLogin.sendKeys("+380506672722");
        pages.get().homePage.userPass.sendKeys("Rustaman99!");
        pages.get().homePage.loginButton.click();
        pages.get().waitingUtils.wait5Seconds(pages.get().homePage.nameUser).click();
        Assert.assertEquals(pages.get().homePage.inscriptionMyOffice.getText(), "Мій кабінет");
        AllureListener.saveTextLog("Error");
    }
    @Test(description = "Проверка входа в личный кабинет")
    public void accountLogin9() throws InterruptedException {
        pages.get().chromeStartPage.searchBox.sendKeys("Epicenter");
        pages.get().chromeStartPage.searchBox.sendKeys(Keys.ENTER);
        pages.get().chromeStartPage.socketSelectionInResults.click();
        pages.get().homePage.loginToPersonalAccount.click();
        pages.get().homePage.userLogin.sendKeys("+380506672722");
        pages.get().homePage.userPass.sendKeys("Rustaman99!");
        pages.get().homePage.loginButton.click();
        pages.get().waitingUtils.wait5Seconds(pages.get().homePage.nameUser).click();
        Assert.assertEquals(pages.get().homePage.inscriptionMyOffice.getText(), "Мій кабінет");
        AllureListener.saveTextLog("Error");
    }
    @Test(description = "Проверка входа в личный кабинет")
    public void accountLogin10() throws InterruptedException {
        pages.get().chromeStartPage.searchBox.sendKeys("Epicenter");
        pages.get().chromeStartPage.searchBox.sendKeys(Keys.ENTER);
        pages.get().chromeStartPage.socketSelectionInResults.click();
        pages.get().homePage.loginToPersonalAccount.click();
        pages.get().homePage.userLogin.sendKeys("+380506672722");
        pages.get().homePage.userPass.sendKeys("Rustaman99!");
        pages.get().homePage.loginButton.click();
        pages.get().waitingUtils.wait5Seconds(pages.get().homePage.nameUser).click();
        Assert.assertEquals(pages.get().homePage.inscriptionMyOffice.getText(), "Мій кабінет");
        AllureListener.saveTextLog("Error");
    }
}