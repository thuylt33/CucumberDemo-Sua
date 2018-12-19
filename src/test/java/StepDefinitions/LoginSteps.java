package StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.LoginPage;

public class LoginSteps {
	WebDriver driver = Hook.driver;
	LoginPage loginPage;
	
	@Before
	public void StartTest()
	{
		loginPage = new LoginPage(driver);
	}
	
	@After
	public void EndTest(Scenario scenario)
	{
		if (scenario.isFailed()) {
	        byte[] screenshot = ((RemoteWebDriver) this.driver).getScreenshotAs(OutputType.BYTES);
	        scenario.embed(screenshot, "image/png");
	    }
	}
	
	@Given("^I am staying at Login page$")
	public void i_am_staying_at_Login_page() throws Exception {
	    driver.get("http://testmaster.vn/Account/Login?ReturnUrl=%2fadmin");
	}

	@When("^I give the invalid username and blank value for password$")
	public void i_give_the_invalid_username_and_blank_value_for_password() throws Exception {
	    loginPage.txtUserName.sendKeys("khanh.tx @live");
	    loginPage.txtPassword.sendKeys("");
	}

	@When("^I do login$")
	public void i_do_login() throws Exception {
	    loginPage.btnLogin.click();
	}

	@Then("^I should see the error tooltip \"([^\"]*)\" placed on UserName Field$")
	public void i_should_see_the_error_tooltip_placed_on_UserName_Field(String arg1) throws Exception {
	    String toolTipValue = loginPage.txtUserName.getAttribute("data-original-title");
	    
	    assertEquals(toolTipValue, arg1);
	}

	@Then("^\"([^\"]*)\" is placed on Password field$")
	public void is_placed_on_Password_field(String arg1) throws Exception {
		String toolTipValue = loginPage.txtPassword.getAttribute("data-original-title");
		
		assertEquals(toolTipValue, arg1);
	}
	
	@When("^I give the valid username and wrong password value$")
	public void i_give_the_valid_username_and_wrong_password_value() throws Exception {
	    loginPage.txtUserName.sendKeys("khanh.tx@live.com");
	    loginPage.txtPassword.sendKeys("abc123456");
	}

	@Then("^I should see the notification message \"([^\"]*)\"$")
	public void i_should_see_the_notification_message(String arg1) throws Exception {
	    Thread.sleep(2000);
	    assertEquals(loginPage.txtMessageBox.getText(), arg1);
	}
}