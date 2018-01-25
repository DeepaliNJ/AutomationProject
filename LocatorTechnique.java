package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorTechnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C://Users/dyj/Downloads/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.expedia.com/");
	
		driver.findElement(By.id("tab-flight-tab-hp")).click();
		
		driver.findElement(By.id("flight-origin-hp-flight")).sendKeys("Seattle");
		//driver.findElement(By.name("pass")).sendKeys("Aurangabad@10");
		//driver.findElement(")
	}

}
