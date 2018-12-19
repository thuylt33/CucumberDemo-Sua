package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class SubscriptionSteps {
	WebDriver driver;
	
	@Before
	public void StartTest()
	{
		this.driver = Hook.driver;
	}
	
	@Given("^I stayed at testmaster homepage$")
	public void i_stayed_at_testmaster_homepage() throws Exception {
	    this.driver.get("http://testmaster.vn");
	}

	@When("^I provide existed account \"([^\"]*)\" and press Enter$")
	public void i_provide_existed_account_and_press_Enter(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new PendingException();
	}

//	@Then("^I should see the error message \"([^\"]*)\"$")
//	public void i_should_see_the_error_message(String arg1) throws Exception {
//		// Write code here that turns the phrase above into concrete actions
//		// throw new PendingException();
//	}
}
