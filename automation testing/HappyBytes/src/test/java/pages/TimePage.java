package pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static hu.happybytes.driverfactory.DriverBaseTest.extentTest;

public class TimePage {
    WebDriver driver;
    WebDriverWait wait;
    By timePageButton=By.cssSelector("li.oxd-main-menu-item-wrapper:nth-child(4)");
    public TimePage(WebDriver driver,WebDriverWait wait){
        this.driver=driver;
        this.wait=wait;
    }
    public void timePageMenuItemClickable(){
        WebElement timePageItem= wait.until(ExpectedConditions.elementToBeClickable(timePageButton));
        timePageItem.click();
        WebElement timesheetButton = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[1]"));
        Assert.assertTrue(timesheetButton.isDisplayed());
        System.out.println("Time  menu item is clickable and works properly");
        extentTest.log(Status.INFO,"Time  menu item is clickable and works properly");
    }
}
