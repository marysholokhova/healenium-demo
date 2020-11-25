package pages;

import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class LoginPage extends BasePage {

    @FindBy( id = "email_create" )
    private WebElement createAccountEmail;

    @FindBy( id = "SubmitCreate" )
    private WebElement submitEmailToCreate;

    @FindBy( id = "email" )
    private WebElement loginEmail;

    @FindBy( id = "passwd" )
    private WebElement loginPassword;

    public LoginPage fillLoginEmail(String email){
        this.loginEmail.sendKeys(email);
        return this;
    }

    public LoginPage fillPassword(String password){
        this.loginPassword.sendKeys(password);
        return this;
    }

    public LoginPage(SelfHealingDriver selfHealingDriver) {
        super(selfHealingDriver);
    }
}
