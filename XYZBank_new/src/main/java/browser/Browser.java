package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;

import java.time.Duration;

public class Browser {
    static WebDriver driver;
    String browserName = "chrome";
    String url = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";

    public LoginPage startBrowser(){
        if(browserName.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else {
            driver = new EdgeDriver();
        }
        driver.navigate().to(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return PageFactory.initElements(driver, LoginPage.class);
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
