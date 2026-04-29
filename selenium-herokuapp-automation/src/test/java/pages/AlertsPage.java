package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;

public class AlertsPage {

    WebDriver driver;

    // Constructor
    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By alertBtn = By.xpath("//button[text()='Click for JS Alert']");
    private By confirmBtn = By.xpath("//button[text()='Click for JS Confirm']");
    private By resultText = By.id("result");

    // Actions

    public void clickAlert() {
        driver.findElement(alertBtn).click();
    }

    public void clickConfirm() {
        driver.findElement(confirmBtn).click();
    }

    public void acceptAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void dismissAlert() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public String getResult() {
        return driver.findElement(resultText).getText();
    }
}