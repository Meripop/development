package pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static hu.happybytes.driverfactory.DriverBaseTest.extentTest;

public class MaintenancePage {
    WebDriver driver;
    WebDriverWait wait;
    By maintenanceButton = By.cssSelector("li.oxd-main-menu-item-wrapper:nth-child(10)");
    By passwordFieldInput = By.name("password");
    public MaintenancePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public void maintenancePageMenuItem() {
        WebElement maintenanceMenuItem = wait.until(ExpectedConditions.visibilityOfElementLocated(maintenanceButton));
        maintenanceMenuItem.click();
        WebElement administratorContainer = driver.findElement(By.className("orangehrm-admin-access-container"));
        Assert.assertTrue(administratorContainer.isDisplayed());
        System.out.println("Maintenance button clicked");
        extentTest.log(Status.INFO,"Maintenance button clicked");
    }
    public void inMaintenanceAccessPage() {
        WebElement administratorPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordFieldInput));
        administratorPassword.sendKeys("admin123");
        WebElement confirmButton = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/form/div[4]/button[2]"));
        confirmButton.click();
        WebElement notetextline = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/p"));
        Assert.assertTrue(notetextline.isDisplayed());
        extentTest.log(Status.INFO,"Note text is display");
    }
}
