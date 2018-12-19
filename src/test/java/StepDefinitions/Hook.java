package StepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import PageObjects.LoginPage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	public static WebDriver driver;
	@Before
	public void StartTest()
	
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Setup\\Eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public void EndTest(Scenario scenario)
	{
		if (scenario.isFailed()) {
	        byte[] screenshot = 
	        		((RemoteWebDriver) this.driver).getScreenshotAs(OutputType.BYTES);
	        scenario.embed(screenshot, "image/png");
	    }
	}
}
