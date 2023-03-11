package testCases;

import hu.happybytes.driverfactory.DriverBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddEmployeePage;
import pages.LoginPage;
import pages.PIMPage;

public class OrangeEndToEndTestCases extends DriverBaseTest {
    LoginPage loginPage;
    PIMPage pimPage;
    AddEmployeePage addEmployeePage;

    @Test(description = "Add new Employee in Pim page with End to End Test , HBYTES-T67  ", groups = {"smoke", "end2end", "regression"})
    public void Orange_EndToEnd_Test() throws InterruptedException {
        loginPage = new LoginPage(driver, wait);
        loginPage.loadLoginPage();
        loginPage.loginWithUNandPWD("Admin", "admin123");
        loginPage.clickLoginBtn();
        pimPage = new PIMPage(driver, wait);
        pimPage.pimPageMenuItemClickable();
        pimPage.HeadlineAddEmployee();
        addEmployeePage = new AddEmployeePage(driver, wait);
        String firstname = addEmployeePage.firstNameInput();
        addEmployeePage.middleNameInput();
        String lastname = addEmployeePage.lastNameInput();
        addEmployeePage.clickSaveButton();
        Thread.sleep(7000);
        WebElement saveFirstnameText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".--strong")));
        Assert.assertEquals(firstname + " " + lastname, saveFirstnameText.getText());
    }
}
