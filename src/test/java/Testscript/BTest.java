package Testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BTest {
	
	
	@Test
	public void m2()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}

}
