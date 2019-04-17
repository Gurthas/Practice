package com.mia.Report;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

public class TestReport extends TestListenerAdapter {
	private static String reportPath;

	// 实现ItestListener接口的onStart方法
	public void onStart(ITestContext context) {
		File htmlReportDir = new File("D:/logs/mia-test");
		if (!htmlReportDir.exists()) {
			htmlReportDir.mkdirs();
		}
		Date date = new Date();
		SimpleDateFormat timeFormater = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		String str = timeFormater.format(date);
		String reportName = "蜜芽自动化测试报告" + str + ".html";
		reportPath = htmlReportDir + "/" + reportName;
		File report = new File(htmlReportDir, reportName);
		if (report.exists()) {
			try {
				report.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		String msg = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" /><meta name=\"author\" content=\"ec-qa:xin.wang\"><meta name=\"description\" content=\"蜜芽接口用例测试结果\"><title>蜜芽自动化测试报告</title></head><body STYLE=\"background-color:#FFFFFF;\" align=\"center\"><br><a style=\"font-weight:bold;\">测试用例运行结果列表</a><br><br><table width=\"90%\" height=\"80\" border=\"1\" align=\"center\" style=\"table-layout:fixed;\"><thead><tr>"
				+ "<th>自动化测试用例编号</th><th>测试用例信息</th><th>测试接口名称</th><th>测试用例业务参数信息</th><th>预期测试结果</th><th>测试用例执行状态</th><th>测试用例执行概要</th></tr>"
				+ "</thead><tbody style=\"word-wrap:break-word;font-weight:bold;\">";
		try {
			Files.write((Paths.get(reportPath)), msg.getBytes("utf-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// 实现ItestListener接口的onTestSkipped方法
	public void onTestSkipped(ITestResult result) {
		StringBuilder caseRes = new StringBuilder("<tr><td>");
		caseRes.append(result.getMethod().getRealClass() + "." + result.getMethod().getMethodName());
		caseRes.append("</td><td>Skipped</td></tr>");
		String res = caseRes.toString();
		try {
			Files.write((Paths.get(reportPath)), res.getBytes("utf-8"), StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 实现ItestListener接口的onTestSuccess方法
	public void onTestSuccess(ITestResult result) {
		StringBuilder caseRes = new StringBuilder();

		for (int i = 0; i < Reporter.getOutput(result).size(); i++) {

			// caseResappend("<tr><td>");
			
			caseRes.append("</td><td>").append(Reporter.getOutput(result).get(i));
			i++;
			caseRes.append("</td><td>").append(Reporter.getOutput(result).get(i));
			i++;
			caseRes.append("</td><td>").append(Reporter.getOutput(result).get(i));
			i++;
			caseRes.append("</td><td>").append(Reporter.getOutput(result).get(i));
			i++;
			caseRes.append("</td><td>").append(Reporter.getOutput(result).get(i));
			i++;
			//caseRes.append("</td><td>").append(result.get);
			caseRes.append("</td><td>").append(result.isSuccess());
			// caseRes.append("</td><td>").append(Reporter.getOutput(result).get(5));
			caseRes.append("</td></tr>");
		}
		String res = caseRes.toString();
		try {
			Files.write((Paths.get(reportPath)), res.getBytes("utf-8"), StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 实现ItestListener接口的onTestFailure方法
	public void onTestFailure(ITestResult result) {

		StringBuilder caseRes = new StringBuilder();

		for (int i = 0; i < Reporter.getOutput(result).size(); i++) {

			caseRes.append("</td><td>").append(Reporter.getOutput(result).size() + Reporter.getOutput(result).get(i));
			i++;
			caseRes.append("</td><td>").append(Reporter.getOutput(result).get(i));
			i++;
			caseRes.append("</td><td>").append(Reporter.getOutput(result).get(i));
			i++;
			caseRes.append("</td><td>").append(Reporter.getOutput(result).get(i));
			i++;
			caseRes.append("</td><td><span style=\"color:red\">").append(Reporter.getOutput(result).get(i));
			i++;
			caseRes.append("</span></td><td><span style=\"color:red\">").append(result.isSuccess());
			caseRes.append("</span></td><td>").append(Reporter.getOutput(result).get(i));
			caseRes.append("</td></tr>");
		}
		String res = caseRes.toString();

		try {
			Files.write((Paths.get(reportPath)), res.getBytes("utf-8"), StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 实现ItestListener接口的onTestFailure方法
	public void onFinish(ITestContext testContext) {

		String msg = "</tbody></table></body></html>";
		try {
			Files.write((Paths.get(reportPath)), msg.getBytes("utf-8"), StandardOpenOption.APPEND);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
