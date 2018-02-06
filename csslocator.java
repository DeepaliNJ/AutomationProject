package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class csslocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C://Users/dyj/Downloads/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("input[id ='username']")).sendKeys("Hello");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("123234");
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		
	}

}
