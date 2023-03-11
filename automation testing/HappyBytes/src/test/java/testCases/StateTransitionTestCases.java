package testCases;

import hu.happybytes.driverfactory.DriverBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class StateTransitionTestCases extends DriverBaseTest {
    LoginPage loginPage;
    AdminPage adminPage;
    PIMPage pimPage;
    LeavePage leavePage;
    TimePage timePage;
    RecruitmentPage recruitmentPage;
    MyInfoPage myInfoPage;
    PerformancePage performancePage;
    DashboardPage dashboardPage;
    DirectoryPage directoryPage;
    MaintenancePage maintenancePage;
    BuzzPage buzzPage;
    LogoutPage logoutPage;

    @Test(groups = {"statetransition", "regression"}, description = "HBYTES-T32: Testing the transition between menu options")
    public void StateTransitionTest() {
        loginPage = new LoginPage(driver, wait);
        loginPage.loadLoginPage();
        loginPage.loginWithUNandPWD("Admin", "admin123");
        loginPage.clickLoginBtn();
        adminPage = new AdminPage(driver, wait);
        adminPage.adminMenuItemClickable();
        pimPage = new PIMPage(driver, wait);
        pimPage.pimPageMenuItemClickable();
        leavePage = new LeavePage(driver, wait);
        leavePage.leavePageMenuItemClickable();
        timePage = new TimePage(driver, wait);
        timePage.timePageMenuItemClickable();
        recruitmentPage = new RecruitmentPage(driver, wait);
        recruitmentPage.recruitmentMenuItemClickable();
        myInfoPage = new MyInfoPage(driver, wait);
        myInfoPage.myinfoPageMenuItem();
        myInfoPage.inMyinfoPersonalDetails();
        myInfoPage.inMyinfoContactDetails();
        myInfoPage.inMyinfoEmergencyContacts();
        myInfoPage.inMyinfoDependents();
        myInfoPage.inMyinfoImmigration();
        myInfoPage.inMyinfoJob();
        myInfoPage.inMyinfoSalary();
        myInfoPage.inMyInfoTaxExemptions();
        myInfoPage.inMyinfoReportTo();
        myInfoPage.inMyinfoQualifications();
        myInfoPage.inMyinfoMemberships();
        performancePage = new PerformancePage(driver, wait);
        performancePage.performancePageMenuItem();
        dashboardPage = new DashboardPage(driver, wait);
        dashboardPage.dashboardPageMenuItem();
        directoryPage = new DirectoryPage(driver, wait);
        directoryPage.directoryMenuPageItem();
        maintenancePage = new MaintenancePage(driver, wait);
        maintenancePage.maintenancePageMenuItem();
        maintenancePage.inMaintenanceAccessPage();
        buzzPage = new BuzzPage(driver, wait);
        buzzPage.buzzPageMenuItem();
        logoutPage = new LogoutPage(driver, wait);
        logoutPage.logoutProcess();
        Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
}



