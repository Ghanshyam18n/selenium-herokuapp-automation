package base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterMethod
    public void tearDown(ITestResult result) {

        // Check if test failed
        if (ITestResult.FAILURE == result.getStatus()) {

            takeScreenshot(result.getName());
        }

        if (driver != null) {
            driver.quit();
        }
    }

    // Screenshot method
    public void takeScreenshot(String testName) {

        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        File destination = new File("./screenshots/" + testName + ".png");

        try {
            FileUtils.copyFile(source, destination);
            System.out.println("Screenshot saved: " + destination.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}