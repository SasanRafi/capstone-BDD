package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import junit.framework.Assert;

public class HomePageObj extends Base{
	public HomePageObj() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Currency']")
	private WebElement currencyDropDown;
	
	@FindBy(xpath="//button[text()='€ Euro']")
	private WebElement euroCurrencyFromDropDown;
	
	@FindBy(xpath="//span[text()='Shopping Cart']")
	private WebElement shoppingCart;
	
	@FindBy(xpath= "//strong")
	private WebElement currencyType;
	
	@FindBy(xpath="//div[@class='col-sm-12']//p[text()='Your shopping cart is empty!'][1]")
	private WebElement textFromShopingCart;
	
	
	
	
	
	
	public void clickCurrencyDropDown() {
		currencyDropDown.click();
	}
	public void selectingEuroCurrencyFromDropdown() {
		euroCurrencyFromDropDown.click();
	}
	public void clickShoppingCart() {
		shoppingCart.click();
	}public String getTextFromClickingShoppingCart() {
		String shoppingCartText=textFromShopingCart.getText();
		return shoppingCartText;
	}
	
	@SuppressWarnings("deprecation")
	public void isEuro() {
	String expected = "€";
	String actual = currencyType.getText();
	Assert.assertEquals(expected,actual);
	
	}

}
