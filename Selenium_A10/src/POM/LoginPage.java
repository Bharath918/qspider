package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id = "Email")
	private WebElement em;
	
	@FindBy(id = "Password")
	private WebElement pass;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement logbutton;
	
	@FindBy(linkText = "Log out")
	private WebElement logout;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getEm() {
		return em;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogbutton() {
		return logbutton;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	
}
