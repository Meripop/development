package utils.listeners;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import hu.happybytes.driverfactory.DriverBaseTest;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.Base64;

public class TestListener extends DriverBaseTest implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        extentTest = extentReports.createTest(result.getMethod().getMethodName());
        extentTest.log(Status.INFO, "Test started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        String base64 = Base64.getEncoder().encodeToString(screenshot);
        extentTest.log(Status.INFO, "Attached Screenshot ", MediaEntityBuilder.createScreenCaptureFromBase64String("data:image/png;base64," + base64).build());
        extentTest.log(Status.PASS, "Test passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        String base64 = Base64.getEncoder().encodeToString(screenshot);
        extentTest.fail(result.getThrowable());
        extentTest.log(Status.INFO, "Attached Screenshot ", MediaEntityBuilder.createScreenCaptureFromBase64String("data:image/png;base64," + base64).build());
        extentTest.log(Status.INFO, "Test failed");

    }

    @Override
    public void onFinish(ITestContext context) {
        extentReports.flush();
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        String base64 = Base64.getEncoder().encodeToString(screenshot);
        extentTest.log(Status.INFO, "Attached Screenshot ", MediaEntityBuilder.createScreenCaptureFromBase64String("data:image/png;base64," + base64).build());
        extentTest.log(Status.SKIP, "Test skipped");
    }
}
