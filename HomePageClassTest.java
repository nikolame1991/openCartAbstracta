package openCartAbstracta;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//// Test class for verifying registration functionality on OpenCart
public class HomePageClassTest extends BaseTestClass {

	// This method runs before each test
	// It navigates to the OpenCart homepage
	@BeforeMethod
	public void navigation() {
		driver.navigate().to("https://opencart.abstracta.us/");
	}

	// Test for successful user registration
	@Test
	public void testRegisterLogin() {
		// Clicks the user icon in the top menu
		openCartAbstractaHomePage.iconLogoClick();
		// Clicks "Register" option
		openCartAbstractaHomePage.registerClick();
		// Enter First name
		openCartAbstractaHomePage.firstNameInputField("Bruce");
		// Enter Last name
		openCartAbstractaHomePage.lastNameInputField("Wayne");

		// ✅ ovde generišeš JEDINSTVEN email
		String email = "brucewayne" + System.currentTimeMillis() + "sdf";
		// Enter Email
		openCartAbstractaHomePage.emailInputField(email);

		// Enter phone number
		openCartAbstractaHomePage.phoneInputField("+123456789");
		// Enter Password
		openCartAbstractaHomePage.passwordInputField("N!k0l@1991");
		// Enter Conform Password
		openCartAbstractaHomePage.passwordConformInputField("N!k0l@1991"); // isto kao password!
		// Select "Subscribe No" radio button
		openCartAbstractaHomePage.checkBox();
		// Agree to privacy policy
		openCartAbstractaHomePage.privacyPolicyClick();
		// Click "Continue" button
		openCartAbstractaHomePage.buttonCLickContent();

		// Get and verify the success message after registration
		String actualMessage = openCartAbstractaHomePage.messageIsDisplay();
		Assert.assertEquals(actualMessage, "Congratulations! Your new account has been successfully created!");

		// Click "Continue" to go to account page
		openCartAbstractaHomePage.buttonContinueClick();
	}

	@Test
	public void testRegisterLoginValidErrorFirstName() {
		// Clicks the user icon in the top menu
		openCartAbstractaHomePage.iconLogoClick();
		// Clicks "Register" option
		openCartAbstractaHomePage.registerClick();
		// Enter First name
		openCartAbstractaHomePage.firstNameInputField("");
		// Enter Last name
		openCartAbstractaHomePage.lastNameInputField("Wayne");

		// ✅ ovde generišeš JEDINSTVEN email
		String email = "brucewayne" + System.currentTimeMillis() + "@gmail.com";
		// Enter Email
		openCartAbstractaHomePage.emailInputField(email);

		// Enter phone number
		openCartAbstractaHomePage.phoneInputField("+123456789");
		// Enter Password
		openCartAbstractaHomePage.passwordInputField("N!k0l@1991");
		// Enter Conform Password
		openCartAbstractaHomePage.passwordConformInputField("N!k0l@1991"); // isto kao password!
		// Select "Subscribe No" radio button
		openCartAbstractaHomePage.checkBox();
		// Agree to privacy policy
		openCartAbstractaHomePage.privacyPolicyClick();
		// Click "Continue" button
		openCartAbstractaHomePage.buttonCLickContent();

		openCartAbstractaHomePage.isFirstNameValidationErrorDisplayed();
	}

	//
	@Test
	public void testRegisterLoginValidErrorLastName() {
		// Clicks the user icon in the top menu
		openCartAbstractaHomePage.iconLogoClick();
		// Clicks "Register" option
		openCartAbstractaHomePage.registerClick();
		// Enter First name
		openCartAbstractaHomePage.firstNameInputField("Bruce");
		// Enter Last name
		openCartAbstractaHomePage.lastNameInputField("");

		// ✅ ovde generišeš JEDINSTVEN email
		String email = "brucewayne" + System.currentTimeMillis() + "@gmail.com";
		// Enter Email
		openCartAbstractaHomePage.emailInputField(email);

		// Enter phone number
		openCartAbstractaHomePage.phoneInputField("+123456789");
		// Enter Password
		openCartAbstractaHomePage.passwordInputField("N!k0l@1991");
		// Enter Conform Password
		openCartAbstractaHomePage.passwordConformInputField("N!k0l@1991"); // isto kao password!
		// Select "Subscribe No" radio button
		openCartAbstractaHomePage.checkBox();
		// Agree to privacy policy
		openCartAbstractaHomePage.privacyPolicyClick();
		// Click "Continue" button
		openCartAbstractaHomePage.buttonCLickContent();

		openCartAbstractaHomePage.isLastNameValidErrorDisplayed();
	}

