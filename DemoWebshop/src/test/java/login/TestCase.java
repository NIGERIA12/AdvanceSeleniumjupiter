package login;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);

		driver.get("https://www.busonlineticket.com/");
		driver.findElement(By.id("txtOrigin")).click();
		driver.findElement(By.xpath("(//div[text()='Cameron Highlands'])[1]")).click();
		driver.findElement(By.xpath("(//div[text()='Kuala Lumpur'])[1]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Depart Date'])[1]")).click();
		WebElement element = driver.findElement(By.xpath("(//span[text()='Next'])[3]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		driver.findElement(By.xpath("//td[@data-month='7']//a[.='20']")).click();
		driver.findElement(By.id("btnBusSearchNew")).click();
		driver.findElement(By.xpath("(//a[text()='Select'])[1]")).click();
		for(int i=1;i<=6;i++) {
			driver.findElement(By.xpath("//div[text()='"+i+"']")).click();
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Proceed']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='payment_textName form-control pay-form-control']")).sendKeys("nandini M S");
		driver.findElement(By.xpath("//input[@class='payment_txtPhoneLogin form-control pay-form-control']")).sendKeys("8234654344");
		driver.findElement(By.xpath("//input[@class='payment_txtEmail form-control pay-form-control']")).sendKeys("nandini@gamil.com");
		driver.findElement(By.id("btnNext")).click();
		driver.findElement(By.id("payment_btnProceedPayment")).click();	
	}
}