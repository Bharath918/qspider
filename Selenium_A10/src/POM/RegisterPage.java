package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	@FindBy (id = "gender-male")
	private WebElement Gender;

	@FindBy(id ="FirstName")
	private WebElement FirstName;

	@FindBy(id ="LastName")
	private WebElement LastName;

	@FindBy (id ="Email")
	private WebElement Email;

	@FindBy(id ="Password")
	private WebElement Password;

	@FindBy (id ="ConfirmPassword")
	private WebElement ConfirmPassword;

	@FindBy(id ="register-button")
	private WebElement register_button;


	//initialization

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}


	//call  getter methods
	public WebElement getGender() {
		return Gender;
	}


	public WebElement getFirstName() {
		return FirstName;
	}


	public WebElement getLastName() {
		return LastName;
	}


	public WebElement getEmail() {
		return Email;
	}


	public WebElement getPassword() {
		return Password;
	}


	public WebElement getConfirmPassword() {
		return ConfirmPassword;
	}


	public WebElement getRegister_button() {
		return register_button;
	}


}