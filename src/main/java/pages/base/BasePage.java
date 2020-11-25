package pages.base;

import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected SelfHealingDriver selfHealingDriver;

    public BasePage(SelfHealingDriver selfHealingDriver) {
        this.selfHealingDriver = selfHealingDriver;
        PageFactory.initElements(selfHealingDriver, this);
    }
}
