package pages;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static hu.happybytes.driverfactory.DriverBaseTest.extentTest;

public class DashboardPage {
    WebDriver driver;
    WebDriverWait wait;
    By myInfoMenuBtnLocation = By.cssSelector("a[href='/web/index.php/pim/viewMyDetails']");
    By dashboardButton = By.cssSelector("li.oxd-main-menu-item-wrapper:nth-child(8)");

    public DashboardPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void clickMyInfoBtn() {
        WebElement myInfoItem = wait.until(ExpectedConditions.elementToBeClickable(myInfoMenuBtnLocation));
        myInfoItem.click();
    }

    public void dashboardPageMenuItem() {
        WebElement dashboardMenuItem = wait.until(ExpectedConditions.elementToBeClickable(dashboardButton));
        dashboardMenuItem.click();
        Assert.assertEquals( driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
        System.out.println("Dashboard button clicked");
        extentTest.log(Status.INFO,"Dashboard button clicked");
    }
}
