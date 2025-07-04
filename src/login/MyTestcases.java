package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestcases {
	
	WebDriver driver = new ChromeDriver();
	
	String TheURL = "https://automationteststore.com/";
	
	@BeforeTest
	public void mySetup() {
		
		driver.get(TheURL);
		
		driver.manage().window().maximize();
		
		//manaf
	}
	
	
	@Test
	public void myFirstTest() {}
	
	
	
	
	

}
