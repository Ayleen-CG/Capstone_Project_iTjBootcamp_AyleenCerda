import Steps.HomeSteps;
import Steps.ProductSteps;
import Steps.CartSteps;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Wait;

//Here is where all tests are written. All tests will be contained in this class
public class MainStoreTests extends BaseTest {
    HomeSteps homeSteps = new HomeSteps(_driver);
    ProductSteps productSteps = new ProductSteps(_driver);
    CartSteps cartSteps = new CartSteps(_driver);

    @Test (description = "Tests Categories elements are displayed", priority = 1)
    public void TestCategoriesDisplayed()  {
        homeSteps.CheckCategoriesAreDisplayed();
    }

    @Test (description = "Tests Product information is displayed", priority = 2)
    public void TestProductDisplay() throws InterruptedException {
        homeSteps.GotoHome();
        homeSteps.CheckCategoriesAreDisplayed();
        Thread.sleep(1000);
        homeSteps.SelectMainPageProduct("Nokia Lumia");
        Thread.sleep(1000);
        productSteps.CheckProductElementsDisplayed();
    }

    @Test (description = "Test checks browser shopping cart alert", priority = 3)
    public void TestShoppingBrowserAlert() throws InterruptedException {
        homeSteps.GotoHome();
        Thread.sleep(1000);
        homeSteps.SelectMainPageProduct("Galaxy S6");
        Thread.sleep(1000);
        productSteps.CheckProductElementsDisplayed();
        productSteps.ManageShoppingCartAlert();
    }

    @Test (description = "Test checks shopping cart content", priority = 4)
    public void TestShoppingCartContent() throws InterruptedException {
        homeSteps.GotoHome();
        Thread.sleep(1000);
        homeSteps.SelectMainPageProduct("Galaxy S6");
        Thread.sleep(1000);
        productSteps.CheckProductElementsDisplayed();
        productSteps.ManageShoppingCartAlert();
        cartSteps.ValidateCartDisplayFirstProductDetails();
        cartSteps.ValidateTotalPriceAndOrderButton();
        cartSteps.MakeOrder();
    }


}