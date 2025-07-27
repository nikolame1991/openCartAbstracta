package openCartAbstracta;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageClassAccount {
	WebDriver driver;
	WebDriverWait wait;

	// Click on "Phones & PDAs" category
	@FindBy(css = "#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(6) > a")
	WebElement clickFirstNavPhonePda;

	// Add first product to cart
	@FindBy(css = "#content > div:nth-child(3) > div:nth-child(1) > div > div:nth-child(2) > div.button-group > button:nth-child(1)")
	WebElement clickBag;

	// Click on cart button
	@FindBy(css = "#cart > button")
	WebElement cartButton;

	// Remove product from cart
	@FindBy(css = "#cart > ul > li:nth-child(1) > table > tbody > tr > td:nth-child(5) > button")
	WebElement clickCartRemove;

	// Click on product title to open details
	@FindBy(css = "#content > div:nth-child(3) > div:nth-child(1) > div > div:nth-child(2) > div.caption > h4 > a")
	WebElement clickLinkArticle;

	// Main product image
	@FindBy(css = "#content > div > div.col-sm-8 > ul.thumbnails > li:nth-child(1) > a > img")
	WebElement checkImg;

	// Product name heading
	@FindBy(css = "#content > div > div.col-sm-4 > h1")
	WebElement checkHeading;

	// Add to cart from product page
	@FindBy(css = "#button-cart")
	WebElement clickButtonToCart;

	// Success message after adding to cart
	@FindBy(css = "#product-product > div.alert.alert-success.alert-dismissible")
	WebElement checkMessageIsDisplay;

	// Click "shopping cart" from success message
	@FindBy(css = "#product-product > div.alert.alert-success.alert-dismissible > a:nth-child(2)")
	WebElement clickLinkShoppingCart;

	// Proceed to checkout
	@FindBy(css = "#content > div.buttons.clearfix > div.pull-right > a")
	WebElement clickCheckout;

	// Expand Step 1: Checkout Options
	@FindBy(css = "#accordion > div:nth-child(1) > div.panel-heading > h4 > a")
	WebElement step1CheckoutOptionsClick;

	// Continue button (Register Account)
	@FindBy(css = "#button-account")
	WebElement buttonClickContinue;

	// Billing Details
	// Input field for First Name
	@FindBy(css = "#input-payment-firstname")
	WebElement accountBillingDetailsInputFirstName;

	// Input field for Last Name
	@FindBy(css = "#input-payment-lastname")
	WebElement accountBillingDetailsInputLastName;

	// Input field for Email
	@FindBy(css = "#input-payment-email")
	WebElement accountBillingDetailsInputEmail;

	// Input field for Phone
	@FindBy(css = "#input-payment-telephone")
	WebElement accountBillingDetailsInputPhone;

	// Input field for Password
	@FindBy(css = "#input-payment-password")
	WebElement accountBillingDetailsInputPassword;

	// Confirm password field
	@FindBy(css = "#input-payment-confirm")
	WebElement accountBillingDetailsInputPasswordConfirm;

	// Checkbox for "My delivery address is the same"
	@FindBy(css = "#collapse-payment-address > div > div:nth-child(3) > label > input[type=checkbox]")
	WebElement clickCheckBoxMyDelivery;

	// Input field for Company
	@FindBy(css = "#input-payment-company")
	WebElement accountBillingDetailsInputCompany;

	// Input field for Address
	@FindBy(css = "#input-payment-address-1")
	WebElement accountBillingDetailsInputAddress;

	// Input field for City
	@FindBy(css = "#input-payment-city")
	WebElement accountBillingDetailsInputCity;

	// Input field for Postcode
	@FindBy(css = "#input-payment-postcode")
	WebElement accountBillingDetailsPostCode;

	// Dropdown for State/Region
	@FindBy(css = "#input-payment-zone")
	WebElement accountBillingDetailsZone;

	// Checkbox for Privacy Policy agreement
	@FindBy(css = "#collapse-payment-address > div > div.buttons.clearfix > div > input[type=checkbox]:nth-child(2)")
	WebElement clicCheckBoxPrivacyPolice;

	// Click to continue with registration
	@FindBy(css = "#button-register")
	WebElement clickButtonContinueRegister;

	// Shipping Method
	// Continue to shipping details
	@FindBy(css = "#button-shipping-address")
	WebElement clickButtonShippingAddress;

	// Optional text message to seller
	@FindBy(css = "#collapse-shipping-method > div > p:nth-child(5) > textarea")
	WebElement writeTheMessage;

	// Continue after entering shipping message
	@FindBy(xpath = "//*[@id=\"button-shipping-method\"]")
	WebElement enterAfterMessage;

	// Checkbox for agreeing with Terms & Conditions
	@FindBy(xpath = "//*[@id=\"collapse-payment-method\"]/div/div[3]/div/input[1]")
	WebElement clickRadioBoxInPaymentMethod;

	// Continue from payment method
	@FindBy(xpath = "//*[@id=\"button-payment-method\"]")
	WebElement clickButtonInPaymentMethod;

	// Confirm the order
	@FindBy(xpath = "//*[@id=\"button-confirm\"]")
	WebElement clickButtonInConfirmOrder;

	// Final step
	// Final continue after successful order
	@FindBy(css = "#content > div > div > a")
	WebElement clickButtonInSuccessElement;

	/*------------------------------------------*/
	// ERROR
	// Error message First Name
	@FindBy(xpath = "//*[@id=\"account\"]/div[2]/div")
	WebElement errorMessageFirstName;

	// Error message Last Name
	@FindBy(xpath = "//*[@id=\"account\"]/div[3]/div")
	WebElement errorMessageLastName;

	// Error message Email
	@FindBy(xpath = "//*[@id=\"account\"]/div[4]/div")
	WebElement errorMessageEmail;

	// Error message Phone Number
	@FindBy(xpath = "//*[@id=\"account\"]/div[5]/div")
	WebElement errorPhoneNumber;

	// Error message password
	@FindBy(xpath = "//*[@id=\"collapse-payment-address\"]/div/div[1]/div[1]/fieldset[2]/div[1]/div")
	WebElement errorPassword;

	// Error message password confirm
	@FindBy(xpath = "//*[@id=\"collapse-payment-address\"]/div/div[1]/div[1]/fieldset[2]/div[2]/div")
	WebElement errorPasswordConfirm;

	// Error message Address
	@FindBy(xpath = "//*[@id=\"address\"]/div[2]/div")
	WebElement errorAddress;

	// Error message City
	@FindBy(xpath = "//*[@id=\"address\"]/div[4]/div")
	WebElement errorCity;

	// Error message Post card
	@FindBy(css = "#address > div:nth-child(6) > div")
	WebElement errorPostCode;

	@FindBy(xpath = "//*[@id=\"address\"]/div[7]/div")
	WebElement errorRegion;

	// Error Select Region
	@FindBy(css = "#input-payment-zone")
	WebElement errorSelectRegion;

	// Error message Select Region
	@FindBy(css = "#address > div:nth-child(8) > div")
	WebElement errorMessageSelectRegion;

	// Constructor that initializes the WebDriver and WebElements using PageFactory
	public HomePageClassAccount(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	// Clicks the "Phones & PDAs" navigation tab
	public void clickPhonePda() {
		wait.until(ExpectedConditions.elementToBeClickable(clickFirstNavPhonePda)).click();
	}

	// Clicks the "Add to Cart" button for the first product in the list
	public void bagClickLink() {
		wait.until(ExpectedConditions.elementToBeClickable(clickBag)).click();
	}

	// Opens the cart dropdown in the top-right
	public void cartButtonClick() {
		wait.until(ExpectedConditions.elementToBeClickable(cartButton)).click();
	}

	// Removes the item from the cart
	public void removeCartClick() {
		wait.until(ExpectedConditions.elementToBeClickable(clickCartRemove)).click();
	}

	// Clicks on a product name to open its detail page
	public void linkClickArticle() {
		wait.until(ExpectedConditions.elementToBeClickable(clickLinkArticle)).click();
	}

	// Verifies if the product image is displayed
	public boolean imageIsDisplay() {
		return wait.until(ExpectedConditions.visibilityOf(checkImg)).isDisplayed();
	}

	// Retrieves the product title from the detail page
	public String headingCheckIsDisplay() {
		return checkHeading.getText();
	}

	// Clicks the "Add to Cart" button on the product detail page
	public void cartToButtonClick() {
		wait.until(ExpectedConditions.elementToBeClickable(clickButtonToCart)).click();
	}

	// Returns the confirmation message after adding product to cart
	public String messageChechIsDisplay() {
		return wait.until(ExpectedConditions.visibilityOf(checkMessageIsDisplay)).getText();
	}

	// Navigates to the shopping cart page from success alert
	public void linkClickShoppingCart() {
		wait.until(ExpectedConditions.elementToBeClickable(clickLinkShoppingCart)).click();
	}

	// Clicks the "Checkout" button to start the checkout process
	public void clickCheckoutToBey() {
		wait.until(ExpectedConditions.elementToBeClickable(clickCheckout)).click();
	}

	// Verifies if the first step in checkout is displayed
	public boolean checkOutOptionsClickStep1() {
		return wait.until(ExpectedConditions.visibilityOf(step1CheckoutOptionsClick)).isDisplayed();
	}

	// Clicks the "Continue" button after choosing checkout option
	public void continueButtonClick() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonClickContinue)).click();
	}

	// Fills in the first name in billing form
	public void inputFieldName(String firstName) {
		wait.until(ExpectedConditions.visibilityOf(accountBillingDetailsInputFirstName));
		accountBillingDetailsInputFirstName.clear();
		accountBillingDetailsInputFirstName.sendKeys(firstName);
	}

	// Fills in the last name in billing form
	public void inputFieldLast(String lastName) {
		wait.until(ExpectedConditions.visibilityOf(accountBillingDetailsInputLastName));
		accountBillingDetailsInputLastName.clear();
		accountBillingDetailsInputLastName.sendKeys(lastName);
	}

	// Fills in email address in billing form
	public void inputFieldEmail(String email) {
		wait.until(ExpectedConditions.visibilityOf(accountBillingDetailsInputEmail));
		accountBillingDetailsInputEmail.clear();
		accountBillingDetailsInputEmail.sendKeys(email);
	}

	// Fills in phone number in billing form
	public void inputFieldPhone(String phone) {
		wait.until(ExpectedConditions.visibilityOf(accountBillingDetailsInputPhone));
		accountBillingDetailsInputPhone.clear();
		accountBillingDetailsInputPhone.sendKeys(phone);
	}

	// Fills in password in billing form
	public void inputFieldPassword(String password) {
		wait.until(ExpectedConditions.visibilityOf(accountBillingDetailsInputPassword));
		accountBillingDetailsInputPassword.clear();
		accountBillingDetailsInputPassword.sendKeys(password);
	}

	// Fills in password confirmation in billing form
	public void inputFieldPasswordConfirm(String passwordConfirm) {
		wait.until(ExpectedConditions.visibilityOf(accountBillingDetailsInputPasswordConfirm));
		accountBillingDetailsInputPasswordConfirm.clear();
		accountBillingDetailsInputPasswordConfirm.sendKeys(passwordConfirm);
	}

	// Clicks checkbox to confirm "My delivery address is the same"
	public void clickCheckbox() {
		wait.until(ExpectedConditions.elementToBeClickable(clickCheckBoxMyDelivery)).click();
	}

	// Fills in company name
	public void inputFieldCompany(String nameCompany) {
		wait.until(ExpectedConditions.visibilityOf(accountBillingDetailsInputCompany));
		accountBillingDetailsInputCompany.clear();
		accountBillingDetailsInputCompany.sendKeys(nameCompany);
	}

	// Fills in address
	public void inputFieldAddress(String address1) {
		wait.until(ExpectedConditions.visibilityOf(accountBillingDetailsInputAddress));
		accountBillingDetailsInputAddress.clear();
		accountBillingDetailsInputAddress.sendKeys(address1);
	}

	// Fills in city name
	public void inputFieldCity(String city) {
		wait.until(ExpectedConditions.visibilityOf(accountBillingDetailsInputCity));
		accountBillingDetailsInputCity.clear();
		accountBillingDetailsInputCity.sendKeys(city);
	}

	// Fills in postal code
	public void inputFieldPostCode(String postCode) {
		wait.until(ExpectedConditions.visibilityOf(accountBillingDetailsPostCode));
		accountBillingDetailsPostCode.clear();
		accountBillingDetailsPostCode.sendKeys(postCode);
	}

	// Selects state/region from dropdown
	public void selectZoneByVisibleText(String zoneName) {
		wait.until(ExpectedConditions.elementToBeClickable(accountBillingDetailsZone));
		Select select = new Select(accountBillingDetailsZone);
		select.selectByVisibleText(zoneName);
	}

	// Clicks checkbox to accept Privacy Policy
	public void checkBoxClickPrivacyPolice() {
		wait.until(ExpectedConditions.elementToBeClickable(clicCheckBoxPrivacyPolice)).click();
	}

	// Clicks "Continue" to go to the shipping step
	public void buttonClickRegister() {
		wait.until(ExpectedConditions.elementToBeClickable(clickButtonContinueRegister)).click();
	}

	// Clicks "Continue" for delivery details (if available)
	public void buttonClickDeliveryDetailsIfAvailable() {
		wait.until(ExpectedConditions.elementToBeClickable(clickButtonShippingAddress)).click();
	}

	// Writes optional delivery message
	public void writeTheTextMessage(String text) {
		wait.until(ExpectedConditions.visibilityOf(writeTheMessage));
		writeTheMessage.clear();
		writeTheMessage.sendKeys(text);
	}

	// Clicks "Continue" after writing delivery message
	public void clickButtonContinueAfterMessage() {
		wait.until(ExpectedConditions.elementToBeClickable(enterAfterMessage)).click();
	}

	// Clicks checkbox to agree with Terms & Conditions
	public void clickRadioBox() {
		wait.until(ExpectedConditions.elementToBeClickable(clickRadioBoxInPaymentMethod)).click();
	}

	// Clicks "Continue" to proceed with selected payment method
	public void clickButtonPaymentMethod() {
		wait.until(ExpectedConditions.elementToBeClickable(clickButtonInPaymentMethod)).click();
	}

	// Clicks "Confirm Order" button
	public void buttonClickConfirmOrder() {
		wait.until(ExpectedConditions.elementToBeClickable(clickButtonInConfirmOrder)).click();
	}

	// Clicks final "Continue" after successful order
	public void clickButtonContinue() {
		wait.until(ExpectedConditions.elementToBeClickable(clickButtonInSuccessElement)).click();
	}

	/*-----------------ERROR---------------------*/

	// Checks whether the validation error message for the "First Name" field is
	// displayed.
	public boolean isFirstNameValidationErrorDisplayed() {
		return wait.until(ExpectedConditions.visibilityOf(errorMessageFirstName)).isDisplayed();
	}

	// Checks whether the validation error message for the "Last Name" field is
	// displayed.
	public boolean nisLastNameValidationErrorDisplayed() {
		return wait.until(ExpectedConditions.visibilityOf(errorMessageLastName)).isDisplayed();
	}

	// Checks whether the validation error message for the "Email" field is
	// displayed.
	public boolean isEmailValidationErrorDisplayed() {
		return wait.until(ExpectedConditions.visibilityOf(errorMessageEmail)).isDisplayed();
	}

	// Checks whether the validation error message for the "Phone number" field is
	// displayed.
	public boolean isPhoneNumberValidationErrorDisplayed() {
		return wait.until(ExpectedConditions.visibilityOf(errorPhoneNumber)).isDisplayed();
	}

	// Checks whether the validation error message for the "Password" field is
	// displayed.
	public boolean isPasswordValidationErrorDisplayed() {
		return wait.until(ExpectedConditions.visibilityOf(errorPassword)).isDisplayed();
	}

	// Checks whether the validation error message for the "Password Confirm" field
	// is displayed.
	public boolean isPasswordConfirmValidationErrorDisplayed() {
		return wait.until(ExpectedConditions.visibilityOf(errorPasswordConfirm)).isDisplayed();
	}

	// Checks whether the validation error message for the "Address" field is
	// displayed.
	public boolean isAddressValidationErrorDisplayed() {
		return wait.until(ExpectedConditions.visibilityOf(errorAddress)).isDisplayed();
	}

	// Checks whether the validation error message for the "City" field is
	// displayed.
	public boolean isCityValidationErrorDisplayed() {
		return wait.until(ExpectedConditions.visibilityOf(errorCity)).isDisplayed();
	}

	// Checks whether the validation error message for the "Post Code" field is
	// displayed.
	public boolean isPostCodeValidationErrorDisplayed() {
		return wait.until(ExpectedConditions.visibilityOf(errorPostCode)).isDisplayed();
	}

	// Checks whether the "Zone" (e.g. state/province) validation error message is
	// displayed.
	public boolean isZoneValidationErrorDisplayed() {
		WebElement zoneError = driver.findElement(By.cssSelector("#input-payment-zone"));
		return zoneError.isDisplayed();
	}

	// Checks whether the validation error message for the "Region/State" dropdown
	// is displayed.
	public boolean isRegionValidationErrorDisplayed() {
		return wait.until(ExpectedConditions.visibilityOf(errorSelectRegion)).isDisplayed();
	}
}
