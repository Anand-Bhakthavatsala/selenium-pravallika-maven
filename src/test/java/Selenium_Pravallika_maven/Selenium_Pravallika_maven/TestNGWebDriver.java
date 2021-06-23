package Selenium_Pravallika_maven.Selenium_Pravallika_maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGWebDriver {
		static WebDriver driver=null;
	
		// TODO Auto-generated method stub
		
		//WebDriverManager.chromedriver().setup();
	/*	WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		*/
		
	@Test (priority=0) //TestNG annotation 
	public void invokeBrowser() throws InterruptedException
	{
		System.out.println("Hello TestNG");
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.seleniumeasy.com/testng-tutorials/");
		Thread.sleep(3000);
	}
	
	@Test (priority=1)//TestNG annotation
	public void closeBroser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
	

}
