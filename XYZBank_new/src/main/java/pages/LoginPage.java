package pages;

import browser.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(css = "[ng-click='customer()']") private WebElement customerLoginButton;
    @FindBy(css = "[ng-click='manager()']") private WebElement managerLoginButton;

    WebDriver driver = Browser.getDriver();

    public CustomerPage clickCustomerLoginButton(){
        customerLoginButton.click();
        return PageFactory.initElements(driver, CustomerPage.class);
    }

    public RegisterPage clickRegisterLink() {
        return null;
    }
}
