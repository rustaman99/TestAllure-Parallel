package epicenter;

import epicenterPage.ChromeStartPage;
import epicenterPage.HomePage;
import epicenterPage.MacbookAirPage;
import epicenterPage.MobilPhonePage;
import utils.WaitingUtils;

import static utils.DriverManager.getDriver;

public class Pages {

    HomePage homePage;
    WaitingUtils waitingUtils;
    ChromeStartPage chromeStartPage;
    MobilPhonePage mobilPhonePage;
    MacbookAirPage macbookAirPage;

    public Pages() {
        homePage = new HomePage( getDriver());
        waitingUtils = new WaitingUtils( getDriver());
        chromeStartPage = new ChromeStartPage( getDriver());
        mobilPhonePage = new MobilPhonePage( getDriver());
        macbookAirPage = new MacbookAirPage( getDriver());
    }
}
