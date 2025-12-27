package pages;

import browser.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy(linkText = "Register") private WebElement registerLinkElement;

    WebDriver driver = Browser.getDriver();

    public RegisterPage clickRegisterLink(){
        registerLinkElement.click();
        return PageFactory.initElements(driver, RegisterPage.class);
    }
}
