package pages;

import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class HomePage extends BasePage {

    @FindBy( xpath = "//a[@class='login']" )
    private WebElement loginButton;

    @FindBy( id = "newsletter-input" )
    private WebElement newsletterEmail;

    public HomePage(SelfHealingDriver selfHealingDriver) {
        super(selfHealingDriver);
    }

    public HomePage open(){
        this.selfHealingDriver.get("http://automationpractice.com");
        return this;
    }

    public HomePage clickLogin(){
        this.loginButton.click();
        return this;
    }

}
