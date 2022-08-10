package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class BookPage extends BaseClass {

	public BookPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Books")
	private WebElement BooksLink;
	
	@FindBy(xpath="(//input[@value='Add to cart'])[1]")
	private WebElement BCart;
	
	@FindBy(linkText = "Shopping cart")
	private WebElement CartLink;
	
	public WebElement getCartLink() {
		return CartLink;
	}
	public WebElement getBCart() {
		return BCart;
	}
	public WebElement getBooksLink() {
		return BooksLink;
	}

}
