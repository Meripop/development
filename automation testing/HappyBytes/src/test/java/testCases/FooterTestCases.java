package testCases;

import hu.happybytes.driverfactory.DriverBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FooterPage;
import pages.LoginPage;


public class FooterTestCases extends DriverBaseTest {
    LoginPage loginPage;
    FooterPage footerpage;

    private void loginStep() {
        loginPage = new LoginPage(driver, wait);
        loginPage.loadLoginPage();
        footerpage = new FooterPage(driver, wait);
    }

    @Test(groups = {"footer", "regression"}, description = "Linkedin button is clickable in the footer and works properly. HBYTES-T33")
    public void loginPage_LinkedIn_FooterIcon() throws InterruptedException {
        loginStep();
        footerpage.linkedinFooterButton();
        Thread.sleep(2000);
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.linkedin.com/company/orangehrm");
    }

    @Test(groups = {"footer", "regression"}, description = "Facebook button is clickable in the footer and works properly. HBYTES-T64")
    public void loginPage_Facebook_FooterIcon() throws InterruptedException {
        loginStep();
        footerpage.facebookFooterButton();
        Thread.sleep(2000);
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/OrangeHRM/");
    }

    @Test(groups = {"footer", "regression"}, description = "Twitter button is clickable in the footer and works properly. HBYTES-T65")
    public void loginPage_Twitter_FooterIcon() throws InterruptedException {
        loginStep();
        footerpage.twitterFooterButton();
        Thread.sleep(2000);
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(), "https://twitter.com/orangehrm?lang=en");
    }

    @Test(groups = {"footer", "regression"}, description = "Youtube button is clickable in the footer and works properly. HBYTES-T66")
    public void loginPage_YouTube_FooterIcon() throws InterruptedException {
        loginStep();
        footerpage.youtubeFooterButton();
        Thread.sleep(2000);
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.youtube.com/c/OrangeHRMInc");
    }
}
