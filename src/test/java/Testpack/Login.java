package Testpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login {

	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void login() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	@Test(priority=2)
	public void verifyTitle() {
		Assert.assertEquals("Swag Labs", driver.getTitle());
	}
	@AfterClass
	public void close() {
		driver.close();
	}
}
