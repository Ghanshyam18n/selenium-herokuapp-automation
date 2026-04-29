package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {

    WebDriver driver;

    // Constructor
    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locator
    private By dropdown = By.id("dropdown");

    // Actions

    public void selectByVisibleText(String text) {
        Select select = new Select(driver.findElement(dropdown));
        select.selectByVisibleText(text);
    }

    public String getSelectedOption() {
        Select select = new Select(driver.findElement(dropdown));
        return select.getFirstSelectedOption().getText();
    }
}