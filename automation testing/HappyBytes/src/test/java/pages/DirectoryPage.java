package pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static hu.happybytes.driverfactory.DriverBaseTest.extentTest;

public class DirectoryPage {
    WebDriver driver;
    WebDriverWait wait;
    By directoryButton = By.cssSelector("li.oxd-main-menu-item-wrapper:nth-child(9)");
    public DirectoryPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public void directoryMenuPageItem() {
        WebElement directoryItem = wait.until(ExpectedConditions.elementToBeClickable(directoryButton));
        directoryItem.click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/directory/viewDirectory");
        System.out.println("Directory button clicked");
        extentTest.log(Status.INFO,"Directory button clicked");
    }
}
