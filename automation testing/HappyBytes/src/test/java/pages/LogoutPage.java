package pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static hu.happybytes.driverfactory.DriverBaseTest.extentTest;

public class LogoutPage {
    WebDriver driver;
    WebDriverWait wait;
    By dropDown = By.cssSelector("i.oxd-icon:nth-child(3)");
    By logoutButton = By.linkText("Logout");
    public LogoutPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public void logoutProcess() {
        WebElement userDropDownIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(dropDown));
        userDropDownIcon.click();
        WebElement logoutButton = wait.until(ExpectedConditions.elementToBeClickable(this.logoutButton));
        logoutButton.sendKeys(Keys.ENTER);
        extentTest.log(Status.INFO,"Log out");
    }
}
