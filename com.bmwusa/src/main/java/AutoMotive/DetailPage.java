package AutoMotive;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailPage extends BasePage {


    public void DetailPage(){PageFactory.initElements(driver,this);}

    @FindBy(xpath = "//input[@id='zip-input-cpo']")
    public WebElement ZipCodeBox;

    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]")
    public WebElement ShopNewBar;


    public void InputZipCode(String Code){sendKeysToElement(ZipCodeBox,Code);}
public void ShopNewBar(){clickOnElement(ShopNewBar);}



}
