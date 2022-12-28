package ObjectsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Phones')]")
    private WebElement phonesBx;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Laptops')]")
    private WebElement laptopsBx;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Monitors')]")
    private WebElement monitorsBx;

    @FindAll({@FindBy(how = How.XPATH, using = "//a[contains(text(),'Samsung galaxy s6')]"),
            @FindBy(how = How.XPATH, using = "(//a[@class='hrefch'])[1]")})
    private WebElement samsungS6Lnk;

    @FindBy(how = How.XPATH, using = "(//a[@class='hrefch'])[2]")
    private WebElement nokiaLnk;

    @FindBy(how = How.XPATH, using = "(//a[@class='hrefch'])[3]")
    private WebElement nexusLnk;

    @FindBy(how = How.XPATH, using = "(//a[@class='hrefch'])[4]")
    private WebElement galaxyS7Lnk;

    @FindBy(how = How.XPATH, using = "(//a[@class='hrefch'])[5]")
    private WebElement iphone6Lnk;

    @FindBy(how = How.XPATH, using = "(//a[@class='hrefch'])[6]")
    private WebElement xperiaLnk;

    @FindBy(how = How.XPATH, using = "(//a[@class='hrefch'])[7]")
    private WebElement htcOneLnk;

    @FindBy(how = How.XPATH, using = "(//a[@class='hrefch'])[8]")
    private WebElement vaio_i5Lnk;

    @FindBy(how = How.XPATH, using = "(//a[@class='hrefch'])[9]")
    private WebElement vaio_i7Lnk;

    @FindBy(how = How.XPATH, using = "(//a[@class='nav-link'])")
    private WebElement homePg;



    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getPhonesBx() {
        return phonesBx;
    }

    public WebElement getLaptopsBx() {
        return laptopsBx;
    }

    public WebElement getMonitorsBx() {
        return monitorsBx;
    }

    public WebElement getSamsungS6Lnk() {
        return samsungS6Lnk;
    }

    public WebElement getGalaxyS7Lnk() {
        return galaxyS7Lnk;
    }

    public WebElement getHtcOneLnk() {
        return htcOneLnk;
    }

    public WebElement getIphone6Lnk() {
        return iphone6Lnk;
    }

    public WebElement getNexusLnk() {
        return nexusLnk;
    }

    public WebElement getNokiaLnk() {
        return nokiaLnk;
    }

    public WebElement getVaio_i5Lnk() {
        return vaio_i5Lnk;
    }

    public WebElement getVaio_i7Lnk() {
        return vaio_i7Lnk;
    }

    public WebElement getXperiaLnk() {
        return xperiaLnk;
    }

    public WebElement getHomePg() {
        return homePg;
    }
}