package Assignement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathassignement {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/products_page/55");
	
	driver.findElement(By.xpath("(//span[text()='iphone max']/..//span[contains(text(),'₹')])[1]")).click();
}
}
