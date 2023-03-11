package testCases;

import hu.happybytes.driverfactory.DriverBaseTest;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import pages.MyInfoPage;

public class MyInfoTestCases extends DriverBaseTest {
    LoginPage loginPage;
    MyInfoPage myInfoPage;
    DashboardPage dashboardPage;

    private void validLogin() {
        loginPage = new LoginPage(driver, wait);
        loginPage.loadLoginPage();
        loginPage.loginWithUNandPWD("Admin", "admin123");
        loginPage.clickLoginBtn();
    }

    private void fromDashboardToMyInfoPage() {
        dashboardPage = new DashboardPage(driver, wait);
        dashboardPage.clickMyInfoBtn();
        myInfoPage = new MyInfoPage(driver, wait);
    }

    @Test(description = "year test with 999, HBYTES-T1", groups = {"date", "regression"})
    public void Orange_MyInfoDetails_BirthDateYear_Boundary_001() throws InterruptedException {
        validLogin();
        fromDashboardToMyInfoPage();
        myInfoPage.setBirthDateInputYear("999");
        myInfoPage.clickFirstSaveBtn();
        myInfoPage.errorMessageVisible();
    }

    @Test(description = "year test with 1000, HBYTES-T2", groups = {"date", "regression"})
    public void Orange_MyInfoDetails_BirthDateYear_Boundary_002() throws InterruptedException {
        validLogin();
        fromDashboardToMyInfoPage();
        myInfoPage.setBirthDateInputYear("1000");
        myInfoPage.clickFirstSaveBtn();
        myInfoPage.errorMessageNotVisible();
    }

    @Test(description = "year test with 1001, HBYTES-T3", groups = {"date", "regression"})
    public void Orange_MyInfoDetails_BirthDateYear_Boundary_003() throws InterruptedException {
        validLogin();
        fromDashboardToMyInfoPage();
        myInfoPage.setBirthDateInputYear("1001");
        myInfoPage.clickFirstSaveBtn();
        myInfoPage.errorMessageNotVisible();
    }

    @Test(description = "year test with 9998, HBYTES-T4", groups = {"date", "regression"})
    public void Orange_MyInfoDetails_BirthDateYear_Boundary_004() throws InterruptedException {
        validLogin();
        fromDashboardToMyInfoPage();
        myInfoPage.setBirthDateInputYear("9998");
        myInfoPage.clickFirstSaveBtn();
        myInfoPage.errorMessageNotVisible();
    }

    @Test(description = "year test with 9999, HBYTES-T5", groups = {"date", "regression"})
    public void Orange_MyInfoDetails_BirthDateYear_Boundary_005() throws InterruptedException {
        validLogin();
        fromDashboardToMyInfoPage();
        myInfoPage.setBirthDateInputYear("9999");
        myInfoPage.clickFirstSaveBtn();
        myInfoPage.errorMessageNotVisible();
    }

    @Test(description = "year test with 10000, HBYTES-T6", groups = {"date", "regression"})
    public void Orange_MyInfoDetails_BirthDateYear_Boundary_006() throws InterruptedException {
        validLogin();
        fromDashboardToMyInfoPage();
        myInfoPage.setBirthDateInputYear("10000");
        myInfoPage.clickFirstSaveBtn();
        myInfoPage.errorMessageVisible();
    }

    @Test(description = "month test with 00, HBYTES-T14", groups = {"date", "regression"})
    public void Orange_MyInfoDetails_BirthDateMonth_Boundary_007() throws InterruptedException {
        validLogin();
        fromDashboardToMyInfoPage();
        myInfoPage.setBirthDateInputMonth("00");
        myInfoPage.clickFirstSaveBtn();
        myInfoPage.errorMessageVisible();
    }

    @Test(description = "month test with 01, HBYTES-T15", groups = {"date", "regression"})
    public void Orange_MyInfoDetails_BirthDateMonth_Boundary_008() throws InterruptedException {
        validLogin();
        fromDashboardToMyInfoPage();
        myInfoPage.setBirthDateInputMonth("01");
        myInfoPage.clickFirstSaveBtn();
        myInfoPage.errorMessageNotVisible();
    }

