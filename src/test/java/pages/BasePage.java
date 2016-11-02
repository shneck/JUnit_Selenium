package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by maxim on 02.11.16.
 */
abstract class BasePage {

    WebDriver driver;

    BasePage(WebDriver driver) {
        this.driver = driver;
    }

    void insertText(String textBoxId, String text) {
        WebElement textBox = driver.findElement(By.id(textBoxId));
        textBox.clear();
        textBox.sendKeys(text);
    }

    void submit(String id) {
        WebElement button = driver.findElement(By.id(id));
        button.submit();
    }

    public void click(String id) {
        WebElement button = driver.findElement(By.id(id));
        button.click();
    }
}
