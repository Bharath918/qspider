package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathUsingContains {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
//	driver.get("https://www.flipkart.com/");
	
//	driver.findElement(By.xpath("(//input[contains(@title,'Search')])[1]")).sendKeys("Shoes");

	driver.get("https://demowebshop.tricentis.com/");
	
	String text = driver.findElement(By.xpath("//div[contains(text(),'Copyright')]")).getText();
	System.out.println(text);
}
}
