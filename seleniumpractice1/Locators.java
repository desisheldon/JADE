package seleniumpractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\D:\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		//1. Id
		
//		driver.findElement(	).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();
		
		//2nd. 
//		WebElement email=driver.findElement(By.id("user-name"));
//		WebElement password=driver.findElement(By.id("password"));
//		email.sendKeys("standard_user");
//		password.sendKeys("secret_sauce");
		
		//3rd By locators
//		By email=By.id("user-name");
//		By password=By.id("password");
//		By loginBtn=By.id("login-button");
//		WebElement emaiId=driver.findElement(email);
//		WebElement pwd=driver.findElement(password);
//		WebElement LoginButton=driver.findElement(loginBtn);
//		
//		emaiId.sendKeys("standard_user");
//		pwd.sendKeys("secret_sauce");
//		LoginButton.click();
		
		//4th By locator with generic method
//		By email=By.id("user-name");
//		By password=By.id("password");
//		By loginBtn=By.id("login-button");
//
//		getElement(email).sendKeys("standard_user");
//		getElement(password).sendKeys("secret_sauce");
//		getElement(loginBtn).click();
		
		//6th ElementUtil class with generic method
		By email=By.id("user-name");
		By password=By.id("password");
		By loginBtn=By.id("login-button");
		
		ElementUtil eleUtil=new ElementUtil(driver);
		eleUtil.sendKeys(email, "standard_user");
		eleUtil.sendKeys(password, "secret_sauce");
		eleUtil.getElement(loginBtn).click();
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
