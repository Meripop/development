package pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static hu.happybytes.driverfactory.DriverBaseTest.extentTest;

public class BuzzPage {
    WebDriver driver;
    WebDriverWait wait;
    By buzzButton = By.cssSelector("li.oxd-main-menu-item-wrapper:nth-child(11)");
    public BuzzPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public void buzzPageMenuItem() {
        WebElement buzzMenuItem = wait.until(ExpectedConditions.visibilityOfElementLocated(buzzButton));
        buzzMenuItem.click();
        WebElement buzzNewfeedLine = driver.findElement(By.className("orangehrm-buzz-newsfeed-title"));
        Assert.assertEquals(buzzNewfeedLine.getText(),"Buzz Newsfeed");
        System.out.println("Buzz button clicked");
        extentTest.log(Status.INFO,"Buzz button clicked");
    }
}
