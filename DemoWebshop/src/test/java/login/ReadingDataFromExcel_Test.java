package login;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepository.LoginPage;

public class ReadingDataFromExcel_Test extends BaseClass {
	@Test(dataProvider = "test data", dataProviderClass =ReadExcel.class )
public void readingData(String un, String pwd) {
	LoginPage login=new LoginPage(driver);
	login.getLoginLink().click();
	login.getEmailTextField().sendKeys(un);
	login.getPasswordTextField().sendKeys(pwd);
	login.getLoginButton().click();

}
}
