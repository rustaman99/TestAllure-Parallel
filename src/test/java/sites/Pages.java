package sites;

import pages.epicenterPage.HomePage;
import pages.epicenterPage.MacbookAirPage;
import pages.epicenterPage.MobilPhonePage;
import pages.trelloPage.ListElementsOfWorkspacePage;
import pages.trelloPage.LoginPage;
import pages.trelloPage.StartPageTrello;
import pages.trelloPage.WorkspacePage;
import utils.WaitingUtils;

import static utils.DriverManager.getDriver;

public class Pages {

   public HomePage homePage;
    public WaitingUtils waitingUtils;
    public MobilPhonePage mobilPhonePage;
    public MacbookAirPage macbookAirPage;
    public LoginPage loginPage;
    public StartPageTrello startPageTrello;
    public WorkspacePage workspacePage;
    public ListElementsOfWorkspacePage listElementsOfWorkspacePage;

    public Pages() {
        homePage = new HomePage( getDriver());
        waitingUtils = new WaitingUtils( getDriver());
        mobilPhonePage = new MobilPhonePage( getDriver());
        macbookAirPage = new MacbookAirPage( getDriver());
        loginPage=new LoginPage(getDriver());
        startPageTrello=new StartPageTrello(getDriver());
        workspacePage=new WorkspacePage(getDriver());
        listElementsOfWorkspacePage=new ListElementsOfWorkspacePage(getDriver());
    }
}

