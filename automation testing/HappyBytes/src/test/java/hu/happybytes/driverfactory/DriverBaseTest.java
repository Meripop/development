package hu.happybytes.driverfactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import utils.listeners.TestListener;

import java.time.Duration;

@Listeners(TestListener.class)
public class DriverBaseTest {
    public static ExtentReports extentReports = ExtentReporterNG.getReportObject();
    public static ExtentTest extentTest;
    protected static WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;

    @BeforeMethod(alwaysRun = true)
    public void driverSetup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofMillis(30000));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(30000));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30000));
        actions = new Actions(driver);
        System.out.println("Test case started");
    }
    @AfterMethod(alwaysRun = true)
    public void driverCleanUp() {
        driver.close();
        driver.quit();
        System.out.println("Test case finished");
    }
}
