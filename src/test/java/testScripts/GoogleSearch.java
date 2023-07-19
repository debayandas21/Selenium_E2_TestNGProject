package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class GoogleSearch {

	WebDriver driver;
	ExtentReports reports;
	ExtentSparkReporter spark;
	ExtentTest extentTest;
	
	@BeforeTest
	public void SetupExtent() {
		reports= new ExtentReports();
		spark= new ExtentSparkReporter("Reports/testresult.html");
		reports.attachReporter(spark);
	}
	@Parameters("Browser")
	@BeforeMethod
	public void Setup(String browserName) {
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			driver= new ChromeDriver();
			driver.manage().window().maximize();
		} else if(browserName.equalsIgnoreCase("FireFox")) {
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test
	public void JavaTutorial_Search() {
		
		extentTest= reports.createTest("Java Tutorial search");
		driver.get("https://google.com/");
		
		SoftAssert sfAssert= new SoftAssert();
		
		sfAssert.assertEquals(driver.getTitle(), "Gogle - search");
		
		WebElement SearchBox= driver.findElement(By.name("q"));
		SearchBox.sendKeys("Java Tutorial");
		SearchBox.submit();
		Assert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search");
		
		
	}
	
	@Test
	public void SeleniumTutorial_Search() {
		extentTest= reports.createTest("Selenium Tutorial search");
		driver.get("https://google.com/");
		WebElement SearchBox = driver.findElement(By.name("q"));
		SearchBox.sendKeys("Selenium Tutorial");
		SearchBox.submit();
		
		Assert.assertEquals(driver.getTitle(), "elenium Tutorial - Google Search");

	}
	
	@AfterTest
	public void flush() {
		reports.flush();
	}
	
	@AfterMethod
	public void generateReport(ITestResult result) {
		if(result.getStatus()== ITestResult.FAILURE) {
			extentTest.fail(result.getThrowable().getMessage());
		}
			
		driver.close();
	}

}
