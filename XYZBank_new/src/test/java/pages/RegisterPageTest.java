package pages;

import browser.Browser;
import org.testng.annotations.Test;

public class RegisterPageTest {

    @Test
    public void paraBankTest1(){
        Browser browser = new Browser();
        browser
                .startBrowser()
                .clickRegisterLink()
                .fillOutRegisterInfo()
                .validateRegistrationSuccess();
    }
}
