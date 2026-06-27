package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment1InDataDriven {
public static void main(String[] args) throws IOException {
	
	FileInputStream fis = new FileInputStream("./TestData/Register.Properties");
	
	Properties prop = new Properties();
	
	prop.load(fis);
	
	String url1 = prop.getProperty("url1");
	System.out.println(url1);
	
	String name = prop.getProperty("Name");
	
	String email = prop.getProperty("Email");
	
	String mob = prop.getProperty("Mobile");
	
	String age = prop.getProperty("Age");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get(url1);
	
	driver.findElement(By.id("reg_new_btn")).click();
	
	driver.findElement(By.id("firstname")).sendKeys(name);
	
	driver.findElement(By.id("email")).sendKeys(email);
	
	driver.findElement(By.id("mobile")).sendKeys(mob);
	
	WebElement dob = driver.findElement(By.id("datepicker"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].value='31/07/2000';", dob);
	
	//driver.findElement(By.id("submitRegister")).click();
	
}
}
