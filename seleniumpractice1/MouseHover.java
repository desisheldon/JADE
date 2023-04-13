package seleniumpractice1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
//URL: http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html
		System.setProperty("webdriver.chrome.driver", "\\D:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		Actions action=new Actions(driver);
		WebElement hover=driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		action.moveToElement(hover).perform();
		List<WebElement> links=driver.findElements(By.xpath("//div[@class='dropdown-content']/a"));
		//driver.quit();
		int count=links.size();
		System.out.println("No. of links in dropdown are : "+count);
		
		for (WebElement e : links) {
			String text=e.getText();
			boolean status=e.isEnabled();
			System.out.println("Link name is : "+text+" & status is "+status);
			if(text.equalsIgnoreCase("Selenium")) {
				e.click();
				break;
			}
		}
		//driver.quit();
	}

}
