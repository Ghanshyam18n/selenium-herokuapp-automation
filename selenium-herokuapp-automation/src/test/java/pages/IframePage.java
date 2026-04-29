package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IframePage {

    WebDriver driver;

    // Constructor
    public IframePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By iframe = By.id("mce_0_ifr");
    private By textBox = By.id("tinymce");

    // Actions

    public void switchToFrame() {
        driver.switchTo().frame(driver.findElement(iframe));
    }

    public void switchToDefault() {
        driver.switchTo().defaultContent();
    }

    public void clearText() {
        driver.findElement(textBox).clear();
    }

    public void enterText(String text) {
        driver.findElement(textBox).sendKeys(text);
    }

    public String getText() {
        return driver.findElement(textBox).getText();
    }
}