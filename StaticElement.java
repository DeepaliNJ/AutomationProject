package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dyj\\Downloads\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com/");
		//By using select() class handling static dropbox
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("2");
		s.selectByIndex(6);
		s.selectByVisibleText("4");
		//Handling dynamic dropbox
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		//Handling check box 
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).isSelected());
		
		
		
	}
	

}
