package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PageObjectPackage.TestBase;

public class shoppingCartPage extends TestBase{

	@FindBy(id="billing-coupon")
	WebElement couponCheckbox;
	
	@FindBy(id="coupon")
	WebElement couponTextkbox;
	
	@FindBy(xpath="//button[text()='Apply']")
	WebElement ApplyCoupon;
	
	
	public shoppingCartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void check_xoupnCheckbox() {
		if(couponCheckbox.isDisplayed()) {
			couponCheckbox.click();
		}
	}
	
	public void Enter_coupon() {
		if(couponTextkbox.isDisplayed()) {
			couponTextkbox.sendKeys("");;
		}
	}
}
