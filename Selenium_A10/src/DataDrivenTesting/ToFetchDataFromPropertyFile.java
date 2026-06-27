package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchDataFromPropertyFile {
public static void main(String[] args) throws IOException {
	
	FileInputStream fis = new FileInputStream("./TestData/CommonData.Properties");
	
	Properties prop = new Properties();
	
	prop.load(fis);
	
	String url = prop.getProperty("url");
	System.out.println(url);
	
	System.out.println("..................................................");
	
	String email = prop.getProperty("email");
	System.out.println(email);
	
	System.out.println("..................................................");
	
	String pass = prop.getProperty("password");
	System.out.println(pass);
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get(url);
	
	driver.findElement(By.linkText("Log in")).click();
	
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Password")).sendKeys(pass);
	
	
	
	
}
}
