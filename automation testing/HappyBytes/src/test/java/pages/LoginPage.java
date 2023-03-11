package pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static hu.happybytes.driverfactory.DriverBaseTest.extentTest;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;
    By loginTextLocation = By.cssSelector("h5");
    By usernameLocation = By.name("username");
    By passwordLocation = By.name("password");
    By forgotPasswordLocation = By.className("orangehrm-login-forgot-header");
    By requiredErrorMessage = By.className("oxd-input-field-error-message");
    By invalidCredentialsErrorMessage = By.className("oxd-alert-content-text");
    By loginBtnLocation = By.cssSelector("button[type='submit']");

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void loadLoginPage() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement loginTextItem = wait.until(ExpectedConditions.visibilityOfElementLocated(loginTextLocation));
        Assert.assertTrue(loginTextItem.isDisplayed());
        System.out.println("Login Page loaded properly.");
        extentTest.log(Status.INFO,"Login Page loaded properly.");
    }

    public void loginWithUNandPWD(String username, String password) {
        WebElement usernameItem = wait.until(ExpectedConditions.visibilityOfElementLocated(usernameLocation));
        usernameItem.sendKeys(username);
        WebElement passwordItem = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordLocation));
        passwordItem.sendKeys(password);
        extentTest.log(Status.INFO,"Login with valid values.");
    }

    public void clickLoginBtn() {
        WebElement loginBtnItem = wait.until(ExpectedConditions.elementToBeClickable(loginBtnLocation));
        loginBtnItem.click();
        System.out.println("Login button clicked.");
        extentTest.log(Status.INFO,"Login button clicked.");
    }

    public String findErrorMessageRequired() {
        WebElement errorMessageRequired = wait.until(ExpectedConditions.visibilityOfElementLocated(requiredErrorMessage));
        System.out.println("Error message found.");
        extentTest.log(Status.INFO,"Error message found.");
        return errorMessageRequired.getText();
    }

    public String findErrorMessageInvalidCredentials() {
        WebElement errorMessageInvalidCredentials = wait.until(ExpectedConditions.visibilityOfElementLocated(invalidCredentialsErrorMessage));
        System.out.println("Error message found.");
        extentTest.log(Status.INFO,"Error message found.");
        return errorMessageInvalidCredentials.getText();
    }

    public void clickForgotYourPassword() {
        WebElement forgotYourPasswordLink = wait.until(ExpectedConditions.visibilityOfElementLocated(forgotPasswordLocation));
        forgotYourPasswordLink.click();
        System.out.println("'Forgot your password?' link clicked.");
        extentTest.log(Status.INFO,"'Forgot your password?' link clicked.");
    }
}
