package testScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvFieldAssignmentException;
import com.opencsv.exceptions.CsvValidationException;

import CommonUtils.utilities;

public class browserLoginPage {

	WebDriver driver;
	Properties prop;
	
	ExtentReports reports;
	ExtentSparkReporter spark;
	ExtentTest extentTest;
	
	

	@BeforeTest
	public void setupProperty() throws IOException {
		
		String browserName= prop.getProperty("browser");
			if(browserName.equalsIgnoreCase("chrome")) {
				driver= new ChromeDriver();
				driver.manage().window().maximize();
			} else if(browserName.equalsIgnoreCase("Edge")) {
				driver= new FirefoxDriver();
				driver.manage().window().maximize();
			}
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	@Test(dataProvider = "LoginData")
	public void loadBrowser(String UserName, String Passwrd) throws InterruptedException {
			// TODO Auto-generated method stub
			String url= prop.getProperty("url");
			driver.get(url);
			driver.manage().window().maximize();
			
			driver.findElement(By.name("username")).sendKeys(UserName);
			driver.findElement(By.name(Passwrd)).sendKeys("");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		}
	
	
	@DataProvider(name="LoginData")
	public Object[] getData()throws CsvValidationException, IOException
	{
		String path= System.getProperty("user.dir")+"\\src\\test\\resources\\DataFile\\testData.csv";
		CSVReader reader= new CSVReader(new FileReader(path));
		String cols[];
		ArrayList<Object> dataList= new ArrayList();
		while ((cols= reader.readNext())!= null) {
			Object record[]= {cols[0], cols[1]};
			dataList.add(record);
		}
		return dataList.toArray(new Object[dataList.size()]);
	}
}