package testScripts;

import java.io.FileNotFoundException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjectPackage.TestBase;
import Pages.HomePage;
import Pages.ItemPage;

public class PlaceOrderTest extends TestBase {

	HomePage home;
	ItemPage item;

	@BeforeTest
	public void launchBrowser() {
		initializeBRowser();
	}

	@Test
	public void PlaceOrder() {
		home = new HomePage();
		item = new ItemPage();
		try {
			home.SearchBox("Parry Hotter");
			item.SelectItem();
			item.AddItemToCart();

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
