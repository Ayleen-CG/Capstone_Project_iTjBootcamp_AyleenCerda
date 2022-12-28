package ObjectsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver webDriver) {
        super(webDriver);
    }

    //Utilizing XPATH OPERATOR (OR) example = .//span[@class='title'])[2] or .//span[@class='title']
    @FindBy(how = How.XPATH, using = "//img[@src='imgs/galaxy_s6.jpg' or @src='imgs/Lumia_1520.jpg' or " +
            "@src='imgs/Nexus_6.jpg' or @src='imgs/iphone_6.jpg' or @src='imgs/xperia_z5.jpg' or " +
            "@src='imgs/HTC_M9.jpg' or @src='imgs/sony_vaio_5.jpg' or @src='imgs/macbook_air.jpg' or " +
            "@src='imgs/dell.jpg' or @src='imgs/apple_cinema.jpg' or @src='imgs/asusm.jpg']")
    private WebElement productImg;

    @FindBy(how = How.XPATH, using = "//h3[@class='price-container']")
    private WebElement priceTxt;

    @FindBy(how = How.XPATH, using = "//h2[@class='name']")
    private WebElement productNameTxt;

    @FindBy(how = How.XPATH, using = "//strong[contains(text(),'Product description')]")
    private WebElement productDescTxt;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Add to cart')]")
    private WebElement addCartBtn;

    public WebElement getProductImg() {return productImg;}
    public WebElement getPriceTxt() {return priceTxt;}

    public WebElement getProductNameTxt() {
        return productNameTxt;
    }

    public WebElement getProductDescTxt() {
        return productDescTxt;
    }

    public WebElement getAddCartBtn() {
        return addCartBtn;
    }

}

