package seleniumpractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSendKeys {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\D:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login");
		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
        WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("arguments[0].value='anuragborde@gmail.com'", username);
        jse.executeScript("arguments[0].value='Anurag@92'", password);
	}

}
