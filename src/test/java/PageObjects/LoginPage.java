package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(css="div.login-form input[type=email]")
	public WebElement txtUserName;
	
	@FindBy(css="div.login-form input[type=password]")
	public WebElement txtPassword;
	
	@FindBy(css="button.btn-login")
	public WebElement btnLogin;
	
	@FindBy(css=".body-message>b")
	public WebElement txtMessageBox;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