    @Test(description = "month test with 02, HBYTES-T16", groups = {"date", "regression"})
    public void Orange_MyInfoDetails_BirthDateMonth_Boundary_009() throws InterruptedException {
        validLogin();
        fromDashboardToMyInfoPage();
        myInfoPage.setBirthDateInputMonth("02");
        myInfoPage.clickFirstSaveBtn();
        myInfoPage.errorMessageNotVisible();
    }

    @Test(description = "month test with 11, HBYTES-T17", groups = {"date", "regression"})
    public void Orange_MyInfoDetails_BirthDateMonth_Boundary_010() throws InterruptedException {
        validLogin();
        fromDashboardToMyInfoPage();
        myInfoPage.setBirthDateInputMonth("11");
        myInfoPage.clickFirstSaveBtn();
        myInfoPage.errorMessageNotVisible();
    }

    @Test(description = "month test with 12, HBYTES-T18", groups = {"date", "regression"})
    public void Orange_MyInfoDetails_BirthDateMonth_Boundary_011() throws InterruptedException {
        validLogin();
        fromDashboardToMyInfoPage();
        myInfoPage.setBirthDateInputMonth("12");
        myInfoPage.clickFirstSaveBtn();
        myInfoPage.errorMessageNotVisible();
    }

    @Test(description = "month test with 13, HBYTES-T19", groups = {"date", "regression"})
    public void Orange_MyInfoDetails_BirthDateMonth_Boundary_012() throws InterruptedException {
        validLogin();
        fromDashboardToMyInfoPage();
        myInfoPage.setBirthDateInputMonth("13");
        myInfoPage.clickFirstSaveBtn();
        myInfoPage.errorMessageVisible();
    }

    @Test(description = "day test with 00, HBYTES-T20", groups = {"date", "regression"})
    public void Orange_MyInfoDetails_BirthDateDay_WithMonth2_Boundary_013() throws InterruptedException {
        validLogin();
        fromDashboardToMyInfoPage();
        myInfoPage.setBirthDateInputMonth2AndDay("2001", "00");
        myInfoPage.clickFirstSaveBtn();
        myInfoPage.errorMessageVisible();
    }

    @Test(description = "day test with 01, HBYTES-T21", groups = {"date", "regression"})
    public void Orange_MyInfoDetails_BirthDateDay_WithMonth2_Boundary_014() throws InterruptedException {
        validLogin();
        fromDashboardToMyInfoPage();
        myInfoPage.setBirthDateInputMonth2AndDay("2001", "01");
        myInfoPage.clickFirstSaveBtn();
        myInfoPage.errorMessageNotVisible();
    }

    @Test(description = "day test with 02, HBYTES-T22", groups = {"date", "regression"})
    public void Orange_MyInfoDetails_BirthDateDay_WithMonth2_Boundary_015() throws InterruptedException {
        validLogin();
        fromDashboardToMyInfoPage();
        myInfoPage.setBirthDateInputMonth2AndDay("2001", "02");
        myInfoPage.clickFirstSaveBtn();
        myInfoPage.errorMessageNotVisible();
    }

    @Test(description = "day test with 28 in 2 month, HBYTES-T23", groups = {"date", "regression"})
    public void Orange_MyInfoDetails_BirthDateDay_WithYear2004Month2_Boundary_016() throws InterruptedException {
        validLogin();
        fromDashboardToMyInfoPage();
        myInfoPage.setBirthDateInputMonth2AndDay("2004", "28");
        myInfoPage.clickFirstSaveBtn();
        myInfoPage.errorMessageNotVisible();
    }

    @Test(description = "day test with 29 in 2 month, HBYTES-T24", groups = {"date", "regression"})
    public void Orange_MyInfoDetails_BirthDateDay_WithYear2004Month2_Boundary_017() throws InterruptedException {
        validLogin();
        fromDashboardToMyInfoPage();
        myInfoPage.setBirthDateInputMonth2AndDay("2004", "29");
        myInfoPage.clickFirstSaveBtn();
        myInfoPage.errorMessageNotVisible();
    }

    @Test(description = "day test with 30 in 2 month, HBYTES-T25", groups = {"date", "regression"})
    public void Orange_MyInfoDetails_BirthDateDay_WithYear2004Month2_Boundary_018() throws InterruptedException {
        validLogin();
        fromDashboardToMyInfoPage();
        myInfoPage.setBirthDateInputMonth2AndDay("2004", "30");
        myInfoPage.clickFirstSaveBtn();
        myInfoPage.errorMessageVisible();
    }

