package ObjectsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CartPage extends BasePage {

    public CartPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(how = How.ID, using = "cartur")
    private WebElement cartPg;

    @FindBy(how = How.ID, using ="tbodyid")
    private WebElement itemBX;

    @FindBy(how = How.XPATH, using = "//tbody[@id='tbodyid']/tr[1]/td[2]")
    private WebElement firstProdName;

    @FindBy(how = How.XPATH, using = "//tbody[@id='tbodyid']/tr[1]/td[3]")
    private WebElement FirstProdPrice;

    @FindBy(how = How.XPATH, using = "//img[@src='imgs/galaxy_s6.jpg' or @src='imgs/Lumia_1520.jpg'" +
            "or @src='imgs/Nexus_6.jpg' or @src='imgs/iphone_6.jpg' or @src='imgs/xperia_z5.jpg'" +
            "or @src='imgs/HTC_M9.jpg' or @src='imgs/sony_vaio_5.jpg' or @src='imgs/macbook_air.jpg'" +
            "or @src='imgs/dell.jpg' or @src='imgs/apple_cinema.jpg' or @src='imgs/asusm.jpg']")
    private WebElement firstProdImage;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Delete')]")
    private WebElement deleteProdLnk;

    @FindBy(how = How.ID, using = "totalp")
    private WebElement totalTxt;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-success']")
    private WebElement orderButton;

    public WebElement getCartPg(){
        return cartPg;
    }

    public WebElement getItemBX(){
        return itemBX;
    }

    public WebElement getFirstProdImage() {
        return firstProdImage;
    }

    public WebElement getFirstProdName() {
        return firstProdName;
    }

    public WebElement getFirstProdPrice() {
        return FirstProdPrice;
    }

    public WebElement getDeleteProdLnk() {
        return deleteProdLnk;
    }

    public WebElement getTotalTxt() {
        return totalTxt;
    }
    public WebElement getOrderButton(){
        return orderButton;
    }
}
