package pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Random;

import static hu.happybytes.driverfactory.DriverBaseTest.extentTest;

public class AddEmployeePage {
    WebDriver driver;
    WebDriverWait wait;
    By firstname = By.name("firstName");
    By middleName = By.name("middleName");
    By lastname = By.name("lastName");
    By saveBtn = By.cssSelector("button.oxd-button:nth-child(3)");
    public AddEmployeePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public String randomString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 6) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }
    public String firstNameInput() {
        WebElement firstNameInputField = wait.until(ExpectedConditions.visibilityOfElementLocated(firstname));
        String randomGenerated = randomString();
        firstNameInputField.sendKeys(randomGenerated);
        System.out.println("Firstname input : " + randomGenerated);
        extentTest.log(Status.INFO, "Set Firstname input : " + randomGenerated);
        return randomGenerated;
    }
    public String middleNameInput() {
        WebElement middleNameInputField = wait.until(ExpectedConditions.visibilityOfElementLocated(middleName));
        String randomGenerated = randomString();
        middleNameInputField.sendKeys(randomGenerated);
        System.out.println("Middlename input : " + randomGenerated);
        extentTest.log(Status.INFO,"Middlename input : " + randomGenerated);
        return randomGenerated;
    }
    public String lastNameInput() {
        WebElement lastNameInputField = wait.until(ExpectedConditions.visibilityOfElementLocated(lastname));
        String randomGenerated = randomString();
        lastNameInputField.sendKeys(randomGenerated);
        System.out.println("Lastname input : " + randomGenerated);
        extentTest.log(Status.INFO,"Lastname input : " + randomGenerated);
        return randomGenerated;
    }
    public void clickSaveButton() {
        WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(saveBtn));
        saveButton.click();
        System.out.println("Save button clicked");
        extentTest.log(Status.INFO,"Save button clicked");
    }
}
