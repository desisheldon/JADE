package seleniumpractice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithoutSelectClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\D:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   //top casting  (Open the browser)
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		//driver.switchTo().alert().accept();   POP UP
		//directly using Xpath
		//driver.findElement(By.xpath("//select[@name='country']//following::option[@value='GERMANY']")).click();
		List<WebElement> countries=driver.findElements(By.xpath("//select[@name='country']//option"));
		driver.getWindowHandles();  //Returns a set of strings
		//using normal loop
//		for(int i=0;i<countries.size();i++) {
//			if(countries.get(i).getText().contains("GERMANY")) {
//				System.out.println(countries.get(i).getText());
//				countries.get(i).click();
//				//countries.get(i).getAttribute("value").toString();
//				break;
//		     }
//			}
		//using forEach loop	
		for (WebElement we : countries) {
			if(we.getText().contains("GERMANY")) {
				we.click();
				System.out.println(we.getText());
				break;
			}
		}
		
		
		
	}

}
