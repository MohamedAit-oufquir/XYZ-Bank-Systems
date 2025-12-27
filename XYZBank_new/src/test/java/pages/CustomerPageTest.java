package pages;

import browser.Browser;
import org.testng.annotations.Test;

public class CustomerPageTest {

    @Test
    public void customerTest1(){
        Browser browser = new Browser();
        browser.startBrowser()
                .clickCustomerLoginButton()
                .validateCustomerPage();
    }
}
