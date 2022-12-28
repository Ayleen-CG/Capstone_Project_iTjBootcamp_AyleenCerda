package Steps;
import ObjectsPages.CartPage;
import ObjectsPages.HomePage;
import ObjectsPages.ProductPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class CartSteps extends BaseSteps {
    public CartSteps(WebDriver webDriver) {
        super(webDriver);
    }
    HomePage homePage = PageFactory.initElements(webDriver, HomePage.class);
    ProductPage productPage = PageFactory.initElements(webDriver, ProductPage.class);
    CartPage cartPage = PageFactory.initElements(webDriver, CartPage.class);

    public void ValidateCartDisplayFirstProductDetails() throws InterruptedException {
        cartPage.getCartPg().click();
        cartPage.getItemBX();
        String url = webDriver.getCurrentUrl();
        String view = "Cart view";
        Thread.sleep(2000);
        CustomAssertions.isElementDisplayed(cartPage.getItemBX().isDisplayed(), url, view);
        CustomAssertions.isElementDisplayed(cartPage.getDeleteProdLnk().isDisplayed(),url,view);
        CustomAssertions.isElementDisplayed(cartPage.getFirstProdImage().isDisplayed(),url,view);
        CustomAssertions.isElementDisplayed(cartPage.getFirstProdPrice().isDisplayed(),url,view);
        CustomAssertions.isElementDisplayed(cartPage.getFirstProdName().isDisplayed(),url,view);


    }
    public void ValidateTotalPriceAndOrderButton(){
        String url = webDriver.getCurrentUrl();
        String view = "Cart view";
        CustomAssertions.isElementDisplayed(cartPage.getTotalTxt().isDisplayed(),url,view);
        String TotalCost = cartPage.getTotalTxt().getText();
        System.out.println("Total cost: "+TotalCost);
        CustomAssertions.isElementDisplayed(cartPage.getOrderButton().isDisplayed(),url,view);

    }

    public void MakeOrder(){
        cartPage.getOrderButton().click();
    }

}
