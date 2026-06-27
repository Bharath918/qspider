package POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {
public static void main(String[] args) throws IOException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
    FileInputStream fis = new FileInputStream("./TestData/CommonData.Properties");
	
	Properties prop = new Properties();
	
	prop.load(fis);
	String url = prop.getProperty("url");
	String email = prop.getProperty("email");
	String pass = prop.getProperty("password");
	
	driver.get(url);
	WelcomePage wp = new WelcomePage(driver);
	wp.getLoglink().click();
	LoginPage lp = new LoginPage(driver);
	lp.getEm().sendKeys(email);
	lp.getPass().sendKeys(pass);
	lp.getLogbutton().click();
	lp.getLogout().click();
	
	
	
}
}
