package seleniumpractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreeCRMHandle {
	//a[text()='Nikhil Borde']/parent::td/preciding-sibling::td/input

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\D:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys("anurag_borde");
		driver.findElement(By.name("password")).sendKeys("Anurag@92");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		//input[@value='Login']
		Thread.sleep(5000);
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		

	}

}
