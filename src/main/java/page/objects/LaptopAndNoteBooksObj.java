package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopAndNoteBooksObj extends Base{
	
	public LaptopAndNoteBooksObj() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Laptops & Notebooks']")
	private WebElement laptopsNotebooksLink;
	
	@FindBy(xpath="//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsNotebooksLink;
	
	@FindBy(xpath="//a[text()='MacBook']")
	private WebElement macBookLink;
	
	@FindBy(xpath="//button[text()='Add to Cart']")
	private WebElement addToCartButton;
	
	@FindBy(xpath="//span[@id=\"cart-total\"]")
	private WebElement shoppingCartButton;
	
	
	
	@FindBy(xpath="//button[@title='Remove']")
	private WebElement xButton;
	
	
	@FindBy(xpath="//button[@onclick=\"compare.add('43');\"]")
	private WebElement macBookComparisonButton;
	
	@FindBy(xpath="//button[@onclick=\"compare.add('44');\"]")
	private WebElement macBookAirComparisonButton;
	
	
	@FindBy(xpath="//a[@id='compare-total']")
	private WebElement comparisonLink;
	
	@FindBy(xpath="//h1[text()='Product Comparison']")
	private WebElement productComparisonchart;
	
	@FindBy(xpath="//button[@onclick=\"wishlist.add('46');\"]")
	private WebElement addToWishListButton;
	
	
	@FindBy(xpath="//a[text()='MacBook Pro']")
	private WebElement macBookPro;
	

	@FindBy(xpath="//h2[text()='$2,000.00']")
	private WebElement macBookProPrice;
	
	
	
	
	
	
	
	
	
	
	
	public void mouseHovertoLaptopsNotebooksLink() {
		Actions actions = new Actions(driver);
		actions.moveToElement(laptopsNotebooksLink).perform();	
	}
	public void clicksShowAllLaptopsNotebooksLink() {
		showAllLaptopsNotebooksLink.click();
	}
	public void clickMacBookLink() {
		macBookLink.click();
	}
	public void clickAddToCartButton() {
		addToCartButton.click();
	}

	public String shoppingCartMessage() {
		
		String textFromUI = shoppingCartButton.getText();
		return textFromUI;
	}
	public void clickShoppingCartButton() {
		shoppingCartButton.click();
	}
	public void clickXButton() {
		xButton.click();
	}

	public void clickMacBookComparisonButton() {
		macBookComparisonButton.click();
	}
	public void clickMacBookAirComparisonButton() {
		macBookAirComparisonButton.click();
	}
	
	public void clickOnComparisonLink() {
		comparisonLink.click();
	}
	public String getProductComparisonText() {
		String textFromUI = productComparisonchart.getText();
		return textFromUI;
	}
	public void clickAddToWishListButton() {
		addToWishListButton.click();
	}
	public void clickOnMacBookPro() {
		macBookPro.click();
	}
	public String macBookProPriceinUI() {
		String textFromUI = macBookProPrice.getText();
		return textFromUI;
	}

}
