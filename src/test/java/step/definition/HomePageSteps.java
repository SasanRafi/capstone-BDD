package step.definition;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePageObj;
import org.junit.Assert;

public class HomePageSteps extends Base{
	
	HomePageObj homePageObj = new HomePageObj();
	
	
	@When("User click on Currency")
	public void user_click_on_currency() {
		homePageObj.clickCurrencyDropDown();
		logger.info("User Successfully Clicked on Currency Drop Down");
	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homePageObj.selectingEuroCurrencyFromDropdown();
		logger.info("User Successfully Chose Euro From Drop Down");
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		homePageObj.isEuro();
		logger.info("Currency is Euro");
	}

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homePageObj.clickShoppingCart();
		logger.info("User Successfully Clicked on Shopping Cart Button");
	}

	@Then("{string} message should display")
	public void message_should_display(String string) {
		String expectedtext="Your shopping cart is empty!";
		String actualText=homePageObj.getTextFromClickingShoppingCart();
		Assert.assertEquals(expectedtext, actualText);
		logger.info(actualText);
	}

}
