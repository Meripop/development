package testCases;

import hu.happybytes.driverfactory.DriverBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.util.List;

public class LoginTestCases extends DriverBaseTest {
    LoginPage loginPage;
    String validUsername = "Admin";
    String invalidUsername = "adm";
    String validPassword = "admin123";
    String invalidPassword = "admin";
    String requiredMessage = "Required";
    String invalidCredentialsMessage = "Invalid credentials";


    public void openLoginPage() {
        loginPage = new LoginPage(driver, wait);
        loginPage.loadLoginPage();
    }

    @Test(description = "HBYTES-T7 Orange_LoginPage_EmptyUsername_ValidPassword", groups = {"login", "regression"})
    public void emptyUsernameValidPasswordTest() {
        openLoginPage();
        loginPage.loginWithUNandPWD("", validPassword);
        loginPage.clickLoginBtn();
        Assert.assertEquals(loginPage.findErrorMessageRequired(), requiredMessage);
        System.out.println("Empty username: 'Required' message is visible.");
    }

    @Test(description = "HBYTES-T8 Orange_LoginPage_ValidUsername_EmptyPassword", groups = {"login", "regression"})
    public void validUsernameEmptyPasswordTest() {
        openLoginPage();
        loginPage.loginWithUNandPWD(validUsername, "");
        loginPage.clickLoginBtn();
        Assert.assertEquals(loginPage.findErrorMessageRequired(), requiredMessage);
        System.out.println("Empty password: 'Required' message is visible.");
    }

    @Test(description = "HBYTES-T9 Orange_LoginPage_EmptyUsername_EmptyPassword", groups = {"login", "regression"})
    public void emptyUsernameAndPasswordTest() {
        openLoginPage();
        loginPage.loginWithUNandPWD("", "");
        loginPage.clickLoginBtn();
        List<WebElement> errorMessages = driver.findElements(By.className("oxd-input-field-error-message"));
        Assert.assertEquals(errorMessages.size(), 2);
        System.out.println("Empty username and password: 'Required' message is visible twice.");
    }

    @Test(description = "HBYTES-T10 Orange_LoginPage_ValidUsername_InvalidPassword", groups = {"login", "regression"})
    public void validUsernameInvalidPasswordTest() {
        openLoginPage();
        loginPage.loginWithUNandPWD(validUsername, invalidPassword);
        loginPage.clickLoginBtn();
        Assert.assertEquals(loginPage.findErrorMessageInvalidCredentials(), invalidCredentialsMessage);
        System.out.println("Invalid password: 'Invalid Credentials' message is visible.");
    }

    @Test(description = "HBYTES-T11 Orange_LoginPage_InvalidUsername_ValidPassword", groups = {"login", "regression"})
    public void invalidUsernameValidPasswordTest() {
        openLoginPage();
        loginPage.loginWithUNandPWD(invalidUsername, validPassword);
        loginPage.clickLoginBtn();
        Assert.assertEquals(loginPage.findErrorMessageInvalidCredentials(), invalidCredentialsMessage);
        System.out.println("Invalid username: 'Invalid Credentials' message is visible.");
    }

    @Test(description = "HBYTES-T12 Orange_LoginPage_ValidUsername_ValidPassword", groups = {"smoke", "login", "regression"})
    public void validUsernameAndPasswordTest() {
        openLoginPage();
        loginPage.loginWithUNandPWD(validUsername, validPassword);
        loginPage.clickLoginBtn();
        Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
        System.out.println("Valid username and password: Login was successful.");
    }

    @Test(description = "HBYTES-T13 Orange_LoginPage_ForgottenPassword", groups = {"login", "regression"})
    public void forgotYourPasswordLinkTest() throws InterruptedException {
        openLoginPage();
        loginPage.clickForgotYourPassword();
        Thread.sleep(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/requestPasswordResetCode");
        System.out.println("Reset password page loaded.");
    }
}
