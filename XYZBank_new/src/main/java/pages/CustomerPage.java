package pages;

import browser.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.*;

public class CustomerPage {

    @FindBy(id = "userSelect") private WebElement selectUser;
    @FindBy(css = "[type='submit']") private WebElement loginButton;
    WebDriver driver = Browser.getDriver();

   public CustomerPage validateCustomerPage(){
       try {
           Thread.sleep(1000);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
       String url = driver.getCurrentUrl();
       Assert.assertTrue(url.contains("customer"));
       return this;
   }

   public CustomerPage selectUser(){
       Select select = new Select(selectUser);
       select.selectByVisibleText("Harry Potter");
       return this;
   }

   public AccountPage clickOnLoginButton(){
       loginButton.click();
       return PageFactory.initElements(driver, AccountPage.class);
   }


}
