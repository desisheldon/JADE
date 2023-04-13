package seleniumpractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandleWithSelectTag {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\D:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
//top casting advantage is that same object ref can be used to open different browsers
	
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial"); 
		//https://www.saucedemo.com/
		WebElement country=driver.findElement(By.id("Form_getForm_Country"));
		Select select=new Select(country);
		select.selectByValue("Germany");
		driver.close(); //current tab
		driver.quit();

	}

}
