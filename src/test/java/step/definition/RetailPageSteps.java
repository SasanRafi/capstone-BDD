package step.definition;

import core.Base;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.RetailPageObj;


public class RetailPageSteps extends Base {
	RetailPageObj retailPageObj = new RetailPageObj();

	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		String expectedText = "TEST ENVIRONMENT";
		String acctualText = retailPageObj.getTestEnvironmentText();
		Assert.assertEquals(expectedText, acctualText);
		logger.info(acctualText);

	}

	@And("User click on MyAccount")
	public void user_click_on_myAccount() {
		retailPageObj.clickMyAccountLink();
		logger.info("My Account Link Clicked Successfully");

	}

	@When("User click on Login")
	public void user_click_on_login() {
		retailPageObj.clickLoginLink();
		logger.info("Login Link Clicked Successfully");

	}

	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String userName, String password) {
		retailPageObj.enterUserName(userName);
		retailPageObj.enterPassword(password);
		logger.info("User Name and Passworrd Entered Successfully");

	}

	@And("User click on Login button")
	public void user_click_on_login_button() {
		retailPageObj.clickLoginBttn();
		logger.info("Login Button Clicked Successfully");
	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_myAccount_dashboard() {
		String expectedText = "My Account";
		String actualText = retailPageObj.getTextAfterLogin();
		Assert.assertEquals(expectedText, actualText);
		logger.info("My Account was verified Successfully ");

	}

	@When("User click on {string} link")
	public void user_click_on_link(String string) {
		retailPageObj.clickRegisterForAnAffiliateAccountLink();
		logger.info("user Successfully Clicked on Register for an affiliate account Link ");

	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
		List<Map<String, String>> fillAffiliateForm = dataTable.asMaps(String.class, String.class);
		retailPageObj.enterCompanyName(fillAffiliateForm.get(0).get("company"));
		retailPageObj.enterWebsite(fillAffiliateForm.get(0).get("website"));
		retailPageObj.enterTaxID(fillAffiliateForm.get(0).get("taxID"));
		retailPageObj.selectPaymentMethod(fillAffiliateForm.get(0).get("paymentMethod"));
		logger.info("User Successfully Filled Company Name,Website,TaxID and PaymentMethod");
	}

	@When("User fill the cheque payee name")
	public void user_fill_the_cheque_payee_name() {
		retailPageObj.enterChequePayName();
		logger.info("User Successfully Filled cheque Payee Name");

	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retailPageObj.clickOnCheckBox();
		logger.info("User Successfully Clicked on CheckBox");

	}

	@When("User click on Continue button1")
	public void user_click_on_continue_button1() {
		retailPageObj.clickOnContinueBttn1();
		logger.info("User Successfully Clicked on Continue Button");

	}

	@Then("User should see a success message1")
	public void user_should_see_a_success_message1() {
		String expectedText = "Success: Your account has been successfully updated.";
		String acctualText = retailPageObj.printSuccessMessage();
		String acctualTextSub = acctualText.substring(0, acctualText.length());
		Assert.assertEquals(expectedText, acctualTextSub);
		logger.info(acctualTextSub);

	}

	@When("User click on {string} link1")
	public void user_click_on_link1(String string) {
		retailPageObj.clickOnEditAffiliate();
		logger.info("User Successfully Clicked On Edit Affiliate Link");
	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retailPageObj.clickBankTransferBttn();
		logger.info("User Successfully Clicked On Bank Transfer Button");

	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> fillBankInfo = dataTable.asMaps(String.class, String.class);
		retailPageObj.enterBankName(fillBankInfo.get(0).get("bankName"));
		retailPageObj.enterBranchNumber(fillBankInfo.get(0).get("abaNumber"));
		retailPageObj.enterSwiftCode(fillBankInfo.get(0).get("swiftCode"));
		retailPageObj.enterAccountName(fillBankInfo.get(0).get("accountName"));
		retailPageObj.enterAccountNumber(fillBankInfo.get(0).get("accountNumber"));
		logger.info("User Successfully Filled Bank Name, Aba Number, Swift Code, Account Name, Account Number");

	}

	@When("User click on Continue button2")
	public void user_click_on_continue_button2() {
		retailPageObj.clickContinueBttn();
		logger.info("User Clicked On Continue Button");

	}

	@Then("User should see a success message2")
	public void user_should_see_a_success_message2() {
		String expectedText = "Success: Your account has been successfully updated.";
		String acctualText = retailPageObj.printSuccessMessage2();
		String acctualTextSub = acctualText.substring(0, acctualText.length());
		Assert.assertEquals(expectedText, acctualTextSub);
		logger.info(acctualTextSub);

	}

	@When("User click on {string} link2")
	public void user_click_on_link2(String string) {
		retailPageObj.clickonEditYourAccountInfoLink();
		logger.info("User Successfully Clicked on Edit Your Accout Information Link");

	}

	@When("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
		List<Map<String, String>> updateAccountInfo = dataTable.asMaps(String.class, String.class);
		retailPageObj.updateFirstName(updateAccountInfo.get(0).get("firstname"));
		retailPageObj.updateLasttName(updateAccountInfo.get(0).get("lastName"));
		retailPageObj.updatedEmailAddFeild(updateAccountInfo.get(0).get("email"));
		retailPageObj.updatedPhoneFeild(updateAccountInfo.get(0).get("telephone"));
		logger.info("User Successfully Updated First Name, Last Name, Email and Phone Number");

	}

	@When("User click on continue button")
	public void user_click_on_continue_button() {

		retailPageObj.clickonUpdatepageContinueBttn();
		logger.info("User Successfully Clicked On Continue Button");

	}

	@Then("User should see a message4 {string}")
	public void user_should_see_a_message(String string) {
		String expectedText = "Success: Your account has been successfully updated.";
		String acctualText = retailPageObj.getTextFromUI();
		String acctualTextSub = acctualText.substring(0, acctualText.length());
		Assert.assertEquals(expectedText, acctualTextSub);
		logger.info(acctualTextSub);

		
	}

}
