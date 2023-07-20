package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import PageObjectPackage.TestBase;

public class HomePage extends TestBase
{

	@FindBy(name="searchbar")
	WebElement searchBox;
	@FindBy(id="button-search")
	WebElement SearchButton;
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}

	public void SearchBox(String item) throws Exception
	{
		try {
			searchBox.sendKeys(item);
			SearchButton.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
