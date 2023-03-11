package pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static hu.happybytes.driverfactory.DriverBaseTest.extentTest;

public class PIMPage {
    WebDriver driver;
    WebDriverWait wait;
    LoginPage loginPage;
    String validUsername = "Admin";
    String validPassword = "admin123";
    By pimPageIconLocator = By.cssSelector("a[href='/web/index.php/pim/viewPimModule']");
    By employeeInformationTextLocator = By.className("oxd-text--h5");
    By resetButtonLocator = By.cssSelector("button[type='reset']");
    By searchButtonLocator = By.cssSelector("button[type='submit']");
    By employeeNameTextFieldLocator = By.cssSelector("input[placeholder='Type for hints...']");
    By employeeIDTextFieldLocator = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input");
    By supervisorNameTextFieldLocator = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[5]/div/div[2]/div/div/input");
    By pimPageButton = By.cssSelector("li.oxd-main-menu-item-wrapper:nth-child(2)");
    By addEmployeeItem = By.cssSelector("li.oxd-topbar-body-nav-tab:nth-child(3) > a:nth-child(1)");

    public PIMPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void loginToDashboard() {
        loginPage = new LoginPage(driver, wait);
        loginPage.loadLoginPage();
        loginPage.loginWithUNandPWD(validUsername, validPassword);
        loginPage.clickLoginBtn();
        Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
        System.out.println("Login was successful.");
        extentTest.log(Status.INFO,"Login was successful.");
    }

    public void navigateFromDashboardToPimPage() {
        WebElement pimPageIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(pimPageIconLocator));
        pimPageIcon.click();
        WebElement employeeInformationText = wait.until(ExpectedConditions.visibilityOfElementLocated(employeeInformationTextLocator));
        Assert.assertEquals(employeeInformationText.getText(), "Employee Information");
        System.out.println("PIM page loaded properly.");
        extentTest.log(Status.INFO,"PIM page loaded properly.");
    }

    public void clickResetButton() {
        WebElement resetButton = wait.until(ExpectedConditions.elementToBeClickable(resetButtonLocator));
        resetButton.click();
        System.out.println("Reset button clicked.");
        extentTest.log(Status.INFO,"Reset button clicked.");
    }

    public void clickSearchButton() {
        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(searchButtonLocator));
        searchButton.click();
        System.out.println("Search button clicked.");
        extentTest.log(Status.INFO,"Search button clicked.");
    }

    public void fillEmployeeNameField(String employeeName) {
        WebElement employeeNameField = wait.until(ExpectedConditions.elementToBeClickable(employeeNameTextFieldLocator));
        employeeNameField.sendKeys(employeeName);
        System.out.println("Employee Name field filled with " + employeeName + ".");
        extentTest.log(Status.INFO,"Employee Name field filled with " + employeeName + ".");
    }

    public void fillEmployeeIDField(String employeeID) {
        WebElement employeeIDField = wait.until(ExpectedConditions.visibilityOfElementLocated(employeeIDTextFieldLocator));
        employeeIDField.sendKeys(employeeID);
        System.out.println("Employee ID field filled with " + employeeID + ".");
        extentTest.log(Status.INFO,"Employee ID field filled with " + employeeID + ".");
    }

    public void fillSupervisorNameField(String supervisorName) {
        WebElement supervisorNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(supervisorNameTextFieldLocator));
        supervisorNameField.sendKeys(supervisorName);
        System.out.println("Supervisor Name field filled with " + supervisorName + ".");
        extentTest.log(Status.INFO,"Supervisor Name field filled with " + supervisorName + ".");
    }

    public void HeadlineAddEmployee() {
        WebElement addEmployeeButton = wait.until((ExpectedConditions.elementToBeClickable(addEmployeeItem)));
        addEmployeeButton.click();
        System.out.println("Add Employee button clicked.");
        extentTest.log(Status.INFO,"Add Employee button clicked.");
    }

    public void pimPageMenuItemClickable() {
        WebElement pimPageMenuItem = wait.until(ExpectedConditions.elementToBeClickable(pimPageButton));
        pimPageMenuItem.click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
        System.out.println("PIM menu item is clickable and works properly");
        extentTest.log(Status.INFO,"PIM menu item is clickable and works properly");
    }
}