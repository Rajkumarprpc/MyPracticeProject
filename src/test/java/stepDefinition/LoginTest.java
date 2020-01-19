package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class LoginTest {
	
	WebDriver driver;

	@Given("^open (.*) and launch (.*)$")
	public void open_and_launch(String browser, String url) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get(url);

	}

//	@When("^i enter valid (.*) and valid (.*)$")
//	public void i_enter_valid_and_valid(String username, String password) throws Throwable {
//		
//		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(username);
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
//		driver.findElement(By.xpath("//input[@value='Log In']")).click();
//		Thread.sleep(5000);
//		driver.quit();
//	}
	
	@When("^i enter valid saurav and mitra$")
	public void i_enter_valid_saurav_and_mitra(String username, String password) throws Throwable {
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(5000);
		driver.quit();
	}
	
}
