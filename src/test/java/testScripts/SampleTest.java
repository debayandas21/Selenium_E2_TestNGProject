package testScripts;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
	
	
  @Test
  public void CypressTutorial_search() {
	  
	  	WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://google.com/");
		WebElement SearchBox= driver.findElement(By.name("q"));
		SearchBox.sendKeys("Cypress Tutorial");
		SearchBox.submit();
		Assert.assertEquals(driver.getTitle(), "Cypress Tutorial - Google Search");
		driver.close();
		
  }
}
