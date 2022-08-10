package books;


import static org.testng.Assert.assertNotEquals;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepository.BookPage;

public class TC_DWS_06_Test extends BaseClass {
	@Test
	public void Validate_Books_invalid_credentials() throws IOException {
		BookPage book = new BookPage(driver);
		String ExpectedTitle = "Demo Web Shop. Books1";
		//UtilityClass utility = new UtilityClass();
		
		book.getBooksLink().click();
		Reporter.log("Clicked on link",true);
		assertNotEquals(ExpectedTitle,driver.getTitle(),"Test case Passed");
		

}

}
