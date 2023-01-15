package sites.epicenter;

import io.qameta.allure.Allure;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;
import sites.BaseTest;
import utils.AllureListener;

import static utils.DriverManager.getDriver;

public class EpicenterTest extends BaseTest {

    @Owner("Ruslan ")
    @Description("Проверка входа в личный кабинет")
    @Test(description = "Проверка входа в личный кабинет")
    public void accountLogin() throws InterruptedException {
        getDriver().get("https://epicentrk.ua/");
        pages.get().homePage.loginToPersonalAccount.click();
        pages.get().homePage.userLogin.sendKeys("+380506672722");
        pages.get().homePage.userPass.sendKeys("Rustaman99!");
        Allure.step("click loginButton");
        pages.get().homePage.loginButton.click();
        pages.get().waitingUtils.waitElementToBeClickable(pages.get().homePage.nameUser).click();
        Assert.assertEquals(pages.get().homePage.inscriptionMyOffice.getText(), "Мій кабінет");


    }

    @Test(description = "Проверка входа в личный кабинет")
    public void accountLoginf() throws InterruptedException {
        getDriver().get("https://epicentrk.ua/");
        pages.get().homePage.loginToPersonalAccount.click();
        pages.get().homePage.userLogin.sendKeys("+380506672722");
        pages.get().homePage.userPass.sendKeys("Rustaman99!");
        pages.get().homePage.loginButton.click();
        pages.get().waitingUtils.waitElementToBeClickable(pages.get().homePage.nameUser).click();
        Assert.assertEquals(pages.get().homePage.inscriptionMyOffice.getText(), "Мій кабінет");
        AllureListener.saveTextLog("Error");

    }

    @Test(description = "Проверка входа в личный кабинет")
    public void accountLogin1() throws InterruptedException {
        getDriver().get("https://epicentrk.ua/");
        pages.get().homePage.loginToPersonalAccount.click();
        pages.get().homePage.userLogin.sendKeys("+380506672722");
        pages.get().homePage.userPass.sendKeys("Rustaman99!");
        pages.get().homePage.loginButton.click();
        pages.get().waitingUtils.waitElementToBeClickable(pages.get().homePage.nameUser).click();
        Assert.assertEquals(pages.get().homePage.inscriptionMyOffice.getText(), "Мій кабінет");
        AllureListener.saveTextLog("Error");
    }

    @Test(description = "Проверка входа в личный кабинет")
    public void accountLogin2() throws InterruptedException {
        getDriver().get("https://epicentrk.ua/");
        pages.get().homePage.loginToPersonalAccount.click();
        pages.get().homePage.userLogin.sendKeys("+380506672722");
        pages.get().homePage.userPass.sendKeys("Rustaman99!");
        pages.get().homePage.loginButton.click();
        pages.get().waitingUtils.waitElementToBeClickable(pages.get().homePage.nameUser).click();
        Assert.assertEquals(pages.get().homePage.inscriptionMyOffice.getText(), "Мій кабінет");
        AllureListener.saveTextLog("Error");
    }

    @Test(description = "Проверка входа в личный кабинет")
    public void accountLogin3() throws InterruptedException {
        getDriver().get("https://epicentrk.ua/");
        pages.get().homePage.loginToPersonalAccount.click();
        pages.get().homePage.userLogin.sendKeys("+380506672722");
        pages.get().homePage.userPass.sendKeys("Rustaman99!");
        pages.get().homePage.loginButton.click();
        pages.get().waitingUtils.waitElementToBeClickable(pages.get().homePage.nameUser).click();
        Assert.assertEquals(pages.get().homePage.inscriptionMyOffice.getText(), "Мій кабінет");
        AllureListener.saveTextLog("Error");
    }

    @Test(description = "Проверка входа в личный кабинет")
    public void accountLogin4() throws InterruptedException {
        getDriver().get("https://epicentrk.ua/");
        pages.get().homePage.loginToPersonalAccount.click();
        pages.get().homePage.userLogin.sendKeys("+380506672722");
        pages.get().homePage.userPass.sendKeys("Rustaman99!");
        pages.get().homePage.loginButton.click();
        pages.get().waitingUtils.waitElementToBeClickable(pages.get().homePage.nameUser).click();
        Assert.assertEquals(pages.get().homePage.inscriptionMyOffice.getText(), "Мій кабінет");
        AllureListener.saveTextLog("Error");
    }