	// isEmailValidErrorDisplayed()
	@Test
	public void testRegisterLoginValidErrorEmail() {
		// Clicks the user icon in the top menu
		openCartAbstractaHomePage.iconLogoClick();
		// Clicks "Register" option
		openCartAbstractaHomePage.registerClick();
		// Enter First name
		openCartAbstractaHomePage.firstNameInputField("Bruce");
		// Enter Last name
		openCartAbstractaHomePage.lastNameInputField("Wayne");

		openCartAbstractaHomePage.emailInputField("");

		// Enter phone number
		openCartAbstractaHomePage.phoneInputField("+123456789");
		// Enter Password
		openCartAbstractaHomePage.passwordInputField("N!k0l@1991");
		// Enter Conform Password
		openCartAbstractaHomePage.passwordConformInputField("N!k0l@1991"); // isto kao password!
		// Select "Subscribe No" radio button
		openCartAbstractaHomePage.checkBox();
		// Agree to privacy policy
		openCartAbstractaHomePage.privacyPolicyClick();
		// Click "Continue" button
		openCartAbstractaHomePage.buttonCLickContent();

		openCartAbstractaHomePage.isEmailValidErrorDisplayed();
	}

	@Test
	public void testRegisterLoginValidErrorPhone() {
		// Clicks the user icon in the top menu
		openCartAbstractaHomePage.iconLogoClick();
		// Clicks "Register" option
		openCartAbstractaHomePage.registerClick();
		// Enter First name
		openCartAbstractaHomePage.firstNameInputField("Bruce");
		// Enter Last name
		openCartAbstractaHomePage.lastNameInputField("Wayne");

		openCartAbstractaHomePage.emailInputField("brucewayne@gmail.com");

		// Enter phone number
		openCartAbstractaHomePage.phoneInputField("");
		// Enter Password
		openCartAbstractaHomePage.passwordInputField("N!k0l@1991");
		// Enter Conform Password
		openCartAbstractaHomePage.passwordConformInputField("N!k0l@1991"); // isto kao password!
		// Select "Subscribe No" radio button
		openCartAbstractaHomePage.checkBox();
		// Agree to privacy policy
		openCartAbstractaHomePage.privacyPolicyClick();
		// Click "Continue" button
		openCartAbstractaHomePage.buttonCLickContent();

		openCartAbstractaHomePage.isPhoneValidErrorDisplayed();
	}

	@Test
	public void testRegisterLoginValidErrorPasswordAndConform() {
		// Clicks the user icon in the top menu
		openCartAbstractaHomePage.iconLogoClick();
		// Clicks "Register" option
		openCartAbstractaHomePage.registerClick();
		// Enter First name
		openCartAbstractaHomePage.firstNameInputField("Bruce");
		// Enter Last name
		openCartAbstractaHomePage.lastNameInputField("Wayne");

		openCartAbstractaHomePage.emailInputField("brucewayne@gmail.com");

		// Enter phone number
		openCartAbstractaHomePage.phoneInputField("");
		// Enter Password
		openCartAbstractaHomePage.passwordInputField("");
		// Enter Conform Password
		openCartAbstractaHomePage.passwordConformInputField("N!k0l@1991"); // isto kao password!
		// Select "Subscribe No" radio button
		openCartAbstractaHomePage.checkBox();
		// Agree to privacy policy
		openCartAbstractaHomePage.privacyPolicyClick();
		// Click "Continue" button
		openCartAbstractaHomePage.buttonCLickContent();

		openCartAbstractaHomePage.isPasswordValidErrorDisplayed();
	}

	// isPrivacyPolicyErrorDisplayed()
	@Test
	public void testRegisterLoginValidErrorPrivacyPolicy() {
		// Clicks the user icon in the top menu
		openCartAbstractaHomePage.iconLogoClick();
		// Clicks "Register" option
		openCartAbstractaHomePage.registerClick();
		// Enter First name
		openCartAbstractaHomePage.firstNameInputField("Bruce");
		// Enter Last name
		openCartAbstractaHomePage.lastNameInputField("Wayne");

		openCartAbstractaHomePage.emailInputField("brucewayne@gmail.com");

		// Enter phone number
		openCartAbstractaHomePage.phoneInputField("+123456789");
		// Enter Password
		openCartAbstractaHomePage.passwordInputField("N!k0l@1991");
		// Enter Conform Password
		openCartAbstractaHomePage.passwordConformInputField("N!k0l@1991"); // isto kao password!
		// Mark in comment for ERROR valid
		// openCartAbstractaHomePage.checkBox();

		openCartAbstractaHomePage.buttonCLickContent();

		// openCartAbstractaHomePage.isPasswordValidErrorDisplayed();
		Assert.assertTrue(openCartAbstractaHomePage.isPrivacyPolicyErrorDisplayed());
	}

}
