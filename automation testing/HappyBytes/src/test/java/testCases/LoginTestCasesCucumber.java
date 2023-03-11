package testCases;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.LoginPageToCucumber;

import java.time.Duration;

public class LoginTestCasesCucumber {
    WebDriver driver;
    WebDriverWait wait;
    LoginPageToCucumber loginPageToCucumber;

    @Before
    public void driverSetup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofMillis(30000));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(30000));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30000));
        System.out.println("Test case started");
    }

    @After
    public void driverCleanUp() {
        driver.quit();
        System.out.println("Test case finished");
    }

    @Given("Webpage has been loaded {string}")
    public void loadPage(String url) {
        loginPageToCucumber = new LoginPageToCucumber(driver, wait);
        driver.get(url);
    }

    @When("The user enters the username as {string} and password as {string} and click to Login button")
    public void fillInputFieldsAndClickLoginBtn(String username, String password) {
        loginPageToCucumber.loginWithUNandPWD(username, password);
        loginPageToCucumber.clickLoginBtn();
    }

    @Then("the user can not able to login and {string} message is visible.")
    public void validateLogin(String requiredMessage) {
        Assert.assertEquals(loginPageToCucumber.findErrorMessageRequired(), requiredMessage);
        System.out.println("message is visible.");
    }

    @Then("the user can not able to login and {string} message is visible after page reloaded.")
    public void validateLogin2(String requiredMessage) {
        Assert.assertEquals(loginPageToCucumber.findErrorMessageInvalidCredentials(), requiredMessage);
        System.out.println("message is visible.");
    }

    @Then("User logged in Login was successfully")
    public void validateValidLogin() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
        System.out.println("Valid username and password: Login was successful.");
    }

    @When("click to Forgot your password? text")
    public void forgottenPasswordClick() {
        loginPageToCucumber.clickForgotYourPassword();
    }

    @Then("Go to {string} page")
    public void validateResetPasswordPage(String url) {
        Assert.assertEquals(driver.getCurrentUrl(), url);
        System.out.println("Reset password page loaded.");
    }
}
