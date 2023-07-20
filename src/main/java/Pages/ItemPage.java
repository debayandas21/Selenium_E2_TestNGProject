package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import PageObjectPackage.TestBase;

public class ItemPage extends TestBase
{

	@FindBy(xpath="//div[text()='Parry Hotter']")
	WebElement ItemBox;
	@FindBy(xpath="//button[text()='Add to cart']")
	WebElement AddItem;
	
	public ItemPage(){
		PageFactory.initElements(driver, this);
	}

	public void SelectItem() throws Exception
	{
		try {
			if(ItemBox.isDisplayed()) {
				ItemBox.click();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void AddItemToCart() throws Exception
	{
		try {
			if(AddItem.isDisplayed()) {
				AddItem.click();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
