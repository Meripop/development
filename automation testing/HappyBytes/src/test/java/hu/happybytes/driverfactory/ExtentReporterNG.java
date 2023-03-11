package hu.happybytes.driverfactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExtentReporterNG {
    public static ExtentReports extentReports;

    public static ExtentReports getReportObject() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss");
        LocalDateTime now = LocalDateTime.now();
        ExtentSparkReporter reporter = new ExtentSparkReporter("extent-reports/extent-" + dtf.format(now) + ".html");
        reporter.config().setReportName("Sample Extent Report");
        extentReports = new ExtentReports();
        extentReports.attachReporter(reporter);
        return extentReports;
    }
}
