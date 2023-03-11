package pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static hu.happybytes.driverfactory.DriverBaseTest.extentTest;

public class MyInfoPage {
    WebDriver driver;
    WebDriverWait wait;

    By saveBtnLocation = By.cssSelector("button[type='submit'][data-v-00c9062b='']");
    By birthDateInputLocation = By.xpath("//div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input");

    By myinfoButton = By.cssSelector("li.oxd-main-menu-item-wrapper:nth-child(6)");
    By personalDetailsButton = By.linkText("Personal Details");
    By contactDetailsButton = By.linkText("Contact Details");
    By emergencyContactsButton = By.linkText("Emergency Contacts");
    By dependentsButton = By.linkText("Dependents");
    By immigrationButton = By.linkText("Immigration");
    By jobButton = By.linkText("Job");
    By salaryButton = By.linkText("Salary");
    By taxExemptionButton = By.linkText("Tax Exemptions");
    By reportToButton = By.linkText("Report-to");
    By qualificationsButton = By.linkText("Qualifications");
    By membershipsButton = By.linkText("Memberships");
    public MyInfoPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void clickFirstSaveBtn() throws InterruptedException {
        WebElement saveBtnItem = wait.until(ExpectedConditions.elementToBeClickable(saveBtnLocation));
        saveBtnItem.click();
        Thread.sleep(1000);
        System.out.println("Save button clicked");
        extentTest.log(Status.INFO, "Save button clicked");
    }
    public void setBirthDateInputYear(String year) {
        WebElement birthDateItem = wait.until(ExpectedConditions.elementToBeClickable(birthDateInputLocation));
        birthDateItem.sendKeys(Keys.CONTROL + "A", Keys.DELETE);
       birthDateItem.sendKeys(year + "-10-16");
        System.out.println("Set year");
        extentTest.log(Status.INFO, "Set year");
    }
    public void setBirthDateInputMonth(String month) {
        WebElement birthDateItem = wait.until(ExpectedConditions.visibilityOfElementLocated(birthDateInputLocation));
        birthDateItem.sendKeys(Keys.CONTROL + "A", Keys.DELETE);
        birthDateItem.sendKeys("2001-" + month + "-16");
        System.out.println("Set month");
        extentTest.log(Status.INFO, "Set month");
    }

    public void setBirthDateInputMonth2AndDay(String year, String day) {
        WebElement birthDateItem = wait.until(ExpectedConditions.visibilityOfElementLocated(birthDateInputLocation));
        birthDateItem.sendKeys(Keys.CONTROL + "A", Keys.DELETE);
        birthDateItem.sendKeys(year + "-02-" + day);
        System.out.println("Set year and day");
        extentTest.log(Status.INFO, "Set year and day");
    }

    public void setBirthDateInputMonth3AndDay(String day) {
        WebElement birthDateItem = wait.until(ExpectedConditions.visibilityOfElementLocated(birthDateInputLocation));
        birthDateItem.sendKeys(Keys.CONTROL + "A", Keys.DELETE);
        birthDateItem.sendKeys("2001-03-" + day);
        System.out.println("Set day");
        extentTest.log(Status.INFO, "Set day");
    }

