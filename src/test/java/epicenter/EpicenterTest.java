package epicenter;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;


public class EpicenterTest extends BaseEpicenterTest {

    @Test(description = "Проверка входа в личный кабинет")
    public void accountLogin() throws InterruptedException {
        driver.get("https://www.google.com.ua/");
        chromeStartPage.searchBox.sendKeys("Epicenter");
        chromeStartPage.searchBox.sendKeys(Keys.ENTER);
        chromeStartPage.socketSelectionInResults.click();
        homePage.loginToPersonalAccount.click();
        homePage.userLogin.sendKeys("+380506672722");
        homePage.userPass.sendKeys("Rustaman99!");
        homePage.loginButton.click();
        waitingUtils.wait5Seconds(homePage.nameUser).click();
        Assert.assertEquals(homePage.inscriptionMyOffice.getText(), "Мій кабінет");
       log.info("Текст информации");
       log.warn("error");

    }
    @Test(description = "Проверка входа в личный кабинет")
    public void accountLoginf() throws InterruptedException {
        driver.get("https://www.google.com.ua/");
        chromeStartPage.searchBox.sendKeys("Epicenter");
        chromeStartPage.searchBox.sendKeys(Keys.ENTER);
        chromeStartPage.socketSelectionInResults.click();
        homePage.loginToPersonalAccount.click();
        homePage.userLogin.sendKeys("+380506672722");
        homePage.userPass.sendKeys("Rustaman99");
        homePage.loginButton.click();
        waitingUtils.wait5Seconds(homePage.nameUser).click();
        Assert.assertEquals(homePage.inscriptionMyOffice.getText(), "Мій кабінет");
        log.info("Текст информации");
        log.warn("error");

     }
    }
