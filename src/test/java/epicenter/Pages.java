package epicenter;

import epicenterPage.ChromeStartPage;
import epicenterPage.HomePage;
import epicenterPage.MacbookAirPage;
import epicenterPage.MobilPhonePage;
import trelloPage.*;
import utils.WaitingUtils;

import static utils.DriverManager.getDriver;

public class Pages {

    HomePage homePage;
    WaitingUtils waitingUtils;
    ChromeStartPage chromeStartPage;
    MobilPhonePage mobilPhonePage;
    MacbookAirPage macbookAirPage;
    public ChromePage chromePage;
   public BasePageTrello basePageTrello;
    public LoginPage loginPage;
   public StartPageTrello startPageTrello;
   public WorkspacePage workspacePage;

    public Pages() {
        homePage = new HomePage( getDriver());
        waitingUtils = new WaitingUtils( getDriver());
        chromeStartPage = new ChromeStartPage( getDriver());
        mobilPhonePage = new MobilPhonePage( getDriver());
        macbookAirPage = new MacbookAirPage( getDriver());
        basePageTrello=new BasePageTrello(getDriver());
        chromePage=new ChromePage(getDriver());
        loginPage=new LoginPage(getDriver());
        startPageTrello=new StartPageTrello(getDriver());
        workspacePage=new WorkspacePage(getDriver());
    }
}

//public class PagesTrello {

//
//    public PagesTrello() {
//
//    }
//}
