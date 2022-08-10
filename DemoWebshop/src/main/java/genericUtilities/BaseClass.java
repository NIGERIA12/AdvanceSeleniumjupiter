package genericUtilities;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass {
	public WebDriver driver;
	@BeforeSuite
	public void launchBrowser() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		Reporter.log("Browser is laucnhed",true);
		driver.manage().window().maximize();
		Reporter.log("Window is maximized",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@BeforeMethod
	public void NavigatingToApplication() {
		driver.get("http://demowebshop.tricentis.com/");
		Reporter.log("Navigated to application",true);
	}

	@AfterMethod
	public void logoutOperation(ITestResult result) throws IOException {
		if(ITestResult.FAILURE==result.getStatus()){
			ScreenshotUtility.takingScreenshot(driver, result.getName());
		}
		System.out.println("logout from app");
		Reporter.log("Logged out from application",true);
	}
	@AfterSuite
	public void tearDownTheBrowser() {
		driver.quit();
		Reporter.log("Quitted the browser",true);
	}
}
