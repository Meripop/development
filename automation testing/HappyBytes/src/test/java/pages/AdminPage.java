package pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static hu.happybytes.driverfactory.DriverBaseTest.extentTest;

public class AdminPage {
    WebDriver driver;
    WebDriverWait wait;
    By adminMenuButton = By.cssSelector("li.oxd-main-menu-item-wrapper:nth-child(1)");
    public AdminPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public void adminMenuItemClickable() {
        WebElement adminMenuItem = wait.until(ExpectedConditions.elementToBeClickable(adminMenuButton));
        adminMenuItem.click();
        Assert.assertEquals( driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
        System.out.println("Admin menu item clicked and redirect to the right page");
        extentTest.log(Status.INFO,"Admin menu item clicked and redireced to the right page");
    }
}
