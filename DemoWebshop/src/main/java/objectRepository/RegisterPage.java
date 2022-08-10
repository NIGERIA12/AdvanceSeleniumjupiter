package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class RegisterPage extends BaseClass {

		public RegisterPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		@FindBy(linkText = "Register")
		private WebElement RegisterLink;
		
		@FindBy(xpath="//input[@value='F']")
		private WebElement Gender;
		
		@FindBy(id="FirstName")
		private WebElement FirstName;
		
		@FindBy(id="LastName")
		private WebElement LastName;
		
		@FindBy(id="Email")
		private WebElement Email;
		
		@FindBy(id="Password")
		private WebElement Password;
		
		@FindBy(id="ConfirmPassword")
		private WebElement ConfirmPassword;
		
		@FindBy(id="register-button")
		private WebElement RegisterButton;

		public WebElement getRegisterLink() {
			return RegisterLink;
		}

		public WebElement getGender() {
			return Gender;
		}

		public WebElement getFirstName() {
			return FirstName;
		}

		public WebElement getLastName() {
			return LastName;
		}

		public WebElement getEmail() {
			return Email;
		}

		public WebElement getPassword() {
			return Password;
		}

		public WebElement getConfirmPassword() {
			return ConfirmPassword;
		}

		public WebElement getRegisterButton() {
			return RegisterButton;
		}
		
		
}
