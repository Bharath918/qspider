package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TolearnClickAndHold {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://yonobusiness.sbi.bank.in/yonobusinesslogin");
	
	
	driver.findElement(By.xpath("//span[contains(@class,'ng-tns-c')]")).click();
	
	WebElement pwd = driver.findElement(By.id("password"));
	pwd.sendKeys("Reddy");
	
	WebElement eye = driver.findElement(By.xpath("//img[@src='assets/img/Revamp/icon_eye_close.svg']"));
	
	Actions act = new Actions(driver);
	act.clickAndHold(eye).perform();
	
	Thread.sleep(3000);
	
}
}
