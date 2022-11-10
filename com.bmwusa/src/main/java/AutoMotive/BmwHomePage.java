package AutoMotive;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BmwHomePage extends BasePage {



    public BmwHomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/nav[1]/ul[1]/li[1]/button[1]/span[1]")

    public WebElement Models;



    @FindBy(xpath = "//a[contains(text(),'Shop Inventory')]")
    public WebElement ShopInventory;

    @FindBy(xpath = "//input[@id='zip-input-cpo']")
    public WebElement ZipCodeBox;
@FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]")
public WebElement ShopNewBar;
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[7]/div[1]/a[2]")

    public WebElement SeeDetail;





    //methods:
    public void ClickModels() {
        clickOnElement(Models);
    }
public void InputZipCode(String Code){sendKeysToElement(ZipCodeBox,Code);}
public void ClickShopNew(){clickOnElement(ShopNewBar);}
    public void ClickShopInventoryBar (){clickOnElement(ShopInventory);}



    public void ClickSeeDetails() {
        clickOnElement(SeeDetail);
    }


    public DetailPage doSearch(String zipCode) {
ClickModels();
ClickShopInventoryBar();
InputZipCode(String.valueOf(11220));
ClickShopNew();
ClickSeeDetails();
return new DetailPage();


    }
}


