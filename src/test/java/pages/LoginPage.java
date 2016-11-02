package pages;

import models.User;
import org.openqa.selenium.WebDriver;

/**
 * Created by maxim on 02.11.16.
 */
public class LoginPage extends BasePage {

    private String url;

    public LoginPage(String url, WebDriver driver) {
        super(driver);
        this.url = url;
    }

    public LoginPage open() {
        driver.navigate().to(url);
        return this;
    }

    public HomePage loginAs(User user) throws InterruptedException {
        insertText("email", user.getLogin());
        insertText("pass", user.getPassword());
        submit("pass");
        return new HomePage(driver);
    }
}
