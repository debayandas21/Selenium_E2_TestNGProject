package testScripts;

import java.io.FileNotFoundException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import PageObjectPackage.TestBase;
import Pages.HomePage;


public class PlaceOrderPage extends TestBase
{


	HomePage home;

	@BeforeTest
	public void launchBrowser() {
		initializeBRowser();
	}

	@Test
	public void PlaceOrder() {
		home = new HomePage();
		try {
			home.SearchBox("Harry Potter");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterTest
	public void checkOut() {
		driver.quit();
	}
}
