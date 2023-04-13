package seleniumpractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\D:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   //top casting  (Open the browser)
		driver.get("https://app.hubspot.com/login");
		String title=driver.getTitle();
		System.out.println("Title of the page is => "+title);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("anuragborde@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Anurag@92");
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		driver.wait(5000);
		//driver.findElement(By.xpath("//div[@class='rFrNMe N3Hzgf jjwyfe QBQrY zKHdkd sdJrJc Tyc9J']")).sendKeys("anuragborde@gmail.com");
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("anurag.borde@jadeglobal.com");
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("")
		
		//driver.quit();
	}

}
