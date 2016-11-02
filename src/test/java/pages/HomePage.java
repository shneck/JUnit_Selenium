package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by maxim on 02.11.16.
 */
public class HomePage extends BasePage {

    HomePage(WebDriver driver) {
        super(driver);
    }

    public void logout() throws InterruptedException {

        driver.findElement(By.id("userNavigationLabel")).click();

        Thread.sleep(3000);

        driver.findElement(By.linkText("Log Out")).click();
    }
}
