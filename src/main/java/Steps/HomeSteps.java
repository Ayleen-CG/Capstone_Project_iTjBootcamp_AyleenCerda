package Steps;

import ObjectsPages.HomePage;
import ObjectsPages.ProductPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomeSteps extends BaseSteps{
    public HomeSteps(WebDriver webDriver) {
        super(webDriver);
    }
    HomePage homePage = PageFactory.initElements(webDriver, HomePage.class);
    ProductPage productPage = PageFactory.initElements(webDriver, ProductPage.class);
    public void GotoHome() throws InterruptedException {
        Thread.sleep(1000);
        homePage.getHomePg().click();
    }
    public void CheckCategoriesAreDisplayed() {
        String url = webDriver.getCurrentUrl();
        String view = "Home view";
        CustomAssertions.isElementDisplayed(homePage.getPhonesBx().isDisplayed(), url, view);
        CustomAssertions.isElementDisplayed(homePage.getMonitorsBx().isDisplayed(),url,view);
        CustomAssertions.isElementDisplayed(homePage.getLaptopsBx().isDisplayed(),url,view);
    }

    public void SelectMainPageProduct(String DesiredDevice){
        switch (DesiredDevice){
            case "Galaxy S6":
                homePage.getSamsungS6Lnk().click();
                break;
            case "Nokia Lumia":
                homePage.getNokiaLnk().click();
                break;
            case "Nexus":
                homePage.getNexusLnk().click();
                break;
            case "Galaxy s7":
                homePage.getGalaxyS7Lnk().click();
                break;
            case "iphone6":
                homePage.getIphone6Lnk().click();
                break;
            case "xperia":
                homePage.getXperiaLnk().click();
                break;
            case "htc One":
                homePage.getHtcOneLnk().click();
                break;
            case "Sony vaio i5":
                homePage.getVaio_i5Lnk().click();
                break;
            case  "Sony vaio i7":
                homePage.getVaio_i7Lnk().click();
                break;

        }


    }

}

