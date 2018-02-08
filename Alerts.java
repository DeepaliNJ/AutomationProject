package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C://Users/dyj/Downloads/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();;
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();//driver Switching from webpage to java alert.
		
		
	
	
	
	}

}
