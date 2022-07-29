package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import junit.framework.Assert;
import utilities.Utils;

public class DesktopsTabObj extends Base {
	public DesktopsTabObj() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Desktops']")
	private WebElement desktopsTab;
	
	
	@FindBy(xpath="//a[text()='Show All Desktops']")
	private WebElement showAllDesktopsTab;
	
	
	@FindBy(tagName="img")
	private List<WebElement> allItems;
	
	@FindBy(xpath ="//a[text()='HP LP3065']")
			private WebElement addToCart;
	
	@FindBy(xpath="//input[@id='input-quantity']")
	private WebElement quantityFeild;
	
	@FindBy(xpath="//button[@id='button-cart']")
	private WebElement addtoCartButtn;
	
	@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")
	private WebElement successMessage;
	
	@FindBy(xpath="//a[text()='Canon EOS 5D Camera']")
	private WebElement canonEo5DCamera;
	
	@FindBy(xpath="//select[@id='input-option226']")
	private WebElement dropdown;
	
	@FindBy(xpath="//a[text()='Canon EOS 5D Camera']")
	private WebElement Eos5DCamera;
	
	@FindBy(xpath="//a[text()='Reviews (0)']")
	private WebElement reviewLink;
	
	@FindBy(xpath="//input[@id='input-name']")
	private WebElement yourNameField;
	
	@FindBy(xpath="//textarea[@id='input-review']")
	private WebElement reviewField;
	
	@FindBy(xpath="//input[@type='radio']")
	private List<WebElement> rating;
	
	@FindBy(xpath="//button[@id='button-review']")
	private WebElement reviewButtn;
	
	
	
	
	
	
	
	
	
	

	
	public void clickDesktopsTab() {
		desktopsTab.click();
	}
	public void clickShowAllDesktopsTab() {
		showAllDesktopsTab.click();
	}
	public List<WebElement>desktopsAllItems(){
		List<WebElement> showAllItems=allItems;
		return showAllItems;
	}
	public void addHPLP3065ToCart() {
		addToCart.click();
	}
	public void enterQuantity(String quantity) {
		quantityFeild.clear();
		quantityFeild.sendKeys(quantity);
	}
	public void clickAddtoCartButtn() {
		addtoCartButtn.click();
	}
	
	
	@SuppressWarnings("deprecation")
	public void successMessage(String expected) {
		String actualSuccessMessage;
		actualSuccessMessage = Utils.getText(successMessage).substring(0, Utils.getText(successMessage).length()-2);
		Assert.assertEquals(expected, actualSuccessMessage);
	}
	
	@SuppressWarnings("deprecation")
	public void successMessage1(String expected) {
		String actualSuccessMessage;
		actualSuccessMessage = Utils.getText(successMessage);
		Assert.assertEquals(expected, actualSuccessMessage);
	}
	
	
	public void addCanonEo5DCameraToCart() {
		canonEo5DCamera.click();
	}
	public void selectRedValueFromDropDown() {
		Select select = new Select(dropdown);
		select.selectByVisibleText("Red");
	}
	public void clickEos5DCamera() {
		Eos5DCamera.click();
	}
	public void clickOnReviewLink() {
		reviewLink.click();
	}
	public void enterYourName(String yourname) {
		yourNameField.sendKeys(yourname);
	}
	public void enterReview(String review) {
		reviewField.sendKeys(review);	
	}
	public void ratingSelection(String ratingValue){
		//List<WebElement> ratings= rating;
		for(WebElement element : rating) {
			if(element.getAttribute("value").equalsIgnoreCase(ratingValue.trim())) {
				element.click();
				break;
			}
		}
	}
	public void clickOnReviewButtn() {
		reviewButtn.click();
	}

}
