package ExtentReport;

//import org.junit.BeforeClass;
//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


@Test
public class ExtentReportDemo {

	static ExtentReports extent;
	static ExtentSparkReporter spark;
	
	@BeforeClass
	public void starttest()
	{
		extent= new ExtentReports();
		spark = new ExtentSparkReporter("taget/Spark.html");
	}
	public void extenttest() {
		 
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("AutomationReport");
		spark.config().setReportName("RepordDemo");
		extent.attachReporter(spark);
		
		//create a test node in report
		ExtentTest test= extent.createTest("Login test").assignAuthor("Lalli");
		test.pass("Login Test Successfull");
		test.info("url loaded");
		test.pass("login test completed successfully");
		
		
		//create test node in the report
		ExtentTest test1 = extent.createTest("HomePage test").assignAuthor("Lalli");
		test1.pass("Login Test Successfull");
		test1.info("value entered");
		test1.pass("Homepage test fails");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		if(driver.getTitle().equals("Google"))
		{
			test.log(Status.PASS, "navigated to specified url");
		}
		else
		{
			test.log(Status.FAIL, "Test Failed");
		}
		driver.quit();
	}
	@AfterMethod
	public void teardown() {
		extent.flush();
		
	
		
		
		
		
	}

		
	}

