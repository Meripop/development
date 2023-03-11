package pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static hu.happybytes.driverfactory.DriverBaseTest.extentTest;

public class RecruitmentPage {
    WebDriver driver;
    WebDriverWait wait;
    By recruitmentPageButton = By.cssSelector("li.oxd-main-menu-item-wrapper:nth-child(5)");
    public RecruitmentPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public void recruitmentMenuItemClickable() {
        WebElement recruitmentPageItem = wait.until(ExpectedConditions.elementToBeClickable(recruitmentPageButton));
        recruitmentPageItem.click();
        WebElement vacanciesButton = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]"));
        Assert.assertTrue(vacanciesButton.isDisplayed());
        System.out.println("Recruitment  menu item is clickable and works properly");
        extentTest.log(Status.INFO,"Recruitment  menu item is clickable and works properly");
    }
}
