package pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static hu.happybytes.driverfactory.DriverBaseTest.extentTest;

public class FooterPage {
    WebDriver driver;
    WebDriverWait wait;
    By linkedinButton = By.cssSelector(".orangehrm-login-footer-sm > a:nth-child(1)");
    By facebookButton = By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[2]");
    By twitterButton = By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[3]");
    By youtubeButton = By.cssSelector(".orangehrm-login-footer-sm > a:nth-child(4)");

    public FooterPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void linkedinFooterButton() {
        WebElement linkedinIcon = wait.until(ExpectedConditions.elementToBeClickable(linkedinButton));
        linkedinIcon.click();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebElement signInPopupExecuteButton = driver.findElement(By.cssSelector("#organization_guest_contextual-sign-in > div > section > button > icon > svg"));
        signInPopupExecuteButton.click();
        System.out.println("Linkedin button pressed and OrangeHRM LinkedIn profile loads in a new tab.");
        extentTest.log(Status.INFO,"Linkedin button clicked and OrangeHRM LinkedIn profile loads in a new tab.");
    }

    public void facebookFooterButton() {
        WebElement facebookIcon = wait.until(ExpectedConditions.elementToBeClickable(facebookButton));
        facebookIcon.click();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebElement onlyAllowEssentialCookiesButton = driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[2]/div[1]/div/div[2]/div/div/div/div[2]/div/div[1]"));
        onlyAllowEssentialCookiesButton.click();
        System.out.println("Facebook button pressed and OrangeHRM Facebook profile loads in a new tab.");
        extentTest.log(Status.INFO,"Facebook button clicked and OrangeHRM Facebook profile loads in a new tab.");
    }

    public void twitterFooterButton() {
        WebElement twitterIcon = wait.until(ExpectedConditions.elementToBeClickable(twitterButton));
        twitterIcon.click();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebElement refuseNonEssentialCookiesButton = driver.findElement(By.xpath("//*[@id=\"layers\"]/div/div[2]/div/div/div/div[2]/div[2]/div"));
        refuseNonEssentialCookiesButton.click();
        System.out.println("Twitter button pressed and OrangeHRM Twitter profile loads in a new tab.");
        extentTest.log(Status.INFO,"Twitter button clicked and OrangeHRM Twitter profile loads in a new tab.");
    }

    public void youtubeFooterButton() {
        WebElement youtubeIcon = wait.until(ExpectedConditions.elementToBeClickable(youtubeButton));
        youtubeIcon.click();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebElement cookieConsentDecline = driver.findElement(By.cssSelector(".VtwTSb > form:nth-child(2) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)"));
        cookieConsentDecline.click();
        System.out.println("Youtube button pressed and OrangeHRM Youtube profile loads in a new tab.");
        extentTest.log(Status.INFO,"Youtube button clicked and OrangeHRM Youtube profile loads in a new tab.");
    }
}