    @Test(description = "Проверка входа в личный кабинет")
    public void accountLogin5() throws InterruptedException {
        getDriver().get("https://epicentrk.ua/");
        pages.get().homePage.loginToPersonalAccount.click();
        pages.get().homePage.userLogin.sendKeys("+380506672722");
        pages.get().homePage.userPass.sendKeys("Rustaman99!");
        pages.get().homePage.loginButton.click();
        pages.get().waitingUtils.waitElementToBeClickable(pages.get().homePage.nameUser).click();
        Assert.assertEquals(pages.get().homePage.inscriptionMyOffice.getText(), "Мій кабінет");
        AllureListener.saveTextLog("Error");
    }

    @Test(description = "Проверка входа в личный кабинет")
    public void accountLogin6() throws InterruptedException {
        getDriver().get("https://epicentrk.ua/");
        pages.get().homePage.loginToPersonalAccount.click();
        pages.get().homePage.userLogin.sendKeys("+380506672722");
        pages.get().homePage.userPass.sendKeys("Rustaman99!");
        pages.get().homePage.loginButton.click();
        pages.get().waitingUtils.waitElementToBeClickable(pages.get().homePage.nameUser).click();
        Assert.assertEquals(pages.get().homePage.inscriptionMyOffice.getText(), "Мій кабінет");
        AllureListener.saveTextLog("Error");
    }

    @Test(description = "Проверка входа в личный кабинет")
    public void accountLogin7() throws InterruptedException {
        getDriver().get("https://epicentrk.ua/");
        pages.get().homePage.loginToPersonalAccount.click();
        pages.get().homePage.userLogin.sendKeys("+380506672722");
        pages.get().homePage.userPass.sendKeys("Rustaman99!");
        pages.get().homePage.loginButton.click();
        pages.get().waitingUtils.waitElementToBeClickable(pages.get().homePage.nameUser).click();
        Assert.assertEquals(pages.get().homePage.inscriptionMyOffice.getText(), "Мій кабінет");
        AllureListener.saveTextLog("Error");
    }

    @Test(description = "Проверка входа в личный кабинет")
    public void accountLogin8() throws InterruptedException {
        getDriver().get("https://epicentrk.ua/");
        pages.get().homePage.loginToPersonalAccount.click();
        pages.get().homePage.userLogin.sendKeys("+380506672722");
        pages.get().homePage.userPass.sendKeys("Rustaman99!");
        pages.get().homePage.loginButton.click();
        pages.get().waitingUtils.waitElementToBeClickable(pages.get().homePage.nameUser).click();
        Assert.assertEquals(pages.get().homePage.inscriptionMyOffice.getText(), "Мій кабінет");
        AllureListener.saveTextLog("Error");
    }
    @Test(description = "Проверка входа в личный кабинет")
    public void accountLogin9() throws InterruptedException {
        getDriver().get("https://epicentrk.ua/");
        pages.get().homePage.loginToPersonalAccount.click();
        pages.get().homePage.userLogin.sendKeys("+380506672722");
        pages.get().homePage.userPass.sendKeys("Rustaman99!");
        pages.get().homePage.loginButton.click();
        pages.get().waitingUtils.waitElementToBeClickable(pages.get().homePage.nameUser).click();
        Assert.assertEquals(pages.get().homePage.inscriptionMyOffice.getText(), "Мій кабінет");
        AllureListener.saveTextLog("Error");
    }
    @Test(description = "Проверка входа в личный кабинет")
    public void accountLogin10() throws InterruptedException {
        getDriver().get("https://epicentrk.ua/");
        pages.get().homePage.loginToPersonalAccount.click();
        pages.get().homePage.userLogin.sendKeys("+380506672722");
        pages.get().homePage.userPass.sendKeys("Rustaman99!");
        pages.get().homePage.loginButton.click();
        pages.get().waitingUtils.waitElementToBeClickable(pages.get().homePage.nameUser).click();
        Assert.assertEquals(pages.get().homePage.inscriptionMyOffice.getText(), "Мій кабінет");
        AllureListener.saveTextLog("Error");
    }
}
