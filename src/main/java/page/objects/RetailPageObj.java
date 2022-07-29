package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObj extends Base {

	public RetailPageObj() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement testEnvironmentText;

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccount;

	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement userNameFeild;

	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement passwordFeild;

	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement loginButton;

	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement myAccountPage;

	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement registerForAnAffiliateAccountLink;

	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement companyFeild;

	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement webSiteFeild;

	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement taxIDFeild;

	@FindBy(xpath = "//input[@type='radio']")
	private List<WebElement> paymentMethod;

	@FindBy(xpath = "//input[@id='input-cheque']")
	private WebElement chequePayeeName;

	@FindBy(xpath = "//input[@name='agree']")
	private WebElement checkBox;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueBttn1;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage1;

	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement EditAffiliate;

	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankTransferBttn;

	@FindBy(xpath = "//input[@id='input-bank-name']")
	private WebElement bankNameFeild;

	@FindBy(xpath = "//input[@id='input-bank-branch-number']")
	private WebElement bankBranchNumberFeild;

	@FindBy(xpath = "//input[@id='input-bank-swift-code']")
	private WebElement swiftCodeFeild;

	@FindBy(xpath = "//input[@id='input-bank-account-name']")
	private WebElement accountNameFeild;

	@FindBy(xpath = "//input[@id='input-bank-account-number']")
	private WebElement accountNumberFeild;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueBttn;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage2;



	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement editYourAccountInfoLink;

	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstNameFeild;

	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lastNameFeild;

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement emailaddFeild;

	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement phoneFeild;

	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement updatePageContinueBttn;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement updateSuccessMessage;

	public String getTestEnvironmentText() {
		String textFromUI = testEnvironmentText.getText();
		return textFromUI;
	}

	public void clickMyAccountLink() {
		myAccount.click();
	}

	public void clickLoginLink() {
		login.click();
	}

	public void enterUserName(String userName) {
		userNameFeild.sendKeys(userName);
	}

	public void enterPassword(String password) {
		passwordFeild.sendKeys(password);
	}

	public void clickLoginBttn() {
		loginButton.click();
	}

	public String getTextAfterLogin() {
		String myAccountText = myAccountPage.getText();
		return myAccountText;
	}

	public void clickRegisterForAnAffiliateAccountLink() {
		registerForAnAffiliateAccountLink.click();
	}

	public void enterCompanyName(String companyname) {
		companyFeild.sendKeys(companyname);
	}

	public void enterWebsite(String websitename) {
		webSiteFeild.sendKeys(websitename);
	}

	public void enterTaxID(String id) {
		taxIDFeild.sendKeys(id);
	}

	public void selectPaymentMethod(String paymentMethodValue) {
		List<WebElement> paymentMethodelements = paymentMethod;
		for (WebElement element : paymentMethodelements) {
			if (element.getAttribute("Value").equalsIgnoreCase(paymentMethodValue.trim())) {
				element.click();
				break;
			}
		}
	}

	public void enterChequePayName() {
		chequePayeeName.sendKeys("Tek-School");
	}

	public void clickOnCheckBox() {
		checkBox.click();
	}

	public void clickOnContinueBttn1() {
		continueBttn1.click();
	}

	public String printSuccessMessage() {
		String textFromUI = successMessage1.getText();
		return textFromUI;
	}

	public void clickOnEditAffiliate() {
		EditAffiliate.click();
	}

	public void clickBankTransferBttn() {
		bankTransferBttn.click();
	}

	public void enterBankName(String bankName) {
		bankNameFeild.sendKeys(bankName);
	}

	public void enterBranchNumber(String number) {
		bankBranchNumberFeild.sendKeys(number);
	}

	public void enterSwiftCode(String Code) {
		swiftCodeFeild.sendKeys(Code);
	}

	public void enterAccountName(String Name) {
		accountNameFeild.sendKeys(Name);
	}

	public void enterAccountNumber(String AccountNumber) {
		accountNumberFeild.sendKeys(AccountNumber);
	}

	public void clickContinueBttn() {
		continueBttn.click();
	}

	public String printSuccessMessage2() {
		String textFromUI = successMessage2.getText();
		return textFromUI;
	}

	public void clickonEditYourAccountInfoLink() {
		editYourAccountInfoLink.click();
	}

	public void updateFirstName(String updatedname) {
		firstNameFeild.clear();
		firstNameFeild.sendKeys(updatedname);

	}

	public void updateLasttName(String updatedlastname) {
		lastNameFeild.clear();
		lastNameFeild.sendKeys(updatedlastname);

	}

	public void updatedEmailAddFeild(String updatedemail) {
		emailaddFeild.clear();
		emailaddFeild.sendKeys(updatedemail);
	}

	public void updatedPhoneFeild(String updatedphone) {
		phoneFeild.clear();
		phoneFeild.sendKeys(updatedphone);
	}

	public void clickonUpdatepageContinueBttn() {
		updatePageContinueBttn.click();
	}

	public String getTextFromUI() {
		String textFromUI = updateSuccessMessage.getText();
		return textFromUI;
	}

}