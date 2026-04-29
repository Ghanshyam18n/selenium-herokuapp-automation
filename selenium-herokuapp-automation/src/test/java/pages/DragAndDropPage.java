package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPage {

    WebDriver driver;

    // Constructor
    public DragAndDropPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By boxA = By.id("column-a");
    private By boxB = By.id("column-b");

    // Action

    public void dragAtoB() {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(driver.findElement(boxA), driver.findElement(boxB)).perform();
    }

    public String getBoxAText() {
        return driver.findElement(boxA).getText();
    }
}