    public void setBirthDateInputMonth4AndDay(String day) {
        WebElement birthDateItem = wait.until(ExpectedConditions.visibilityOfElementLocated(birthDateInputLocation));
        birthDateItem.sendKeys(Keys.CONTROL + "A", Keys.DELETE);
        birthDateItem.sendKeys("2001-04-" + day);
        System.out.println("Set day");
        extentTest.log(Status.INFO, "Set day");
    }
    public void errorMessageVisible() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(driver.getPageSource().contains("Should be a valid date in yyyy-mm-dd format"));
        System.out.println("Error message visible");
        extentTest.log(Status.INFO, "Error message visible");
    }
    public void errorMessageNotVisible() {
        Assert.assertFalse(driver.getPageSource().contains("Should be a valid date in yyyy-mm-dd format"));
        System.out.println("Error message not visible");
        extentTest.log(Status.INFO, "Error message not visible");
    }

    public void myinfoPageMenuItem() {
        WebElement myinfoMenuItem = wait.until(ExpectedConditions.visibilityOfElementLocated(myinfoButton));
        myinfoMenuItem.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/7");
        System.out.println("My Info button clicked ");
        extentTest.log(Status.INFO, "My Info button clicked ");
    }

    public void inMyinfoPersonalDetails() {
        WebElement personalDetailsItem = wait.until(ExpectedConditions.elementToBeClickable(personalDetailsButton));
        personalDetailsItem.click();
        WebElement lastNameInputField = driver.findElement(By.cssSelector(".orangehrm-lastname"));
        Assert.assertTrue(lastNameInputField.isDisplayed());
        System.out.println("Personal Details button clicked");
        extentTest.log(Status.INFO, "Personal Details button clicked");
    }

    public void inMyinfoContactDetails() {
        WebElement contactDetailsItem = wait.until(ExpectedConditions.elementToBeClickable(contactDetailsButton));
        contactDetailsItem.click();
        WebElement addressLine = driver.findElement(By.cssSelector("h6.orangehrm-sub-title:nth-child(1)"));
        Assert.assertTrue(addressLine.isDisplayed());
        System.out.println("Contact Details button clicked");
        extentTest.log(Status.INFO, "Contact Details button clicked");
    }

    public void inMyinfoEmergencyContacts() {
        WebElement emergencyContactsItem = wait.until(ExpectedConditions.elementToBeClickable(emergencyContactsButton));
        emergencyContactsItem.click();
        WebElement emergencyHeaderLine = driver.findElement(By.cssSelector("div.orangehrm-horizontal-padding:nth-child(1) > div:nth-child(1) > h6:nth-child(1)"));
        Assert.assertEquals(emergencyHeaderLine.getText(), "Assigned Emergency Contacts");
        System.out.println("Emergency Contacts button clicked");
        extentTest.log(Status.INFO, "Emergency Contacts button clicked");
    }

    public void inMyinfoDependents() {
        WebElement dependentsItem = wait.until(ExpectedConditions.elementToBeClickable(dependentsButton));
        dependentsItem.click();
        WebElement assignedDependentsLine = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/h6"));
        Assert.assertEquals(assignedDependentsLine.getText(), "Assigned Dependents");
        System.out.println("Dependents button clicked");
        extentTest.log(Status.INFO, "Dependents button clicked");
    }

    public void inMyinfoImmigration() {
        WebElement immigrationItem = wait.until(ExpectedConditions.elementToBeClickable(immigrationButton));
        immigrationItem.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewImmigration/empNumber/7");
        System.out.println("Immigration button clicked");
        extentTest.log(Status.INFO, "Immigration button clicked");
    }

    public void inMyinfoJob() {
        WebElement jobItem = wait.until(ExpectedConditions.elementToBeClickable(jobButton));
        jobItem.click();
        WebElement jobDetailsLine = driver.findElement(By.cssSelector("div.orangehrm-horizontal-padding:nth-child(1) > h6:nth-child(1)"));
        Assert.assertTrue(jobDetailsLine.isDisplayed());
        System.out.println("Job button clicked");
        extentTest.log(Status.INFO, "Job button clicked");
    }

    public void inMyinfoSalary(){
        WebElement salaryItem = wait.until(ExpectedConditions.elementToBeClickable(salaryButton));
        salaryItem.click();
        WebElement salaryComponentsLine = driver.findElement(By.cssSelector("div.orangehrm-horizontal-padding:nth-child(1) > div:nth-child(1) > h6:nth-child(1)"));
        Assert.assertEquals(salaryComponentsLine.getText(), "Assigned Salary Components");
        System.out.println("Salary button clicked");
        extentTest.log(Status.INFO, "Salary button clicked");
    }

    public void inMyInfoTaxExemptions() {
        WebElement taxExemptionItem = wait.until(ExpectedConditions.elementToBeClickable(taxExemptionButton));
        taxExemptionItem.click();
        WebElement federalIncomeTaxLine = driver.findElement(By.cssSelector("h6.orangehrm-sub-title:nth-child(1)"));
        Assert.assertEquals(federalIncomeTaxLine.getText(), "Federal Income Tax");
        System.out.println("Tax Exemption button clicked");
        extentTest.log(Status.INFO, "Tax Exemption button clicked");
    }

    public void inMyinfoReportTo() {
        WebElement reportToItem = wait.until(ExpectedConditions.elementToBeClickable(reportToButton));
        reportToItem.click();
        WebElement assignedSupervisorsLine = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/div/h6"));
        Assert.assertEquals(assignedSupervisorsLine.getText(), "Assigned Supervisors");
        System.out.println("Report-to button clicked");
        extentTest.log(Status.INFO, "Report-to button clicked");
    }

    public void inMyinfoQualifications() {
        WebElement qualificationsItem = wait.until(ExpectedConditions.elementToBeClickable(qualificationsButton));
        qualificationsItem.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewQualifications/empNumber/7");
        System.out.println("Qualifications button clicked");
        extentTest.log(Status.INFO, "Qualifications button clicked");
    }

    public void inMyinfoMemberships() {
        WebElement membershipsItem = wait.until(ExpectedConditions.elementToBeClickable(membershipsButton));
        membershipsItem.click();
        WebElement membershipsCheckbox = driver.findElement(By.className("oxd-checkbox-wrapper"));
        Assert.assertTrue(membershipsCheckbox.isDisplayed());
        System.out.println("Memberships button clicked");
        extentTest.log(Status.INFO, "Memberships button clicked");
    }
}
