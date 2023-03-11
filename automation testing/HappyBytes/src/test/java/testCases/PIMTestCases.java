package testCases;

import hu.happybytes.driverfactory.DriverBaseTest;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PIMPage;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class PIMTestCases extends DriverBaseTest {

    PIMPage pimPage;
    String validEmployeeID;
    String employeeName;
    String invalidEmployeeID;
    String supervisorName;

    private Map readJson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String exampleRequest = FileUtils.readFileToString(new File("files/PIMdatas.json"), StandardCharsets.UTF_8);
        Map<String, String> dataMap = mapper.readValue(exampleRequest, Map.class);
        return dataMap;
    }

    private void addValueToVariables() throws IOException {
        Map<String, String> dataMap = readJson();
        for (String name : dataMap.keySet()) {
            String value = dataMap.get(name);
            switch (name) {
                case "validEmployeeID" -> validEmployeeID = value;
                case "employeeName" -> employeeName = value;
                case "invalidEmployeeID" -> invalidEmployeeID = value;
                case "supervisorName" -> supervisorName = value;
            }
        }
    }

        public void navigateToPimPage() throws IOException {
        pimPage = new PIMPage(driver, wait);
        pimPage.loginToDashboard();
        pimPage.navigateFromDashboardToPimPage();
        addValueToVariables();
    }

    @Test(description = "HBYTES-T50 Orange_PIM_EmployeeList_EmployeeInformationSearch_Reset", groups = {"pim", "regression"})
    public void searchResetTest() throws IOException {
        navigateToPimPage();
        pimPage.fillEmployeeNameField(employeeName);
        pimPage.fillEmployeeIDField(validEmployeeID);
        pimPage.fillSupervisorNameField(supervisorName);
        pimPage.clickResetButton();
        Assert.assertEquals(driver.findElement(By.cssSelector("input[placeholder='Type for hints...']")).getText(), "");
        System.out.println("Employee Name field reset works properly.");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input")).getText(), "");
        System.out.println("Employee ID field reset works properly.");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[5]/div/div[2]/div/div/input")).getText(), "");
        System.out.println("Supervisor Name field reset works properly.");
    }

    @Test(description = "HBYTES-T53 Orange_PIM_EmployeeList_EmployeeInformationSearch_TwoTextfieldsFilled", groups = {"pim", "regression"})
    public void searchAllFieldsFilledTest() throws InterruptedException, IOException {
        navigateToPimPage();
        pimPage.fillEmployeeNameField(employeeName);
        pimPage.fillEmployeeIDField(validEmployeeID);
        pimPage.clickSearchButton();
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span")).getText(), "(1) Record Found");
        System.out.println("Search with all fields filled works and results only one find.");
    }

    @Test(description = "HBYTES-T54 Orange_PIM_EmployeeList_EmployeeInformationSearch_AllFieldsEmpty", groups = {"pim", "regression"})
    public void searchAllFieldsEmptyTest() throws IOException {
        navigateToPimPage();
        String numberOfRecordsBeforeSearch = driver.findElement(By.className("oxd-text--span")).getText();
        pimPage.clickSearchButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("oxd-text--span")));
        Assert.assertEquals(driver.findElement(By.className("oxd-text--span")).getText(), numberOfRecordsBeforeSearch);
        System.out.println("Search with all field empty does not change number of results.");
    }

    @Test(description = "HBYTES-T55 Orange_PIM_EmployeeList_EmployeeInformationSearch_InvalidData", groups = {"pim", "regression"})
    public void searchWithInvalidDataTest() throws InterruptedException, IOException {
        navigateToPimPage();
        pimPage.fillEmployeeNameField(employeeName);
        pimPage.fillEmployeeIDField(invalidEmployeeID);
        pimPage.clickSearchButton();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getPageSource().contains("No Records Found"));
        System.out.println("Search has no result wit invalid data.");
    }

    @Test(description = "HBYTES-T56 Orange_PIM_EmployeeList_EmployeeInformationSearch_OneFieldFilled", groups = {"pim", "regression"})
    public void searchOneFieldFilledTest() throws InterruptedException, IOException {
        navigateToPimPage();
        pimPage.fillEmployeeIDField(validEmployeeID);
        pimPage.clickSearchButton();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getPageSource().contains("(1) Record Found"));
        System.out.println("Search is working with only one field filled.");
    }
}
