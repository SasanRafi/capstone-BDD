package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopsTabObj;
import utilities.Utils;

public class DesktopsTabSteps extends Base{
	
	DesktopsTabObj desktopsTabObj = new DesktopsTabObj();
	
	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktopsTabObj.clickDesktopsTab();
		logger.info("User successfully Clicked on Desktops Tab");
		
	   
	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktopsTabObj.clickShowAllDesktopsTab();
		logger.info("User Successfully Clicked on Show all Desktops Tab");
	 
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		List <WebElement> desktopsElements=desktopsTabObj.desktopsAllItems();
		for(WebElement element:desktopsElements) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("title")+"is Present in UI");
			
		}
	   
	}

	@When("User click  ADD TO CART option on HP LP3065item")
	public void user_click_add_to_cart_option_on_hp_lp3065item() {
		desktopsTabObj.addHPLP3065ToCart();
		logger.info("HP LP3065 is Selected to Add to Cart");
	    
	}

	@When("User select quantity {string}")
	public void user_select_quantity(String string) {
		desktopsTabObj.enterQuantity(string);
		logger.info("User Successfully added Quantity on Quantity Feild");
	    
	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktopsTabObj.clickAddtoCartButtn();
		logger.info("User Successfully added the item to Cart");
	    
	}
	

	@When("User click  ADD TO CART option on Canon EOS 5Ditem")
	public void user_click_add_to_cart_option_on_canon_eos_5ditem() {
	    desktopsTabObj.addCanonEo5DCameraToCart();
	    logger.info("User Successfully Clicked to Add Canon Eos 5D Camera to Cart");
	}

	@When("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
	    desktopsTabObj.selectRedValueFromDropDown();
	    logger.info("User Successfully Selected Color Red from Dropdown");
	}

	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktopsTabObj.clickEos5DCamera();
		logger.info("User clicked on Canon EOS 5D");
	   
	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktopsTabObj.clickOnReviewLink();
		logger.info("User clicked on the review link");
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
	    List<Map<String,String>> review =dataTable.asMaps(String.class,String.class);
	    desktopsTabObj.enterYourName(review.get(0).get("yourname"));
	    desktopsTabObj.enterReview(review.get(0).get("yourReview"));
	    desktopsTabObj.ratingSelection(review.get(0).get("Rating"));
	    logger.info("User filled the review form");
	    
	}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		desktopsTabObj.clickOnReviewButtn();
		logger.info("User clicked on the continue review button");
	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message_with(String expected) {
		desktopsTabObj.successMessage(expected);
		logger.info("User saw message "+expected);
	    
	}
	
	
	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with1(String expected) {
		desktopsTabObj.successMessage1(expected);
		logger.info("User saw "+expected);
	    
	}

}
