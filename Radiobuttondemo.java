package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radiobuttondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C://Users/dyj/Downloads/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		//driver.findElement(By.xpath("//input[@value='Milk']")).click();
		//here we used findelements() to find more than one element.
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		for ( int i =0; i < count; i++) 
		{
			
		  String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
		  System.out.println(text);
		  if (text.equals("Cheese"))
		  {			
			  
			  driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			  
		  }
			
		}
		
		
	}

}
