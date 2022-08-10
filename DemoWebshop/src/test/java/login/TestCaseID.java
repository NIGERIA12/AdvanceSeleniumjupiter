package login;

import org.testng.annotations.Test;
import genericUtilities.BaseClass;
import objectRepository.LoginPage;

public class TestCaseID extends BaseClass {

	@Test

	public void testCaseDescription() {

		LoginPage loginElements = new LoginPage(driver);
		loginElements.getLoginLink().click();
		loginElements.getEmailTextField().sendKeys("xyz@gmail.com");
		loginElements.getPasswordTextField().sendKeys("123456");
		loginElements.getLoginButton().click();
	}
}
