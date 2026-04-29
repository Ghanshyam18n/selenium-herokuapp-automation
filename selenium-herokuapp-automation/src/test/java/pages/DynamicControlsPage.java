package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicControlsPage {

    WebDriver driver;

    // Constructor
    public DynamicControlsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By removeBtn = By.xpath("//button[text()='Remove']");
    private By addBtn = By.xpath("//button[text()='Add']");
    private By message = By.id("message");

    private By enableBtn = By.xpath("//button[text()='Enable']");
    private By disableBtn = By.xpath("//button[text()='Disable']");
    private By inputBox = By.xpath("//input[@type='text']");

    // Actions

    public void clickRemove() {
        driver.findElement(removeBtn).click();
    }

    public void clickAdd() {
        driver.findElement(addBtn).click();
    }

    public void clickEnable() {
        driver.findElement(enableBtn).click();
    }

    public void clickDisable() {
        driver.findElement(disableBtn).click();
    }

    public String getMessage() {
        return driver.findElement(message).getText();
    }

    public boolean isInputEnabled() {
        return driver.findElement(inputBox).isEnabled();
    }
}