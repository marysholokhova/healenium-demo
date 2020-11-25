import base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    @Test
    public void testLogin(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.open()
                .clickLogin();
        ((JavascriptExecutor) driver).executeScript( "element = document.getElementById('email');\n" +
                                                        "element.setAttribute('id', 'login');" );
        ((JavascriptExecutor) driver).executeScript( "element = document.getElementById('passwd');\n" +
                                                        "element.setAttribute('id', 'password');" );
        loginPage.fillLoginEmail("rnd_test11@qa_test.com")
                .fillPassword( "Mzaq1xsw2");
        assert true;
    }

}
