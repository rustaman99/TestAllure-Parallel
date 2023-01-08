package epicenter;

import io.qameta.allure.Allure;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.AllureListener;

import static utils.DriverManager.getDriver;

public class EpicenterTest extends BaseEpicenterTest {
 @Owner("Ruslan ")
 @Description("Проверка входа в личный кабинет")
    @Test(description = "Проверка входа в личный кабинет")
    public void accountLogin() throws InterruptedException {
        chromeStartPage.searchBox.sendKeys("Epicenter");
        Allure.step("click searchBox button");
        chromeStartPage.searchBox.sendKeys(Keys.ENTER);
        chromeStartPage.socketSelectionInResults.click();
        homePage.loginToPersonalAccount.click();

        homePage.userLogin.sendKeys("+380506672722");
        homePage.userPass.sendKeys("Rustaman99!");
        Allure.step("click loginButton");
        homePage.loginButton.click();
        waitingUtils.wait5Seconds(homePage.nameUser).click();
        Assert.assertEquals(homePage.inscriptionMyOffice.getText(), "Мій кабінет");



       }
    @Test(description = "Проверка входа в личный кабинет")
    public void accountLoginf() throws InterruptedException {
        chromeStartPage.searchBox.sendKeys("Epicenter");
        chromeStartPage.searchBox.sendKeys(Keys.ENTER);
        chromeStartPage.socketSelectionInResults.click();
        homePage.loginToPersonalAccount.click();
        homePage.userLogin.sendKeys("+380506672722");
        homePage.userPass.sendKeys("Rustaman99!");
        homePage.loginButton.click();
        waitingUtils.wait5Seconds(homePage.nameUser).click();
        Assert.assertEquals(homePage.inscriptionMyOffice.getText(), "Мій кабінет");
        AllureListener.saveTextLog("Error");

    }
    }
