package openCartAbstracta;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageClass {
	WebDriver driver;
	WebDriverWait wait;
	// Page Elements;

	// User menu icon
	@FindBy(css = "#top-links > ul > li.dropdown > a > i")
	WebElement clickIconLogo;

	// Register link
	@FindBy(css = "#top-links > ul > li.dropdown.open > ul > li:nth-child(1) > a")
	WebElement clickRegister;

	// First name input field
	@FindBy(css = "#input-firstname")
	WebElement inputFieldFirstName;

	// Last name input field
	@FindBy(css = "#input-lastname")
	WebElement inputFieldLastName;

	// Email input field
	@FindBy(css = "#input-email")
	WebElement inputFieldEmail;

	// Phone input field
	@FindBy(css = "#input-telephone")
	WebElement inputFieldPhone;

	// Password input field
	@FindBy(css = "#input-password")
	WebElement inputFieldPassword;

	// Password Confirm input field
	@FindBy(css = "#input-confirm")
	WebElement inbputFieldPasswordConfirm;

	// Subscribe "No" radio button
	@FindBy(css = "#content > form > fieldset:nth-child(3) > div > div > label:nth-child(2) > input[type=radio]")
	WebElement inputCheckBoxContent;

	// Privacy Policy checked click
	@FindBy(css = "#content > form > div > div > input[type=checkbox]:nth-child(2)")
	WebElement clickPrivacyPolicy;

	// "Continue" button (registration)
	@FindBy(css = "#content > form > div > div > input.btn.btn-primary")
	WebElement clickButtonContent;

	// Success registration message
	@FindBy(css = "#content > p:nth-child(2)")
	WebElement showMessages;

	// "Continue" button after registration
	@FindBy(css = "#content > div > div > a")
	WebElement clickButtonContinue;

	/*-----------------------------------------*/
	// "Continue" without form input
	@FindBy(css = "#content > form > div > div > input.btn.btn-primary")
	WebElement clickButtonContentValid;

	// Error message alert
	@FindBy(css = "#account-register > div.alert.alert-danger.alert-dismissible")
	WebElement showErrorMessages;

	// Error message first name
	@FindBy(xpath = "//*[@id=\"account\"]/div[2]/div/div")
	WebElement errorMessageFirstName;

	// Error message last name
	@FindBy(xpath = "//*[@id=\"account\"]/div[3]/div/div")
	WebElement errorMessageLastName;

	// Error message email
	@FindBy(xpath = "//*[@id=\"account\"]/div[4]/div/div")
	WebElement errorMessageEmail;

	// Error message phone
	@FindBy(xpath = "//*[@id=\"account\"]/div[5]/div/div")
	WebElement errorMessagePhone;

	// Error message password
	@FindBy(xpath = "//*[@id=\"content\"]/form/fieldset[2]/div[1]/div/div")
	WebElement errorMessagePassword;

	// Error message Privacy Policy
	@FindBy(css = "#account-register > div.alert.alert-danger.alert-dismissible")
	WebElement errorMessagePrivacyPolicy;

	// Constructor
	public HomePageClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	// Click user menu icon
	public void iconLogoClick() {
		wait.until(ExpectedConditions.elementToBeClickable(clickIconLogo)).click();
	}

	// Click on "Register" link
	public void registerClick() {
		wait.until(ExpectedConditions.elementToBeClickable(clickRegister)).click();
	}

	// Enter user's first name
	public void firstNameInputField(String firstName) {
		wait.until(ExpectedConditions.visibilityOf(inputFieldFirstName));
		inputFieldFirstName.clear();
		inputFieldFirstName.sendKeys(firstName);
	}

	// Enter user's last name
	public void lastNameInputField(String lastName) {
		wait.until(ExpectedConditions.visibilityOf(inputFieldLastName));
		inputFieldLastName.clear();
		inputFieldLastName.sendKeys(lastName);
	}

	// Enter email address
	public void emailInputField(String email) {
		wait.until(ExpectedConditions.visibilityOf(inputFieldEmail));
		inputFieldEmail.clear();
		inputFieldEmail.sendKeys(email);
	}

	// Enter phone number
	public void phoneInputField(String phone) {
		wait.until(ExpectedConditions.visibilityOf(inputFieldPhone));
		inputFieldPhone.clear();
		inputFieldPhone.sendKeys(phone);
	}

	// Enter Password
	public void passwordInputField(String password) {
		wait.until(ExpectedConditions.visibilityOf(inputFieldPassword));
		inputFieldPassword.clear();
		inputFieldPassword.sendKeys(password);
	}

	// Conform password enter
	public void passwordConformInputField(String conform) {
		wait.until(ExpectedConditions.visibilityOf(inbputFieldPasswordConfirm));
		inbputFieldPasswordConfirm.clear();
		inbputFieldPasswordConfirm.sendKeys(conform);
	}

	// Click "Subscribe NO" radio button
	public void checkBox() {
		wait.until(ExpectedConditions.visibilityOf(inputCheckBoxContent)).click();
	}

	// Click privacy Policy checkbox
	public void privacyPolicyClick() {
		wait.until(ExpectedConditions.elementToBeClickable(clickPrivacyPolicy)).click();
	}

	// Click "Continue" to submit form
	public void buttonCLickContent() {
		wait.until(ExpectedConditions.visibilityOf(clickButtonContent)).click();
	}

	// Get Success message text
	public String messageIsDisplay() {
		return wait.until(ExpectedConditions.visibilityOf(showMessages)).getText();
	}

	// Click "Continue" after registration
	public void buttonContinueClick() {
		wait.until(ExpectedConditions.elementToBeClickable(clickButtonContinue)).click();
	}

	/*-----------------------------------------------------*/
	// Negative test: click "Continue" without filling form
	public void validButtonClickContent() {
		wait.until(ExpectedConditions.visibilityOf(clickButtonContentValid)).click();
	}

	// Returns error message when form is invalid
	public String errorMessages() {
		return showErrorMessages.getText();
	}

	// Checks whether the validation error message for the "First Name" field is
	// displayed.
	public boolean isFirstNameValidationErrorDisplayed() {
		return wait.until(ExpectedConditions.visibilityOf(errorMessageFirstName)).isDisplayed();
	}

	// Checks whether the validation error message for the "Last name" field is
	// displayed
	public boolean isLastNameValidErrorDisplayed() {
		return wait.until(ExpectedConditions.visibilityOf(errorMessageLastName)).isDisplayed();
	}

	// Checks whether the validation error message for the "Email" field is
	// displayed
	public boolean isEmailValidErrorDisplayed() {
		return wait.until(ExpectedConditions.visibilityOf(errorMessageEmail)).isDisplayed();
	}

	// Checks whether the validation error message for the "Phone" field is
	// displayed
	public boolean isPhoneValidErrorDisplayed() {
		return wait.until(ExpectedConditions.visibilityOf(errorMessagePhone)).isDisplayed();
	}

	// Checks whether the validation error message for the "Password" field is
	// displayed
	public boolean isPasswordValidErrorDisplayed() {
		return wait.until(ExpectedConditions.visibilityOf(errorMessagePassword)).isDisplayed();
	}

	// Checks whether the validation error message for the "Privacy Policy" field is
	// displayed
	public boolean isPrivacyPolicyErrorDisplayed() {
		return wait.until(ExpectedConditions.visibilityOf(errorMessagePrivacyPolicy)).isDisplayed();
	}
}
