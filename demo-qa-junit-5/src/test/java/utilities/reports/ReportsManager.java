package utilities.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;
import com.aventstack.extentreports.reporter.configuration.Theme;

import utilities.TestUtils;

public class ReportsManager {

	private static ReportsManager reportsManager;
	private static ExtentReports reports;
	private static ExtentSparkReporter sparkReporter;

	private ReportsManager() {
		reports = new ExtentReports();
		sparkReporter = new ExtentSparkReporter("target/extent-reports/Spark-" + TestUtils.getTimestamp() + ".html");
		reports.attachReporter(sparkReporter);

		sparkReporter.config(ExtentSparkReporterConfig.builder().encoding("UTF-8").offlineMode(true).theme(Theme.DARK)
				.documentTitle("Extent Spark").reportName("Demo Report").build());
	}

	public static ReportsManager getInstance() {
		if (reportsManager == null)
			reportsManager = new ReportsManager();
		return reportsManager;
	}

	public static void reset() {
		if (reportsManager != null)
			reportsManager = null;
	}

	public static ExtentReports getReports() {
		return reports;
	}

}