    @Test(description = "day test with 30 in 3 month, HBYTES-T26", groups = {"date", "regression"})
    public void Orange_MyInfoDetails_BirthDateDay_WithMonth3Boundary_019() throws InterruptedException {
        validLogin();
        fromDashboardToMyInfoPage();
        myInfoPage.setBirthDateInputMonth3AndDay("30");
        myInfoPage.clickFirstSaveBtn();
        myInfoPage.errorMessageNotVisible();
    }

    @Test(description = "day test with 31 in 3 month, HBYTES-T27", groups = {"date", "regression"})
    public void Orange_MyInfoDetails_BirthDateDay_WithMonth3Boundary_020() throws InterruptedException {
        validLogin();
        fromDashboardToMyInfoPage();
        myInfoPage.setBirthDateInputMonth3AndDay("31");
        myInfoPage.clickFirstSaveBtn();
        myInfoPage.errorMessageNotVisible();
    }

    @Test(description = "day test with 32 in 3 month, HBYTES-T28", groups = {"date", "regression"})
    public void Orange_MyInfoDetails_BirthDateDay_WithMonth3Boundary_021() throws InterruptedException {
        validLogin();
        fromDashboardToMyInfoPage();
        myInfoPage.setBirthDateInputMonth3AndDay("32");
        myInfoPage.clickFirstSaveBtn();
        myInfoPage.errorMessageVisible();
    }

    @Test(description = "day test with 29 in 4 month, HBYTES-T29", groups = {"date", "regression"})
    public void Orange_MyInfoDetails_BirthDateDay_WithMonth4Boundary_022() throws InterruptedException {
        validLogin();
        fromDashboardToMyInfoPage();
        myInfoPage.setBirthDateInputMonth4AndDay("29");
        myInfoPage.clickFirstSaveBtn();
        myInfoPage.errorMessageNotVisible();
    }

    @Test(description = "day test with 30 in 4 month, HBYTES-T30", groups = {"date", "regression"})
    public void Orange_MyInfoDetails_BirthDateDay_WithMonth4Boundary_023() throws InterruptedException {
        validLogin();
        fromDashboardToMyInfoPage();
        myInfoPage.setBirthDateInputMonth4AndDay("30");
        myInfoPage.clickFirstSaveBtn();
        myInfoPage.errorMessageNotVisible();
    }

    @Test(description = "day test with 31 in 4 month, HBYTES-T31", groups = {"date", "regression"})
    public void Orange_MyInfoDetails_BirthDateDay_WithMonth3Boundary_024() throws InterruptedException {
        validLogin();
        fromDashboardToMyInfoPage();
        myInfoPage.setBirthDateInputMonth4AndDay("31");
        myInfoPage.clickFirstSaveBtn();
        myInfoPage.errorMessageVisible();
    }

    @Test(description = "day test with 27 in 2 month, HBYTES-T61", groups = {"date", "regression"})
    public void Orange_MyInfoDetails_BirthDateDay_WithYear2002Month2_Boundary_025() throws InterruptedException {
        validLogin();
        fromDashboardToMyInfoPage();
        myInfoPage.setBirthDateInputMonth2AndDay("2002", "27");
        myInfoPage.clickFirstSaveBtn();
        myInfoPage.errorMessageNotVisible();
    }

    @Test(description = "day test with 28 in 2 month, HBYTES-T62", groups = {"date", "regression"})
    public void Orange_MyInfoDetails_BirthDateDay_WithYear2002Month2_Boundary_026() throws InterruptedException {
        validLogin();
        fromDashboardToMyInfoPage();
        myInfoPage.setBirthDateInputMonth2AndDay("2002", "28");
        myInfoPage.clickFirstSaveBtn();
        myInfoPage.errorMessageNotVisible();
    }

    @Test(description = "day test with 29 in 2 month, HBYTES-T63", groups = {"date", "regression"})
    public void Orange_MyInfoDetails_BirthDateDay_WithYear2002Month2_Boundary_027() throws InterruptedException {
        validLogin();
        fromDashboardToMyInfoPage();
        myInfoPage.setBirthDateInputMonth2AndDay("2002", "29");
        myInfoPage.clickFirstSaveBtn();
        myInfoPage.errorMessageVisible();
    }
}
