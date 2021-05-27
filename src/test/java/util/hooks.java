package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {

	public static WebDriver driver;
	@Before
	public void initdriver() {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//chromedriver_win32//chromedriver.exe");

		driver = new ChromeDriver();
		
		System.out.println("in before Annotayion");

	}
	
	@After
	public void exitdriver()
	{
		driver.quit();
		System.out.println("in after Annotayion");

	}

}


