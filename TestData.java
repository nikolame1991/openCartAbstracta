package openCartAbstracta;

import org.testng.annotations.DataProvider;

public class TestData {

	// Predefined valid test data (can be used for filling individual fields)
	public String correctUserName = "Bruce";
	public String correctLastName = "Wayne";
	public String correctEmail = "brucewayne@gmail.com";
	public String correctPhoneNum = "+123456789";
	public String correctPassword = "nikola1991";
	public String correctPasswordConfirm = "nikola1991";
	public String correctCompany = "Gotham City";
	public String correctAddress = "Mr. Wayne President";
	public String correctCity = "Gotham";
	public String correctPostCode = "590000";
	public String correctZone = "Aberdeen";

	// DataProvider that supplies multiple user data sets for parameterized tests
	@DataProvider(name = "loginCartTest")
	public Object[][] loginCartTest() {
		return new Object[][] {
				// Valid user scenario (all correct input values)
				{ "Bruce", "Wayne", "nasssde@gmail.com", "+123456789", "nikola1991", "nikola1991", "Gotham City",
						"Mr. Wayne President", "Gotham", "590000", "Aberdeen" },

				// Another user scenario with different (potentially invalid or edge case) data
				{ "Clark", "Kent", "clarkkent@gmail.com", "+987654321", "clark1930", "clark1930", "New York",
						"News paper", "Chicago", "123000", "asdadadad" } };
	}
}
