package Selenium_Pravallika_maven.Selenium_Pravallika_maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverDemo {
	static WebDriver driver=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

}
