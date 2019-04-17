package com.mia.Test.Checkout;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import com.mia.Report.SimpleReportFactory;
import com.mia.Report.TestReport;

public class Test001C {

	private ExtentReports reporter = SimpleReportFactory.getReporter();

	public void complexTest001() {
		ExtentTest testReporter = reporter.startTest("complexTest001", "This is a simple simpleTest001");
		testReporter.log(LogStatus.INFO, "Starting test complexTest001");
		int a = 100;
		int b = 30;

		testReporter.log(LogStatus.INFO, "Loading the value of a to " + a);
		testReporter.log(LogStatus.PASS, "Loading the value of b to " + b);
		reporter.endTest(testReporter);
	}


	public void afterSuite()
	{
		reporter.close();
	}

}
