package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPageToCucumber {
    WebDriver driver;
    WebDriverWait wait;
    By usernameLocation = By.name("username");
    By passwordLocation = By.name("password");
    By forgotPasswordLocation = By.className("orangehrm-login-forgot-header");
    By requiredErrorMessage = By.className("oxd-input-field-error-message");
    By invalidCredentialsErrorMessage = By.className("oxd-alert-content-text");
    By loginBtnLocation = By.cssSelector("button[type='submit']");

    public LoginPageToCucumber(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void loginWithUNandPWD(String username, String password) {
        WebElement usernameItem = wait.until(ExpectedConditions.visibilityOfElementLocated(usernameLocation));
        usernameItem.sendKeys(username);
        WebElement passwordItem = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordLocation));
        passwordItem.sendKeys(password);
    }

    public void clickLoginBtn() {
        WebElement loginBtnItem = wait.until(ExpectedConditions.elementToBeClickable(loginBtnLocation));
        loginBtnItem.click();
        System.out.println("Login button clicked.");
    }

    public String findErrorMessageRequired() {
        WebElement errorMessageRequired = wait.until(ExpectedConditions.visibilityOfElementLocated(requiredErrorMessage));
        System.out.println("Error message found.");
        return errorMessageRequired.getText();
    }

    public String findErrorMessageInvalidCredentials() {
        WebElement errorMessageInvalidCredentials = wait.until(ExpectedConditions.visibilityOfElementLocated(invalidCredentialsErrorMessage));
        System.out.println("Error message found.");
        return errorMessageInvalidCredentials.getText();
    }

    public void clickForgotYourPassword() {
        WebElement forgotYourPasswordLink = wait.until(ExpectedConditions.visibilityOfElementLocated(forgotPasswordLocation));
        forgotYourPasswordLink.click();
        System.out.println("'Forgot your password?' link clicked.");
    }
}
