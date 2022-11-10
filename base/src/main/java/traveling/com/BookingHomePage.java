package traveling.com;

import base.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingHomePage extends BasePage {

    public Object SignInPage;

    public BookingHomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//header/nav[1]/div[2]/div[6]/a[1]/span[1]")
    public WebElement SignInButton;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement EmailAddress;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/button[1]")
    public WebElement ContinueWithEmailAddress;
    @FindBy(xpath = "//input[@id='new_password']")
    public WebElement setInputPassword;
    @FindBy(xpath = "//input[@id='confirmed_password']")
    public WebElement ConfirmPassword;


//methods

    public void SignIn() {
        clickOnElement(SignInButton);
    }

    public void inputEmailAddress() {
        clickOnElement(ContinueWithEmailAddress);
    }

    public void SetInputPassword(WebElement setInputPassword) {
        this.setInputPassword = setInputPassword;
    }

    public void setConfirmPassword(WebElement confirmPassword) {
        ConfirmPassword = confirmPassword;
    }

    public void setSignInPage(Object signInPage) {
        SignInPage = signInPage;
    }

    public BookingHomePage BookingHomePage(String SignInButton, String EmailAddress, String ContinueWithEmailAddress, String setInputPassword, String ConfirmPassword, String CreateAccount) {


        String signInButton = SignInButton;
        String continueWithEmailAddress = ContinueWithEmailAddress;
        String InputPassword;
        String InputConfirmPassword;

        return new BookingHomePage();


    }

    public void SignInPage(String emailAddress, String password, String continueWithEmailAddress, String SigIn) {
    }
}














