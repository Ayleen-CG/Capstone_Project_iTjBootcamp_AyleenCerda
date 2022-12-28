package Steps;

import ObjectsPages.ProductPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

import java.time.Duration;

public class ProductSteps extends BaseSteps{
    public ProductSteps (WebDriver webDriver) {
        super(webDriver);
    }
    ProductPage productPage = PageFactory.initElements(webDriver, ProductPage.class);

    public void CheckProductElementsDisplayed() throws InterruptedException {
        String url = webDriver.getCurrentUrl();
        String view = "Product view";
        Thread.sleep(2000);
        CustomAssertions.isElementDisplayed(productPage.getProductImg().isDisplayed(), url, view);
        CustomAssertions.isElementDisplayed(productPage.getProductNameTxt().isDisplayed(),url,view);
        CustomAssertions.isElementDisplayed(productPage.getPriceTxt().isDisplayed(),url,view);
        CustomAssertions.isElementDisplayed(productPage.getProductNameTxt().isDisplayed(),url,view);
        CustomAssertions.isElementDisplayed(productPage.getProductDescTxt().isDisplayed(),url,view);
        CustomAssertions.isElementDisplayed(productPage.getAddCartBtn().isDisplayed(),url,view);

    }

    public void ManageShoppingCartAlert() throws InterruptedException{
        productPage.getAddCartBtn().click();
        Thread.sleep(2000);
        String AlertText = webDriver.switchTo().alert().getText();
        System.out.println(AlertText);
        webDriver.switchTo().alert().accept();
    }

}
