package pages;

import com.beust.ah.A;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AccountPage {
    @FindBy(css = "[ng-click='deposit()']") private WebElement depositButton;
    @FindBy(css = "[ng-model='amount']") private WebElement inputAmount;
    @FindBy(css = "[type='submit']") private WebElement depositSubmitButton;
    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/strong[2]")
    private WebElement balance;

    public AccountPage clickOnDepositButton(){
        depositButton.click();
        return this;
    }

    public AccountPage depositMoney(){
        inputAmount.sendKeys("1500");
        depositSubmitButton.click();
        return this;
    }

    public AccountPage validateBalance(){
        String actualBalance = balance.getText();
        Assert.assertEquals(actualBalance, "1500");
        return this;
    }
}
