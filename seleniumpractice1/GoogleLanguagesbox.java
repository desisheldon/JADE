package seleniumpractice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguagesbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\D:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		List<WebElement> langList= driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		System.out.println(langList.size());
		
		for(WebElement e:langList) {
			String text=e.getText();
			System.out.println(text);
		}

	}

}
