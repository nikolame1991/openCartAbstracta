package openCartAbstracta;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageClassAccountTest extends BaseTestClass {

	// Navigates to the OpenCart homepage before each test method
	@BeforeMethod
	public void navigation() {
		driver.navigate().to("https://opencart.abstracta.us/");
	}

	@Test
	public void testSuccessfulOrderForHTCTouchHD() {
		// Step 1: Open Phones & PDAs section
		accountHomePage.clickPhonePda();

		// Step 2: Add the first product (HTC Touch HD) to the cart
		accountHomePage.bagClickLink();

		// Step 3: Open the cart
		accountHomePage.cartButtonClick();

		// Step 4: Remove product from cart (optional, to reset state)
		accountHomePage.removeCartClick();

		// Step 5: Open the product detail page by clicking the product name
		accountHomePage.linkClickArticle();

		// Step 6: Verify that the product image is visible
		assertTrue(accountHomePage.imageIsDisplay(), "Product image should be visible");

		// Step 7: Assert that the heading on the product page is correct
		String actualText = accountHomePage.headingCheckIsDisplay();
		String expectedText = "HTC Touch HD";
		Assert.assertEquals(actualText, expectedText, "Product title does not match");

		// Step 8: Add the product to the cart from the detail page
		accountHomePage.cartToButtonClick();

		// Step 9: Verify success message is displayed after adding to cart
		String actualMessage = accountHomePage.messageChechIsDisplay();
		Assert.assertTrue(actualMessage.contains("Success: You have added HTC Touch HD to your shopping cart!"));

		// Step 10: Open the cart from the success message link
		accountHomePage.linkClickShoppingCart();

		// Step 11: Proceed to checkout
		accountHomePage.clickCheckoutToBey();

		// Step 12: Ensure step 1 (checkout options) is visible
		accountHomePage.checkOutOptionsClickStep1();

		// Step 13: Click continue to register a new account
		accountHomePage.continueButtonClick();

		// Step 14: Fill in billing details
		// accountHomePage.inputFieldName("Bruce");
		accountHomePage.inputFieldName(loginCartTest.correctUserName);
		// accountHomePage.inputFieldLast("Wayne");
		accountHomePage.inputFieldLast(loginCartTest.correctLastName);
		// accountHomePage.inputFieldEmail("nasssde@gmail.com"); // NOTE: should be
		// unique if testing multiple times
		accountHomePage.inputFieldEmail(loginCartTest.correctEmail);
		// accountHomePage.inputFieldPhone("+123456789");
		accountHomePage.inputFieldPhone(loginCartTest.correctPhoneNum);
		// accountHomePage.inputFieldPassword("nikola1991");
		accountHomePage.inputFieldPassword(loginCartTest.correctPassword);
		// accountHomePage.inputFieldPasswordConfirm("nikola1991");
		accountHomePage.inputFieldPasswordConfirm(loginCartTest.correctPasswordConfirm);

		// Step 15: Check "My delivery address is the same"
		accountHomePage.clickCheckbox();

		// Step 16: Fill in company and address info
		// accountHomePage.inputFieldCompany("Gotham City");
		accountHomePage.inputFieldCompany(loginCartTest.correctCompany);
		// accountHomePage.inputFieldAddress("Mr. Wayne President");
		accountHomePage.inputFieldAddress(loginCartTest.correctAddress);
		// accountHomePage.inputFieldCity("Gotham");
		accountHomePage.inputFieldCity(loginCartTest.correctCity);
		// accountHomePage.inputFieldPostCode("590000");
		accountHomePage.inputFieldPostCode(loginCartTest.correctPostCode);
		// accountHomePage.selectZoneByVisibleText("Aberdeen");
		accountHomePage.selectZoneByVisibleText(loginCartTest.correctZone);

		// Step 17: Accept privacy policy
		accountHomePage.checkBoxClickPrivacyPolice();

		// Step 18: Continue to shipping step
		accountHomePage.buttonClickRegister();

		// Step 19: Confirm delivery details (if applicable)
		accountHomePage.buttonClickDeliveryDetailsIfAvailable();

		// Step 20: Optionally write a message to the seller
		accountHomePage.writeTheTextMessage("lakjsdlk akjsdhkajsd akjshdkjahsd dihovihswkjh asflkjhsdk");

		// Step 21: Continue from shipping method
		accountHomePage.clickButtonContinueAfterMessage();

		// Step 22: Agree to terms in payment method section
		accountHomePage.clickRadioBox();

		// Step 23: Continue with selected payment method
		accountHomePage.clickButtonPaymentMethod();

		// Step 24: Confirm the order
		accountHomePage.buttonClickConfirmOrder();

		// Step 25: Final continue button after successful order
		accountHomePage.clickButtonContinue();
	}

	/* ERROR First name */
	@Test
	public void errorInutFirstName() {
		// Navigate through the UI to reach a product page
		accountHomePage.clickPhonePda(); // Click on "Phones & PDAs" category
		accountHomePage.bagClickLink(); // Open a specific bag/product link
		accountHomePage.cartButtonClick(); // Attempt to add the product to cart
		accountHomePage.removeCartClick(); // Remove it from cart if previously added
		accountHomePage.linkClickArticle(); // Open product detail page again

		// Verify that the product image is displayed
		assertTrue(accountHomePage.imageIsDisplay(), "Product image should be visible");

		// Verify the correct product title is shown
		String actualText = accountHomePage.headingCheckIsDisplay();
		String expectedText = "HTC Touch HD";
		Assert.assertEquals(actualText, expectedText, "Product title does not match");

		// Add product to cart from detail page
		accountHomePage.cartToButtonClick();

		// Verify success message after adding to cart
		String actualMessage = accountHomePage.messageChechIsDisplay();
		Assert.assertTrue(actualMessage.contains("Success: You have added HTC Touch HD to your shopping cart!"));

		// Go to shopping cart
		accountHomePage.linkClickShoppingCart();

		// Proceed to checkout
		accountHomePage.clickCheckoutToBey();

		// Start registration process in Step 1 of checkout
		accountHomePage.checkOutOptionsClickStep1();
		accountHomePage.continueButtonClick(); // Register a new account

		// Fill in billing details — intentionally leaving first name empty to trigger
		// error
		accountHomePage.inputFieldName(""); // Empty first name for negative test
		accountHomePage.inputFieldLast(loginCartTest.correctLastName);
		accountHomePage.inputFieldEmail("vukdusvnjak@gmail.com");
		accountHomePage.inputFieldPhone(loginCartTest.correctPhoneNum);
		accountHomePage.inputFieldPassword(loginCartTest.correctPassword);
		accountHomePage.inputFieldPasswordConfirm(loginCartTest.correctPasswordConfirm);

		// Check "My delivery address is the same as billing"
		accountHomePage.clickCheckbox();

		// Fill in delivery address details
		accountHomePage.inputFieldCompany(loginCartTest.correctCompany);
		accountHomePage.inputFieldAddress(loginCartTest.correctAddress);
		accountHomePage.inputFieldCity(loginCartTest.correctCity);
		accountHomePage.inputFieldPostCode(loginCartTest.correctPostCode);
		accountHomePage.selectZoneByVisibleText(loginCartTest.correctZone);

		// Accept privacy policy
		accountHomePage.checkBoxClickPrivacyPolice();

		// Attempt to continue — should fail due to missing first name
		accountHomePage.buttonClickRegister();

		// Verify error message for empty first name field is displayed
		accountHomePage.isFirstNameValidationErrorDisplayed();
	}

	// Error Last Name
	@Test
	public void errorInputLastName() {
		// Step 1: Navigate to the product detail page
		accountHomePage.clickPhonePda(); // Open "Phones & PDAs" category
		accountHomePage.bagClickLink(); // Click on specific product link
		accountHomePage.cartButtonClick(); // Try to add product to cart
		accountHomePage.removeCartClick(); // Remove item if previously added
		accountHomePage.linkClickArticle(); // Open product detail page again

		// Step 2: Verify that product image is displayed
		assertTrue(accountHomePage.imageIsDisplay(), "Product image should be visible");

		// Step 3: Verify correct product heading is displayed
		String actualText = accountHomePage.headingCheckIsDisplay();
		String expectedText = "HTC Touch HD";
		Assert.assertEquals(actualText, expectedText, "Product title does not match");

		// Step 4: Add product to cart from detail page
		accountHomePage.cartToButtonClick();

		// Step 5: Verify success message after adding product to cart
		String actualMessage = accountHomePage.messageChechIsDisplay();
		Assert.assertTrue(actualMessage.contains("Success: You have added HTC Touch HD to your shopping cart!"));

		// Step 6: Open the shopping cart and proceed to checkout
		accountHomePage.linkClickShoppingCart();
		accountHomePage.clickCheckoutToBey();

		// Step 7: Click 'Continue' to register a new account in Step 1 of checkout
		accountHomePage.checkOutOptionsClickStep1();
		accountHomePage.continueButtonClick();

		// Step 8: Fill in billing information, leaving last name field empty (negative
		// test)
		accountHomePage.inputFieldName("Bruce");
		accountHomePage.inputFieldLast(""); // Intentionally left blank to trigger validation error
		accountHomePage.inputFieldEmail("vukdussvnjak@gmail.com");
		accountHomePage.inputFieldPhone(loginCartTest.correctPhoneNum);
		accountHomePage.inputFieldPassword(loginCartTest.correctPassword);
		accountHomePage.inputFieldPasswordConfirm(loginCartTest.correctPasswordConfirm);

		// Step 9: Check "My delivery address is the same as billing"
		accountHomePage.clickCheckbox();

		// Step 10: Enter delivery address details
		accountHomePage.inputFieldCompany(loginCartTest.correctCompany);
		accountHomePage.inputFieldAddress(loginCartTest.correctAddress);
		accountHomePage.inputFieldCity(loginCartTest.correctCity);
		accountHomePage.inputFieldPostCode(loginCartTest.correctPostCode);
		accountHomePage.selectZoneByVisibleText(loginCartTest.correctZone);

		// Step 11: Accept privacy policy and submit the form
		accountHomePage.checkBoxClickPrivacyPolice();
		accountHomePage.buttonClickRegister();

		// Step 12: Verify error message is displayed for missing last name
		Assert.assertTrue(accountHomePage.nisLastNameValidationErrorDisplayed(),
				"Last name validation error should be displayed");
	}

	// Error Email
	@Test
	public void errorInputEmail() {
		// Step 1: Navigate to the product detail page
		accountHomePage.clickPhonePda(); // Open "Phones & PDAs" category
		accountHomePage.bagClickLink(); // Click on a specific product link
		accountHomePage.cartButtonClick(); // Try to add product to cart
		accountHomePage.removeCartClick(); // Remove item if previously added
		accountHomePage.linkClickArticle(); // Open product detail page again

		// Step 2: Verify that product image is displayed
		assertTrue(accountHomePage.imageIsDisplay(), "Product image should be visible");

		// Step 3: Verify that the product title is correct
		String actualText = accountHomePage.headingCheckIsDisplay();
		String expectedText = "HTC Touch HD";
		Assert.assertEquals(actualText, expectedText, "Product title does not match");

		// Step 4: Add product to cart from detail page
		accountHomePage.cartToButtonClick();

		// Step 5: Verify success message after adding product to cart
		String actualMessage = accountHomePage.messageChechIsDisplay();
		Assert.assertTrue(actualMessage.contains("Success: You have added HTC Touch HD to your shopping cart!"));

		// Step 6: Go to shopping cart and proceed to checkout
		accountHomePage.linkClickShoppingCart();
		accountHomePage.clickCheckoutToBey();

		// Step 7: Begin checkout and select registration
		accountHomePage.checkOutOptionsClickStep1();
		accountHomePage.continueButtonClick();

		// Step 8: Fill in billing details, leaving the email field empty (negative
		// test)
		accountHomePage.inputFieldName("Bruce");
		accountHomePage.inputFieldLast("Wayne");
		accountHomePage.inputFieldEmail(""); // Intentionally left blank
		accountHomePage.inputFieldPhone(loginCartTest.correctPhoneNum);
		accountHomePage.inputFieldPassword(loginCartTest.correctPassword);
		accountHomePage.inputFieldPasswordConfirm(loginCartTest.correctPasswordConfirm);

		// Step 9: Check "My delivery address is the same as billing"
		accountHomePage.clickCheckbox();

		// Step 10: Enter delivery address details
		accountHomePage.inputFieldCompany(loginCartTest.correctCompany);
		accountHomePage.inputFieldAddress(loginCartTest.correctAddress);
		accountHomePage.inputFieldCity(loginCartTest.correctCity);
		accountHomePage.inputFieldPostCode(loginCartTest.correctPostCode);
		accountHomePage.selectZoneByVisibleText(loginCartTest.correctZone);

		// Step 11: Accept privacy policy and try to continue
		accountHomePage.checkBoxClickPrivacyPolice();
		accountHomePage.buttonClickRegister();

		// Step 12: Verify that email validation error message is displayed
		Assert.assertTrue(accountHomePage.isEmailValidationErrorDisplayed(),
				"Email validation error should be displayed");
	}

	// isPhoneNumberValidationErrorDisplayed()
	@Test
	public void errorInputPhone() {
		// Step 1: Navigate to the product detail page
		accountHomePage.clickPhonePda(); // Open "Phones & PDAs" category
		accountHomePage.bagClickLink(); // Click on a specific product link
		accountHomePage.cartButtonClick(); // Try to add product to cart
		accountHomePage.removeCartClick(); // Remove product if already in cart
		accountHomePage.linkClickArticle(); // Reopen product detail page

		// Step 2: Verify product image is displayed
		assertTrue(accountHomePage.imageIsDisplay(), "Product image should be visible");

		// Step 3: Verify product title is correct
		String actualText = accountHomePage.headingCheckIsDisplay();
		String expectedText = "HTC Touch HD";
		Assert.assertEquals(actualText, expectedText, "Product title does not match");

		// Step 4: Add product to cart
		accountHomePage.cartToButtonClick();

		// Step 5: Verify success message after adding to cart
		String actualMessage = accountHomePage.messageChechIsDisplay();
		Assert.assertTrue(actualMessage.contains("Success: You have added HTC Touch HD to your shopping cart!"));

		// Step 6: Open cart and proceed to checkout
		accountHomePage.linkClickShoppingCart();
		accountHomePage.clickCheckoutToBey();

		// Step 7: Begin registration as a new user
		accountHomePage.checkOutOptionsClickStep1();
		accountHomePage.continueButtonClick();

		// Step 8: Fill billing info - leave phone field empty (negative test)
		accountHomePage.inputFieldName("Bruce");
		accountHomePage.inputFieldLast("Wayne");
		accountHomePage.inputFieldEmail("medan@gmail.com");
		accountHomePage.inputFieldPhone(""); // Intentionally left blank
		accountHomePage.inputFieldPassword(loginCartTest.correctPassword);
		accountHomePage.inputFieldPasswordConfirm(loginCartTest.correctPasswordConfirm);

		// Step 9: Use same delivery address
		accountHomePage.clickCheckbox();

		// Step 10: Enter delivery address details
		accountHomePage.inputFieldCompany(loginCartTest.correctCompany);
		accountHomePage.inputFieldAddress(loginCartTest.correctAddress);
		accountHomePage.inputFieldCity(loginCartTest.correctCity);
		accountHomePage.inputFieldPostCode(loginCartTest.correctPostCode);
		accountHomePage.selectZoneByVisibleText(loginCartTest.correctZone);

		// Step 11: Accept privacy policy
		accountHomePage.checkBoxClickPrivacyPolice();

		// Step 12: Attempt to continue — expect validation error
		accountHomePage.buttonClickRegister();

		// Step 13: Verify phone number validation error is displayed
		Assert.assertTrue(accountHomePage.isPhoneNumberValidationErrorDisplayed(),
				"Phone number validation error should be displayed");
	}

	// isPasswordValidationErrorDisplayed
	@Test
	public void errorInputPasswordAndConform() {
		accountHomePage.clickPhonePda();
		accountHomePage.bagClickLink();
		accountHomePage.cartButtonClick();
		accountHomePage.removeCartClick();
		accountHomePage.linkClickArticle();

		assertTrue(accountHomePage.imageIsDisplay(), "Product image should be visible");

		// Step 7: Assert that the heading on the product page is correct
		String actualText = accountHomePage.headingCheckIsDisplay();
		String expectedText = "HTC Touch HD";
		Assert.assertEquals(actualText, expectedText, "Product title does not match");

		// Step 8: Add the product to the cart from the detail page
		accountHomePage.cartToButtonClick();

		// Step 9: Verify success message is displayed after adding to cart
		String actualMessage = accountHomePage.messageChechIsDisplay();
		Assert.assertTrue(actualMessage.contains("Success: You have added HTC Touch HD to your shopping cart!"));

		accountHomePage.linkClickShoppingCart();

		// Step 11: Proceed to checkout
		accountHomePage.clickCheckoutToBey();

		// Step 12: Ensure step 1 (checkout options) is visible
		accountHomePage.checkOutOptionsClickStep1();

		// Step 13: Click continue to register a new account
		accountHomePage.continueButtonClick();

		// Step 14: Fill in billing details
		// accountHomePage.inputFieldName("Bruce");
		accountHomePage.inputFieldName("Bruce");

		accountHomePage.inputFieldLast("Wayne");
		accountHomePage.inputFieldEmail("medan@gmail.com");
		accountHomePage.inputFieldPhone("+123456789");
		accountHomePage.inputFieldPassword("ss");
		accountHomePage.inputFieldPasswordConfirm("asdasd");

		// Step 15: Check "My delivery address is the same"
		accountHomePage.clickCheckbox();

		// Step 16: Fill in company and address info
		// accountHomePage.inputFieldCompany("Gotham City");
		accountHomePage.inputFieldCompany(loginCartTest.correctCompany);
		// accountHomePage.inputFieldAddress("Mr. Wayne President");
		accountHomePage.inputFieldAddress(loginCartTest.correctAddress);
		// accountHomePage.inputFieldCity("Gotham");
		accountHomePage.inputFieldCity(loginCartTest.correctCity);
		// accountHomePage.inputFieldPostCode("590000");
		accountHomePage.inputFieldPostCode(loginCartTest.correctPostCode);
		// accountHomePage.selectZoneByVisibleText("Aberdeen");
		accountHomePage.selectZoneByVisibleText(loginCartTest.correctZone);

		// Step 17: Accept privacy policy
		accountHomePage.checkBoxClickPrivacyPolice();

		// Step 18: Continue to shipping step
		accountHomePage.buttonClickRegister();

		// Message Error for input field email
		accountHomePage.isPasswordValidationErrorDisplayed();
		accountHomePage.isPasswordConfirmValidationErrorDisplayed();

	}

	// isAddressValidationErrorDisplayed()
	@Test
	public void errorInputAddrss() {
		accountHomePage.clickPhonePda();
		accountHomePage.bagClickLink();
		accountHomePage.cartButtonClick();
		accountHomePage.removeCartClick();
		accountHomePage.linkClickArticle();

		assertTrue(accountHomePage.imageIsDisplay(), "Product image should be visible");

		// Step 7: Assert that the heading on the product page is correct
		String actualText = accountHomePage.headingCheckIsDisplay();
		String expectedText = "HTC Touch HD";
		Assert.assertEquals(actualText, expectedText, "Product title does not match");

		// Step 8: Add the product to the cart from the detail page
		accountHomePage.cartToButtonClick();

		// Step 9: Verify success message is displayed after adding to cart
		String actualMessage = accountHomePage.messageChechIsDisplay();
		Assert.assertTrue(actualMessage.contains("Success: You have added HTC Touch HD to your shopping cart!"));

		accountHomePage.linkClickShoppingCart();

		// Step 11: Proceed to checkout
		accountHomePage.clickCheckoutToBey();

		// Step 12: Ensure step 1 (checkout options) is visible
		accountHomePage.checkOutOptionsClickStep1();

		// Step 13: Click continue to register a new account
		accountHomePage.continueButtonClick();

		// Step 14: Fill in billing details
		// accountHomePage.inputFieldName("Bruce");
		accountHomePage.inputFieldName("Bruce");

		accountHomePage.inputFieldLast("Wayne");
		accountHomePage.inputFieldEmail("medaassan@gmail.com");
		accountHomePage.inputFieldPhone("+123456789");
		accountHomePage.inputFieldPassword("nikola1991");
		accountHomePage.inputFieldPasswordConfirm("nikola1991");
		accountHomePage.clickCheckbox();
		accountHomePage.inputFieldCompany(loginCartTest.correctCompany);
		accountHomePage.inputFieldAddress("");
		// accountHomePage.inputFieldCity("Gotham");
		accountHomePage.inputFieldCity(loginCartTest.correctCity);
		// accountHomePage.inputFieldPostCode("590000");
		accountHomePage.inputFieldPostCode(loginCartTest.correctPostCode);
		// accountHomePage.selectZoneByVisibleText("Aberdeen");
		accountHomePage.selectZoneByVisibleText(loginCartTest.correctZone);

		// Step 17: Accept privacy policy
		accountHomePage.checkBoxClickPrivacyPolice();

		// Step 18: Continue to shipping step
		accountHomePage.buttonClickRegister();

		// Message Error for input field email
		accountHomePage.isAddressValidationErrorDisplayed();
	}

	@Test
	public void errorInputCity() {
		accountHomePage.clickPhonePda();
		accountHomePage.bagClickLink();
		accountHomePage.cartButtonClick();
		accountHomePage.removeCartClick();
		accountHomePage.linkClickArticle();

		assertTrue(accountHomePage.imageIsDisplay(), "Product image should be visible");

		// Step 7: Assert that the heading on the product page is correct
		String actualText = accountHomePage.headingCheckIsDisplay();
		String expectedText = "HTC Touch HD";
		Assert.assertEquals(actualText, expectedText, "Product title does not match");

		// Step 8: Add the product to the cart from the detail page
		accountHomePage.cartToButtonClick();

		// Step 9: Verify success message is displayed after adding to cart
		String actualMessage = accountHomePage.messageChechIsDisplay();
		Assert.assertTrue(actualMessage.contains("Success: You have added HTC Touch HD to your shopping cart!"));

		accountHomePage.linkClickShoppingCart();

		// Step 11: Proceed to checkout
		accountHomePage.clickCheckoutToBey();

		// Step 12: Ensure step 1 (checkout options) is visible
		accountHomePage.checkOutOptionsClickStep1();

		// Step 13: Click continue to register a new account
		accountHomePage.continueButtonClick();

		// Step 14: Fill in billing details
		// accountHomePage.inputFieldName("Bruce");
		accountHomePage.inputFieldName("Bruce");

		accountHomePage.inputFieldLast("Wayne");
		accountHomePage.inputFieldEmail("medaassan@gmail.com");
		accountHomePage.inputFieldPhone("+123456789");
		accountHomePage.inputFieldPassword("nikola1991");
		accountHomePage.inputFieldPasswordConfirm("nikola1991");
		accountHomePage.clickCheckbox();
		accountHomePage.inputFieldCompany(loginCartTest.correctCompany);
		accountHomePage.inputFieldAddress("Heroja Pinkija");
		accountHomePage.inputFieldCity("");
		// accountHomePage.inputFieldPostCode("590000");
		accountHomePage.inputFieldPostCode(loginCartTest.correctPostCode);
		// accountHomePage.selectZoneByVisibleText("Aberdeen");
		accountHomePage.selectZoneByVisibleText(loginCartTest.correctZone);

		// Step 17: Accept privacy policy
		accountHomePage.checkBoxClickPrivacyPolice();

		// Step 18: Continue to shipping step
		accountHomePage.buttonClickRegister();

		// Message Error for input field email
		accountHomePage.isCityValidationErrorDisplayed();
	}

	@Test
	public void errorInputPostCode() {
		accountHomePage.clickPhonePda();
		accountHomePage.bagClickLink();
		accountHomePage.cartButtonClick();
		accountHomePage.removeCartClick();
		accountHomePage.linkClickArticle();

		assertTrue(accountHomePage.imageIsDisplay(), "Product image should be visible");

		// Step 7: Assert that the heading on the product page is correct
		String actualText = accountHomePage.headingCheckIsDisplay();
		String expectedText = "HTC Touch HD";
		Assert.assertEquals(actualText, expectedText, "Product title does not match");

		// Step 8: Add the product to the cart from the detail page
		accountHomePage.cartToButtonClick();

		// Step 9: Verify success message is displayed after adding to cart
		String actualMessage = accountHomePage.messageChechIsDisplay();
		Assert.assertTrue(actualMessage.contains("Success: You have added HTC Touch HD to your shopping cart!"));

		accountHomePage.linkClickShoppingCart();

		// Step 11: Proceed to checkout
		accountHomePage.clickCheckoutToBey();

		// Step 12: Ensure step 1 (checkout options) is visible
		accountHomePage.checkOutOptionsClickStep1();

		// Step 13: Click continue to register a new account
		accountHomePage.continueButtonClick();

		// Step 14: Fill in billing details
		// accountHomePage.inputFieldName("Bruce");
		accountHomePage.inputFieldName("Bruce");

		accountHomePage.inputFieldLast("Wayne");
		accountHomePage.inputFieldEmail("medaassan@gmail.com");
		accountHomePage.inputFieldPhone("+123456789");
		accountHomePage.inputFieldPassword("nikola1991");
		accountHomePage.inputFieldPasswordConfirm("nikola1991");
		accountHomePage.clickCheckbox();
		accountHomePage.inputFieldCompany(loginCartTest.correctCompany);
		accountHomePage.inputFieldAddress("Heroja Pinkija");
		accountHomePage.inputFieldCity("");
		// accountHomePage.inputFieldPostCode("590000");
		accountHomePage.inputFieldPostCode("");
		// accountHomePage.selectZoneByVisibleText("Aberdeen");
		accountHomePage.selectZoneByVisibleText(loginCartTest.correctZone);

		// Step 17: Accept privacy policy
		accountHomePage.checkBoxClickPrivacyPolice();

		// Step 18: Continue to shipping step
		accountHomePage.buttonClickRegister();

		// Message Error for input field email
		accountHomePage.isPostCodeValidationErrorDisplayed();
	}

	// isRegionValidationErrorDisplayed()
	@Test
	public void errorInputRegion() {
		accountHomePage.clickPhonePda();
		accountHomePage.bagClickLink();
		accountHomePage.cartButtonClick();
		accountHomePage.removeCartClick();
		accountHomePage.linkClickArticle();

		assertTrue(accountHomePage.imageIsDisplay(), "Product image should be visible");

		// Step 7: Assert that the heading on the product page is correct
		String actualText = accountHomePage.headingCheckIsDisplay();
		String expectedText = "HTC Touch HD";
		Assert.assertEquals(actualText, expectedText, "Product title does not match");

		// Step 8: Add the product to the cart from the detail page
		accountHomePage.cartToButtonClick();

		// Step 9: Verify success message is displayed after adding to cart
		String actualMessage = accountHomePage.messageChechIsDisplay();
		Assert.assertTrue(actualMessage.contains("Success: You have added HTC Touch HD to your shopping cart!"));

		accountHomePage.linkClickShoppingCart();

		// Step 11: Proceed to checkout
		accountHomePage.clickCheckoutToBey();

		// Step 12: Ensure step 1 (checkout options) is visible
		accountHomePage.checkOutOptionsClickStep1();

		// Step 13: Click continue to register a new account
		accountHomePage.continueButtonClick();

		// Step 14: Fill in billing details
		// accountHomePage.inputFieldName("Bruce");
		accountHomePage.inputFieldName("Bruce");

		accountHomePage.inputFieldLast("Wayne");
		accountHomePage.inputFieldEmail("medaallssan@gmail.com");
		accountHomePage.inputFieldPhone("+123456789");
		accountHomePage.inputFieldPassword("nikola1991");
		accountHomePage.inputFieldPasswordConfirm("nikola1991");
		accountHomePage.clickCheckbox();
		accountHomePage.inputFieldCompany(loginCartTest.correctCompany);
		accountHomePage.inputFieldAddress("Heroja Pinkija");
		accountHomePage.inputFieldCity("Gotham");
		accountHomePage.inputFieldPostCode("5900000");
		// accountHomePage.selectZoneByVisibleText("Aberdeen");
		accountHomePage.isZoneValidationErrorDisplayed();

		// Step 17: Accept privacy policy
		accountHomePage.checkBoxClickPrivacyPolice();

		// Step 18: Continue to shipping step
		accountHomePage.buttonClickRegister();

		// Message Error for input field email
		accountHomePage.isRegionValidationErrorDisplayed();
	}
}
