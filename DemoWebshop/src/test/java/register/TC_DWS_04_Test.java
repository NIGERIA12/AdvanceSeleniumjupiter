package register;

import static org.testng.Assert.assertEquals;


import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.UtilityClass;
import objectRepository.RegisterPage;

public class TC_DWS_04_Test extends BaseClass {
	@Test
	public void Validate_Register_valid_credentials() throws IOException {
		RegisterPage Register = new RegisterPage(driver);
		String ExpectedTitle = "Demo Web Shop. Register";
		UtilityClass utility = new UtilityClass();
		Register.getRegisterLink().click();
		
		Reporter.log("Clicked on Register button", true);
		Register.getGender().click();
		Reporter.log("Clicked on Radio button", true);

		Register.getFirstName().sendKeys(utility.propertyFileReader1("FirstName"));
		assertEquals(utility.propertyFileReader1("FirstName"), Register.getFirstName().getAttribute("value"),
				"Firstname is not proper");
		Reporter.log("Succesfully entered firstName", true);
		
		Register.getLastName().sendKeys(utility.propertyFileReader1("LastName"));
		assertEquals(utility.propertyFileReader1("LastName"), Register.getLastName().getAttribute("value"),
				"Last name is not proper");
		Reporter.log("Succesfully entered lastName", true);
		
		Register.getEmail().sendKeys(utility.propertyFileReader1("Email"));
		assertEquals(utility.propertyFileReader1("Email"), Register.getEmail().getAttribute("value"),
				"Email is not proper");
		Reporter.log("Succesfully entered Email", true);
		
		Register.getPassword().sendKeys(utility.propertyFileReader1("Password"));
		assertEquals(utility.propertyFileReader1("Password"), Register.getPassword().getAttribute("value"),
				"Password is not proper");
		Reporter.log("Succesfully entered Password", true);
		
		Register.getConfirmPassword().sendKeys(utility.propertyFileReader1("ConfirmPassword"));
		assertEquals(utility.propertyFileReader1("ConfirmPassword"), Register.getConfirmPassword().getAttribute("value"),
				"ConfirmPassword is not proper");
		Reporter.log("Succesfully entered ConfirmPassword", true);
		
		
		Register.getRegisterButton().click();
		Reporter.log("Succesfully Logged in to the application", true);
		assertEquals(ExpectedTitle, driver.getTitle(), "Test case Passed");
		
		


	}

}
