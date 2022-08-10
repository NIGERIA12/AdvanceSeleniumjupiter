package books;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Reporter;

import genericUtilities.BaseClass;
import objectRepository.BookPage;

public class TC_DWS_10_Test extends BaseClass {
	public void Validate_Books_valid_credentials_Shoppingcart() throws IOException {
		BookPage book = new BookPage(driver);
		//String ExpectedTitle = "Demo Web Shop. Shopping Cart";
		//UtilityClass utility = new UtilityClass();
		String Productname="Computing and Internet";
		
		book.getBooksLink().click();
		Reporter.log("Clicked on link",true);
		book.getBCart().click();
		Reporter.log("Clicked on  add to cart link",true);
		book.getCartLink().click();
		Reporter.log("Clicked on link",true);
		String s = driver.getTitle();
		System.out.println(s);
		
		//assertEquals(Productname,driver.),"Test case Passed");
}
	
}
