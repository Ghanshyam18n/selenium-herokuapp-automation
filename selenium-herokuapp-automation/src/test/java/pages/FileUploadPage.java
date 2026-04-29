package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

    WebDriver driver;

    // Constructor
    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By fileInput = By.id("file-upload");
    private By uploadBtn = By.id("file-submit");
    private By uploadedText = By.id("uploaded-files");

    // Actions

    public void uploadFile(String filePath) {
        driver.findElement(fileInput).sendKeys(filePath);
    }

    public void clickUpload() {
        driver.findElement(uploadBtn).click();
    }

    public String getUploadedFileName() {
        return driver.findElement(uploadedText).getText();
    }
}