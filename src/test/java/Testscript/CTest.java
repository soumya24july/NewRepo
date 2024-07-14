package Testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CTest {

	WebDriver driver;
		
		
		@Test
		public void m3()
		{
			
			String brow = System.getProperty("Browser");
			String url = System.getProperty("url");
			if(brow.equals("chrome"))
			{
				driver=new ChromeDriver();
			}
			else if(brow.equals("firefox"))
			{
				driver=new FirefoxDriver();
			}
			driver.get(url);
		}
	}


