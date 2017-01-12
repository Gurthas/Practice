package com.mia.Report;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestngListener extends TestListenerAdapter {
	private static Logger log = LogManager.getLogger("TestngListener");

	// protected ExtentReports extent;
	// protected ExtentTest test;

	@Override
	public void onTestStart(ITestResult tr) {
		super.onTestStart(tr);
		log.info("\n" + "**************************************************" + "\n" + "接口测试开始");
		// extent=ExtentReport.getextent();
		// test= extent.startTest(tr.getName());

	}

	@Override
	public void onTestFailure(ITestResult tr) {
		super.onTestFailure(tr);
		log.info("\n" + "用例执行失败" + "\n" + "**************************************************" + "\n");
		// extent=ExtentReport.getextent();
		// test.log(LogStatus.FAIL, tr.getThrowable());
		// extent.endTest(test);

	}

	@Override
	public void onTestSkipped(ITestResult tr) {
		super.onTestSkipped(tr);
		log.info("\n" + "用例跳过" + "\n" + "**************************************************" + "\n");
		// test.log(LogStatus.SKIP, "SKIP");
		// extent=ExtentReport.getextent();
		// extent.endTest(test);
	}

	@Override
	public void onTestSuccess(ITestResult tr) {
		super.onTestSuccess(tr);
		log.info("\n" + "用例执行成功" + "\n" + "**************************************************" + "\n");
		// test.log(LogStatus.PASS, "Pass");
		// extent=ExtentReport.getextent();
		// extent.endTest(test);
	}

	@Override
	public void onFinish(ITestContext testContext) {
		super.onFinish(testContext);
	}

}
