package seleniumpractice1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\D:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   //top casting  (Open the browser)
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,500)");

	}

}
