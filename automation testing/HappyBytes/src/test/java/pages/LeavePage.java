package pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static hu.happybytes.driverfactory.DriverBaseTest.extentTest;

public class LeavePage {
    WebDriver driver;
    WebDriverWait wait;
    By leavePageButton = By.cssSelector("li.oxd-main-menu-item-wrapper:nth-child(3)");
    public LeavePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public void leavePageMenuItemClickable() {
        WebElement leavePageItem = wait.until(ExpectedConditions.elementToBeClickable(leavePageButton));
        leavePageItem.click();
        Assert.assertEquals( driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList");
        System.out.println("Leave menu item is clickable and works properly");
        extentTest.log(Status.INFO,"Leave menu item is clicked");
    }
}
