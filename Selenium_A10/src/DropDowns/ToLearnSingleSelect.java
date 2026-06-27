package DropDowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSingleSelect {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("file:///C:/Users/manju/OneDrive/Desktop/Country.html");
	WebElement ele = driver.findElement(By.id("countries"));
	
	Select sel = new Select(ele);
	sel.selectByIndex(1);
	sel.selectByValue("4");
	sel.selectByVisibleText("ITALY");
}
}
