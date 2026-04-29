package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AlertsPage;
import pages.CheckboxPage;
import pages.DragAndDropPage;
import pages.DropdownPage;
import pages.DynamicControlsPage;
import pages.FileUploadPage;
import pages.IframePage;
import pages.LoginPage;

public class HerokuAppTest extends BaseTest {

    @Test
    public void testValidLogin() {

        // Navigate to Login Page
        driver.get("https://the-internet.herokuapp.com/login");

        // Create object of LoginPage
        LoginPage loginPage = new LoginPage(driver);

        // Perform login
        loginPage.login("tomsmith", "SuperSecretPassword!");

        // Get message
        String message = loginPage.getMessage();

        // Validation
        Assert.assertTrue(message.contains("You logged into a secure area!"),
                "Login failed - success message not displayed");
    }

    @Test
    public void testInvalidLogin() {

        driver.get("https://the-internet.herokuapp.com/login");

        LoginPage loginPage = new LoginPage(driver);

        // Wrong password
        loginPage.login("tomsmith", "wrongPassword");

        String message = loginPage.getMessage();

        // Validation
        Assert.assertTrue(message.contains("Your password is invalid!"),
                "Invalid login test failed");
    }
    
    @Test
    public void testCheckbox() {

        // Navigate to Checkbox page
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        CheckboxPage checkboxPage = new CheckboxPage(driver);

        // Select checkbox 1
        checkboxPage.clickCheckbox1();

        // Verify selected
        Assert.assertTrue(checkboxPage.isCheckbox1Selected(),
                "Checkbox 1 is not selected");

        // Unselect checkbox 2
        checkboxPage.clickCheckbox2();

        // Verify unselected
        Assert.assertFalse(checkboxPage.isCheckbox2Selected(),
                "Checkbox 2 is still selected");
    }
    
    @Test
    public void testDynamicControls() {

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        DynamicControlsPage page = new DynamicControlsPage(driver);

        // Remove checkbox
        page.clickRemove();

        // Validate message
        Assert.assertTrue(page.getMessage().contains("It's gone!"),
                "Checkbox was not removed");

        // Add checkbox back
        page.clickAdd();

        Assert.assertTrue(page.getMessage().contains("It's back!"),
                "Checkbox was not added");

        // Enable input box
        page.clickEnable();

        Assert.assertTrue(page.isInputEnabled(),
                "Input box is not enabled");
    }
    
    @Test
    public void testAlerts() {

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        AlertsPage page = new AlertsPage(driver);

        // Simple Alert
        page.clickAlert();
        page.acceptAlert();

        Assert.assertTrue(page.getResult().contains("You successfully clicked an alert"),
                "Alert handling failed");

        // Confirm Alert - Cancel
        page.clickConfirm();
        page.dismissAlert();

        Assert.assertTrue(page.getResult().contains("You clicked: Cancel"),
                "Confirm cancel failed");
    }
    
    @Test
    public void testDropdown() {

        driver.get("https://the-internet.herokuapp.com/dropdown");

        DropdownPage page = new DropdownPage(driver);

        // Select option
        page.selectByVisibleText("Option 1");

        // Validate selection
        Assert.assertEquals(page.getSelectedOption(), "Option 1",
                "Dropdown selection failed");
    }
    
    @Test
    public void testIframe() {

        driver.get("https://the-internet.herokuapp.com/iframe");

        IframePage page = new IframePage(driver);

        // Switch to iframe
        page.switchToFrame();

        // Perform action inside iframe
        page.clearText();
        page.enterText("Hello Automation");

        // Validate text
        Assert.assertEquals(page.getText(), "Hello Automation",
                "Iframe text validation failed");

        // Switch back to main page
        page.switchToDefault();
    }
    
    @Test
    public void testFileUpload() {

        driver.get("https://the-internet.herokuapp.com/upload");

        FileUploadPage page = new FileUploadPage(driver);

        // ✅ Correct file path (Windows)
        String filePath = "D:\\Downloads\\Shyam_Sharma.txt";

        page.uploadFile(filePath);
        page.clickUpload();

        Assert.assertTrue(page.getUploadedFileName().contains("Shyam_Sharma.txt"),
                "File upload failed");
    }
    
    @Test
    public void testDragAndDrop() {

        driver.get("https://the-internet.herokuapp.com/drag_and_drop");

        DragAndDropPage page = new DragAndDropPage(driver);

        // Perform drag and drop
        page.dragAtoB();

        // Validate (after drag, A and B swap)
        Assert.assertEquals(page.getBoxAText(), "B",
                "Drag and drop failed");
    }
    
}