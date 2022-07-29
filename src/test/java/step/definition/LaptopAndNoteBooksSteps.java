package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.LaptopAndNoteBooksObj;

public class LaptopAndNoteBooksSteps extends Base{
	LaptopAndNoteBooksObj laptopAndNoteBooksObj = new LaptopAndNoteBooksObj();
	
	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		laptopAndNoteBooksObj.mouseHovertoLaptopsNotebooksLink();
		logger.info("User Successfully Mouse Hovered to Laptop & NoteBook Tab");
	  
	}

	@When("User clickon Show all Laptop &NoteBook option")
	public void user_clickon_show_all_laptop_note_book_option() {
		laptopAndNoteBooksObj.clicksShowAllLaptopsNotebooksLink();
		logger.info("User Successfully Clicked on Show All Laptop & NoteBook Option");
	    
	}

	@When("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
		laptopAndNoteBooksObj.clickMacBookLink();
		logger.info("User Successfully Clicked on MacBook Item");
	   
	}

	@Then("User should see {string} showed to the cart")
	public void user_should_see_tem_s_00showed_to_the_cart(String cartTotal) {
		String acctualText = laptopAndNoteBooksObj.shoppingCartMessage();
		Assert.assertEquals(cartTotal, acctualText);
		logger.info(acctualText);
	    
	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		laptopAndNoteBooksObj.clickShoppingCartButton();
		logger.info("User Successfully Clicked on Cart option");
	    
	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptopAndNoteBooksObj.clickXButton();
		logger.info("User Successfully Clicked on X Button to Remove Item From Cart");
	    
	}

	@Then("item should be removed and cart should show {string}")
	public void cart_should_show_item_s(String cartTotal) throws InterruptedException {
		Thread.sleep(2000);
		String acctualText = laptopAndNoteBooksObj.shoppingCartMessage();
		Assert.assertEquals(cartTotal, acctualText);
		logger.info(acctualText);
	    
	}

	@When("User click on product comparison icon on MacBook")
	public void user_click_on_product_comparison_icon_on_mac_book() {
		laptopAndNoteBooksObj.clickMacBookComparisonButton();
		logger.info("User Successfully Clicked on MacBook Comparison Button");
	}
	@When("User click on product comparison icon on MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() throws InterruptedException {
		
		laptopAndNoteBooksObj.clickMacBookAirComparisonButton();
		Thread.sleep(2000);
		logger.info("User Successfully Clicked on MacBook Air Comparison Button");
	}
	

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		laptopAndNoteBooksObj.clickOnComparisonLink();
		logger.info("User Successfully Clicked on Comparison Link");
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		String expectedText = "Product Comparison";
		String acctualText = laptopAndNoteBooksObj.getProductComparisonText();
		Assert.assertEquals(expectedText, acctualText);
		logger.info(acctualText);
	    
	}

	@When("User click on heart icon to add Sony VaIO  laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
		laptopAndNoteBooksObj.clickAddToWishListButton();
		logger.info("User Successfully Clicked on Add To Whish List Button");
	    
	}


	@When("User click on MacBook Pro item")
	public void user_click_on_mac_book_pro_item() {
		laptopAndNoteBooksObj.clickOnMacBookPro();
		logger.info("User Successfully Clicked on MacBook Pro");
		
	    
	}
	@Then("User should see {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String string) {
		String expectedText = "$2,000.00";
		String acctualText = laptopAndNoteBooksObj.macBookProPriceinUI();
		Assert.assertEquals(expectedText, acctualText);
		logger.info(acctualText);
	    
	}
	
}
