import models.User;
import org.junit.Test;
import pages.LoginPage;
import pages.HomePage;

/**
 * Created by maxim on 02.11.16.
 */
public class WebAppTest extends WebDriverTestBase {

    @Test
    public void testCreatePost() throws InterruptedException {

        LoginPage loginPage = new LoginPage("https://www.facebook.com", driver).open();

        loginPage = loginPage.open();
        Thread.sleep(3000);

        HomePage homePage = loginPage.loginAs(User.TEST_USER);
        Thread.sleep(3000);

        homePage.logout();
        Thread.sleep(3000);
    }
}
