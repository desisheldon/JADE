package seleniumpractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\D:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   //top casting  (Open the browser)
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		int rowCount=driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
        System.out.println("No. of rows are : "+rowCount);
        
      //*[@id="customers"]/tbody/tr[2]/td[1]
      //*[@id="customers"]/tbody/tr[5]/td[1]
        String beforeXpath="//*[@id=\'customers\']/tbody/tr[";
        String afterXpath="]/td[1]";
        for(int rowNum=2;rowNum<rowCount+1;rowNum++) {
        	String actualXpath=beforeXpath+rowNum+afterXpath;
        	System.out.println(actualXpath);
        	String value=driver.findElement(By.xpath(actualXpath)).getText();
        	System.out.println(value);	
        }
	}

}
