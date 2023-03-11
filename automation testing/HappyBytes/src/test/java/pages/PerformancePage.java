package pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static hu.happybytes.driverfactory.DriverBaseTest.extentTest;

public class PerformancePage {
    WebDriver driver;
    WebDriverWait wait;
    By performanceButton= By.cssSelector("li.oxd-main-menu-item-wrapper:nth-child(7)");
    public PerformancePage(WebDriver driver,WebDriverWait wait){
        this.driver=driver;
        this.wait=wait;
    }
    public void performancePageMenuItem(){
        WebElement performanceMenuItem=wait.until(ExpectedConditions.visibilityOfElementLocated(performanceButton));
        performanceMenuItem.click();
        WebElement employeeTrackersButton = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[4]"));
        Assert.assertTrue(employeeTrackersButton.isDisplayed());
        System.out.println("Performance button clicked");
        extentTest.log(Status.INFO,"Performance button clicked");
    }
}
