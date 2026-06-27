package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	
	//declaration
	@FindBy(linkText = "Register")
	private WebElement reglink;
	
	@FindBy(linkText = "Log in")
	private WebElement loglink;
	
	@FindBy(id = "small-searchterms")
	private WebElement searchbox;
	
	@FindBy(xpath = "submit")
	private WebElement searchbutton;
	
	
	//initialization
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
    //calling getter methods
	public WebElement getReglink() {
		return reglink;
	}
	public WebElement getLoglink() {
		return loglink;
	}
	public WebElement getSearchbox() {
		return searchbox;
	}
	public WebElement getSearchbutton() {
		return searchbutton;
	}
	
	
	
}
